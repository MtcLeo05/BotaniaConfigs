package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import vazkii.botania.api.mana.ManaPool;
import vazkii.botania.common.item.BlackLotusItem;
import vazkii.botania.common.item.BotaniaItems;

@Mixin(BlackLotusItem.class)
public class LotusMixin {

    @Unique
    boolean isBlacker = false;

    @Inject(remap = false, method = "onDissolveTick", at = @At(value = "INVOKE", target = "Lvazkii/botania/api/mana/ManaPool;receiveMana(I)V"))
    public void getBlacker(ManaPool pool, ItemEntity item, CallbackInfo ci){
        isBlacker = item.getItem().is(BotaniaItems.blackerLotus);
    }

    @ModifyArg(remap = false, method = "onDissolveTick", at = @At(value = "INVOKE", target = "Lvazkii/botania/api/mana/ManaPool;receiveMana(I)V"))
    public int changeLotusMana(int old){
        return isBlacker ? ServerConfig.BLACKER_LOTUS_MANA.get() : ServerConfig.BLACK_LOTUS_MANA.get();
    }

}
