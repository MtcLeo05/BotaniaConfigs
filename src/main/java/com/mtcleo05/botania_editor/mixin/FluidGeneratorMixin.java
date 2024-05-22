package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;
import vazkii.botania.common.block.flower.generating.FluidGeneratorBlockEntity;
import vazkii.botania.common.block.flower.generating.HydroangeasBlockEntity;

@Mixin(FluidGeneratorBlockEntity.class)
public abstract class FluidGeneratorMixin extends GeneratingFlowerBlockEntity {

    @Mutable
    @Shadow(remap = false) @Final private int manaPerTick;
    @Unique
    boolean isHydroangeas = false;

    public FluidGeneratorMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Inject(remap = false, method = "tickFlower", at = @At(value = "HEAD"))
    public void changeMana(CallbackInfo ci){
       if(!level.isClientSide){
           BlockEntity entity = level.getBlockEntity(this.getBlockPos());

           isHydroangeas = entity instanceof HydroangeasBlockEntity;

           this.manaPerTick = isHydroangeas ? ServerConfig.HYDROANGEAS_PROD.get(): ServerConfig.THERMALILY_PROD.get();
       }
    }
}
