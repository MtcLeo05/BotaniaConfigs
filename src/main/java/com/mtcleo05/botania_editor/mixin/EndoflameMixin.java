package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import com.mtcleo05.botania_editor.config.server.SpreaderConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import vazkii.botania.common.block.flower.generating.EndoflameBlockEntity;

@Mixin(EndoflameBlockEntity.class)
public class EndoflameMixin{

    @ModifyArg(remap = false, method = "tickFlower", at = @At(value = "INVOKE", target = "Lvazkii/botania/common/block/flower/generating/EndoflameBlockEntity;addMana(I)V"))
    public int changeManaTick(int mana){
        return GeneratingFloraConfig.ENDOFLAME_PROD.get();
    }

}
