package com.mtcleo05.botania_editor.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.NarslimmusBlockEntity;

@Mixin(NarslimmusBlockEntity.class)
public class NarslimmusMixin {

    @ModifyArg(
        remap = false,
        method = "tickFlower",
        at = @At(value = "INVOKE", target = "Lvazkii/botania/common/block/flower/generating/NarslimmusBlockEntity;addMana(I)V")
    )
    public int manaMult(int mana){
        return (int) (mana * GeneratingFloraConfig.NARSLIMMUS_MULT.get());
    }
}
