package com.mtcleo05.botania_editor.client.wthit;

import mcp.mobius.waila.api.*;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vazkii.botania.api.internal.ManaBurst;
import vazkii.botania.common.block.block_entity.mana.ManaSpreaderBlockEntity;

@OnlyIn(Dist.CLIENT)
public enum AdvancedSpreaderComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    @Override
    public void appendTail(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
        try{
            ManaSpreaderBlockEntity manaSpreaderEntity = accessor.getBlockEntity();
            ManaBurst burstSim = manaSpreaderEntity.runBurstSimulation();

            tooltip.addLine(Component.translatable("botania_editor.burst_info",
                burstSim.getMana()));
            tooltip.addLine(Component.translatable("botania_editor.loss_info",
                burstSim.getManaLossPerTick()));

        } catch (Exception ignored){}
    }
}
