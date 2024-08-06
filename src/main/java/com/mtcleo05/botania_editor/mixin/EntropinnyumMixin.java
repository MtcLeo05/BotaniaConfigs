package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.flower.generating.EntropinnyumBlockEntity;

@Mixin(EntropinnyumBlockEntity.class)
public class EntropinnyumMixin {

    /**
     * @author Leo
     * @reason Configurable max mana
     */
    @Overwrite(remap = false)
    public int getMaxMana(){
        return GeneratingFloraConfig.ENTROPINNYUM_PROD.get();
    }

}
