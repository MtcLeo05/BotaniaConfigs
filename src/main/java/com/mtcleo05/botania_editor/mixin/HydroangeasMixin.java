package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.CommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import org.checkerframework.common.aliasing.qual.Unique;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import vazkii.botania.common.block.flower.generating.FluidGeneratorBlockEntity;
import vazkii.botania.common.block.flower.generating.HydroangeasBlockEntity;

@Mixin(HydroangeasBlockEntity.class)
public class HydroangeasMixin extends FluidGeneratorBlockEntity {

    @Shadow(remap = false)
    private int passiveDecayTicks;



    protected HydroangeasMixin(BlockEntityType<?> type, BlockPos pos, BlockState state, TagKey<Fluid> consumedFluid, int startBurnTime, int manaPerTick) {
        super(type, pos, state, consumedFluid, startBurnTime, manaPerTick);
    }

    /**
     * @author MtcLeo05
     * @reason Configurable decay
     */
    @Overwrite(remap = false)
    public void tickFlower() {
        super.tickFlower();

        if(CommonConfig.HYDROANGEAS_TICK.get() > 0){
            if (!this.getLevel().isClientSide && ++this.passiveDecayTicks > CommonConfig.HYDROANGEAS_TICK.get()) {
                this.getLevel().destroyBlock(this.getBlockPos(), false);
                if (Blocks.DEAD_BUSH.defaultBlockState().canSurvive(this.getLevel(), this.getBlockPos())) {
                    this.getLevel().setBlockAndUpdate(this.getBlockPos(), Blocks.DEAD_BUSH.defaultBlockState());
                }
            }
        }
    }

    @Shadow(remap = false)
    public int getMaxMana() {
        return 0;
    }

    @Shadow(remap = false)
    public int getColor() {
        return 5451744;
    }

    @Shadow(remap = false)
    public int getCooldownTime(boolean b) {
        return 0;
    }

    @Shadow(remap = false)
    public void doBurnParticles() {}

    @Shadow(remap = false)
    public void playSound() {}

}
