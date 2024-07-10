package com.mtcleo05.botania_editor.client.jade;

import com.mtcleo05.botania_editor.BotaniaEditor;
import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.utils.JadeUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec2;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.IElement;
import snownee.jade.api.ui.IElementHelper;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;
import vazkii.botania.common.item.BotaniaItems;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public enum GeneratingFlowerComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    private static final ResourceLocation UID = new ResourceLocation(BotaniaEditor.MODID, "botania_flower");

    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
        try{
            GeneratingFlowerBlockEntity generatingFlowerEntity = (GeneratingFlowerBlockEntity) blockAccessor.getBlockEntity();

            if(generatingFlowerEntity != null){
                IElementHelper elements = iTooltip.getElementHelper();
                IElement icon = elements.item(new ItemStack(BotaniaItems.spark), 0.5f).size(new Vec2(10, 10)).translate(new Vec2(0, -1));
                icon.message(null);
                iTooltip.add(icon);
                iTooltip.append(Component.translatable("botania_editor.mana_display", generatingFlowerEntity.getMana(), generatingFlowerEntity.getMaxMana()));

                if(ClientConfig.SHOULD_SHOW_ADVANCED_TOOLTIP.get()){
                    if(JadeUtils.JADE_FLOWER_MAP.containsKey(generatingFlowerEntity.getClass())){
                        List<Component> configs = JadeUtils.JADE_FLOWER_MAP.get(generatingFlowerEntity.getClass());
                        configs.forEach(iTooltip::add);
                    }
                }
            }
        } catch (Exception ignored){}
    }


    @Override
    public ResourceLocation getUid() {
        return UID;
    }

}
