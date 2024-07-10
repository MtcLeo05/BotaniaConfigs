package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ServerConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.RosaArcanaBlockEntity;

@Mixin(RosaArcanaBlockEntity.class)
public class RosaArcanaMixin {

    @ModifyArg(remap = false, method = "tickFlower", at = @At(value = "INVOKE", ordinal = 0,target = "Lvazkii/botania/common/block/flower/generating/RosaArcanaBlockEntity;addMana(I)V"))
    public int changeManaPerOrb(int mana){
        return (mana / 50) * ServerConfig.ROSA_ARCANA_ORB_PROD.get();
    }

    @ModifyArg(remap = false, method = "tickFlower", at = @At(value = "INVOKE", ordinal = 1,target = "Lvazkii/botania/common/block/flower/generating/RosaArcanaBlockEntity;addMana(I)V"))
    public int changeMana(int mana){
        return ServerConfig.ROSA_ARCANA_PROD.get();
    }

}
