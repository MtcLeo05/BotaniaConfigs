package com.mtcleo05.botania_editor.client.wthit;

import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.common.block.block_entity.mana.ManaPoolBlockEntity;

@OnlyIn(Dist.CLIENT)
public enum ManaPoolComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTail(ITooltip iTooltip, IBlockAccessor blockAccessor, IPluginConfig config) {
        ManaPoolBlockEntity manaPoolBlockEntity = blockAccessor.getBlockEntity();
        iTooltip.addLine(Component.translatable("botania_editor.mana_display", manaPoolBlockEntity.getCurrentMana(), manaPoolBlockEntity.getMaxMana()));
    }
}
