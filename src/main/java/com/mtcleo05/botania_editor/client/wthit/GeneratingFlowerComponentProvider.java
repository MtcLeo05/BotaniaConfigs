package com.mtcleo05.botania_editor.client.wthit;

import com.mtcleo05.botania_editor.config.CommonConfig;
import com.mtcleo05.botania_editor.utils.JadeUtils;
import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeConfigSpec;
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

                if(CommonConfig.SHOULD_SHOW_ADVANCED_TOOLTIP.get()){
                    if(JadeUtils.JADE_FLOWER_MAP.containsKey(generatingFlowerEntity.getClass())){

                        List<ForgeConfigSpec.ConfigValue<?>> configs = JadeUtils.JADE_FLOWER_MAP.get(generatingFlowerEntity.getClass());

                        for (int i = 0; i < configs.size(); i++) {
                            if(i == 0){
                                iTooltip.addLine(Component.translatable("botania_editor.prod", configs.get(i).get()));
                            }

                            if(i == 1){
                                iTooltip.addLine(Component.translatable("botania_editor.decay", configs.get(i).get()));
                            }
                        }
                    }
                }
            }
        } catch (Exception ignored){}
    }
}
