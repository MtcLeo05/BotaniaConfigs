package com.mtcleo05.botania_editor.client.jade;

import com.mtcleo05.botania_editor.BotaniaEditor;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import vazkii.botania.common.block.block_entity.mana.ManaSpreaderBlockEntity;

@OnlyIn(Dist.CLIENT)
public enum AdvancedSpreaderComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    private static final ResourceLocation UID = new ResourceLocation(BotaniaEditor.MODID, "botania_spreader_advanced");

    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
        try{
            ManaSpreaderBlockEntity manaSpreaderEntity = (ManaSpreaderBlockEntity) blockAccessor.getBlockEntity();
            iTooltip.add(Component.translatable("botania_editor.burst_info",
                    manaSpreaderEntity.runBurstSimulation().getMana()));
            iTooltip.add(Component.translatable("botania_editor.loss_info",
                        manaSpreaderEntity.runBurstSimulation().getManaLossPerTick()));
        } catch (Exception ignored){}
    }


    @Override
    public ResourceLocation getUid() {
        return UID;
    }

}
