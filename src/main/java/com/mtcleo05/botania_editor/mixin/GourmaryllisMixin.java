package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.GourmaryllisBlockEntity;

@Mixin(GourmaryllisBlockEntity.class)
public class GourmaryllisMixin {

    @ModifyArg(
        remap = false,
        method = "tickFlower",
        at = @At(value = "INVOKE", target = "Lvazkii/botania/common/block/flower/generating/GourmaryllisBlockEntity;addMana(I)V")
    )
    public int manaMult(int mana){
        return (int) (mana * GeneratingFloraConfig.GOURMARYLLIS_MULT.get());
    }

}
