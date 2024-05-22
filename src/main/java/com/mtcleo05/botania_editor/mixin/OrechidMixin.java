package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ServerConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.flower.functional.OrechidBlockEntity;
import vazkii.botania.xplat.XplatAbstractions;

@Mixin(OrechidBlockEntity.class)
public class OrechidMixin {

    /**
     * @author MtcLeo05
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getCost(){
        return XplatAbstractions.INSTANCE.gogLoaded() ? ServerConfig.ORECHID_COST_GOG.get() : ServerConfig.ORECHID_COST.get();
    }

    /**
     * @author MtcLeo05
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getDelay(){
        return XplatAbstractions.INSTANCE.gogLoaded() ? ServerConfig.ORECHID_DELAY_GOG.get() : ServerConfig.ORECHID_DELAY.get();
    }

    /**
     * @author MtcLeo05
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getRange() {
        return ServerConfig.ORECHID_RANGE.get();
    }

    /**
     * @author MtcLeo05
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getRangeY() {
        return ServerConfig.ORECHID_RANGE_Y.get();
    }

}
