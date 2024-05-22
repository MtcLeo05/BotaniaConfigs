package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ServerConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.flower.functional.OrechidIgnemBlockEntity;

@Mixin(OrechidIgnemBlockEntity.class)
public class OrechidIgnemMixin {

    /**
     * @author MtcLeo05
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getCost(){
        return ServerConfig.ORECHID_IGNEM_COST.get();
    }
}
