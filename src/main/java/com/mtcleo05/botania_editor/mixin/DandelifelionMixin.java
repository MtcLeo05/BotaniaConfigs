package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.DandelifeonBlockEntity;

@Mixin(DandelifeonBlockEntity.class)
public class DandelifelionMixin {

    @ModifyArg(
        remap = false,
        method = "setBlockForGeneration",
        at = @At(value = "INVOKE", target = "Lvazkii/botania/common/block/flower/generating/DandelifeonBlockEntity;addMana(I)V")
    )
    public int manaMult(int mana){
        return (int) (mana * GeneratingFloraConfig.DANDELIFEON_MULT.get());
    }

}
