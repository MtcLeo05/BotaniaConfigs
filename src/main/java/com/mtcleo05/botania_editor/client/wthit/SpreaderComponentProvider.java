package com.mtcleo05.botania_editor.client.wthit;

import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.common.block.block_entity.mana.ManaSpreaderBlockEntity;

@OnlyIn(Dist.CLIENT)
public enum SpreaderComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendHead(ITooltip iTooltip, IBlockAccessor blockAccessor, IPluginConfig config) {
        try{
            ManaSpreaderBlockEntity manaSpreaderEntity = (ManaSpreaderBlockEntity) blockAccessor.getBlockEntity();
            iTooltip.addLine(Component.translatable("botania_editor.mana_display", manaSpreaderEntity.getCurrentMana(), manaSpreaderEntity.getMaxMana()));
        } catch (Exception ignored){}
    }
}
