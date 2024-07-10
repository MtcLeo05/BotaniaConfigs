package com.mtcleo05.botania_editor.client.wthit;

import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.utils.JadeUtils;
import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public enum GeneratingFlowerComponentProvider implements IBlockComponentProvider {
    INSTANCE;


    @Override
    public void appendHead(ITooltip iTooltip, IBlockAccessor blockAccessor, IPluginConfig config) {
        try{
            GeneratingFlowerBlockEntity generatingFlowerEntity = (GeneratingFlowerBlockEntity) blockAccessor.getBlockEntity();

            if(generatingFlowerEntity != null){
                iTooltip.addLine(Component.translatable("botania_editor.mana_display", generatingFlowerEntity.getMana(), generatingFlowerEntity.getMaxMana()));

                if(ClientConfig.SHOULD_SHOW_ADVANCED_TOOLTIP.get()){
                    if(JadeUtils.JADE_FLOWER_MAP.containsKey(generatingFlowerEntity.getClass())){
                        List<Component> configs = JadeUtils.JADE_FLOWER_MAP.get(generatingFlowerEntity.getClass());
                        configs.forEach(iTooltip::addLine);
                    }
                }
            }
        } catch (Exception ignored){}
    }
}
