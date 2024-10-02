package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.SpectrolusBlockEntity;

@Mixin(SpectrolusBlockEntity.class)
public class SpectrolusMixin {
    @ModifyArg(
        remap = false,
        method = "tickFlower",
        at = @At(value = "INVOKE",
            target = "Lvazkii/botania/common/block/flower/generating/SpectrolusBlockEntity;addManaAndCycle(I)V",
            ordinal = 0
        )
    )
    public int changeSheepMana(int mana){
        return mana == 1 ? GeneratingFloraConfig.SPECTROLUS_BABY_SHEEP_PROD.get(): GeneratingFloraConfig.SPECTROLUS_SHEEP_PROD.get();
    }

    @ModifyArg(
        remap = false,
        method = "tickFlower",
        at = @At(value = "INVOKE",
            target = "Lvazkii/botania/common/block/flower/generating/SpectrolusBlockEntity;addManaAndCycle(I)V",
            ordinal = 1
        )
    )
    public int changeItemMana(int mana){
        return GeneratingFloraConfig.SPECTROLUS_ITEM_PROD.get();
    }
}
