package com.mtcleo05.botania_editor.client.wthit;

import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec2;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.common.block.flower.functional.OrechidBlockEntity;
import vazkii.botania.common.item.BotaniaItems;

@OnlyIn(Dist.CLIENT)
public enum OrechidComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTail(ITooltip iTooltip, IBlockAccessor blockAccessor, IPluginConfig config) {
        try{
            OrechidBlockEntity orechidBlockEntity = blockAccessor.getBlockEntity();

            if(orechidBlockEntity != null){
                iTooltip.addLine(Component.translatable("botania_editor.mana_display", orechidBlockEntity.getMana(), orechidBlockEntity.getMaxMana()));
                iTooltip.addLine(Component.translatable("botania_editor.orechid_stats", orechidBlockEntity.getCost(), orechidBlockEntity.getDelay()));
                iTooltip.addLine(Component.translatable("botania_editor.orechid_range", orechidBlockEntity.getRange(), orechidBlockEntity.getRangeY()));
            }
        }catch (Exception ignored){}
    }
}
