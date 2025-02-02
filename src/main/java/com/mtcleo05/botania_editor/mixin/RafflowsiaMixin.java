package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.NarslimmusBlockEntity;
import vazkii.botania.common.block.flower.generating.RafflowsiaBlockEntity;

@Mixin(RafflowsiaBlockEntity.class)
public class RafflowsiaMixin {

    @ModifyArg(
        remap = false,
        method = "tickFlower",
        at = @At(value = "INVOKE", target = "Lvazkii/botania/common/block/flower/generating/RafflowsiaBlockEntity;addMana(I)V")
    )
    public int manaMult(int mana){
        return (int) (mana * GeneratingFloraConfig.RAFFLOWSIA_MULT.get());
    }
}
