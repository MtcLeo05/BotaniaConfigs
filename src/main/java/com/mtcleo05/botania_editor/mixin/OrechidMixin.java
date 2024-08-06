package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.FunctioningFloraConfig;
import com.mtcleo05.botania_editor.config.server.SpreaderConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.botania.common.block.flower.functional.OrechidBlockEntity;
import vazkii.botania.xplat.XplatAbstractions;

@Mixin(OrechidBlockEntity.class)
public class OrechidMixin {

    /**
     * @author Leo
     * @reason Configurable cost
     */
    @Overwrite(remap = false)
    public int getCost(){
        return XplatAbstractions.INSTANCE.gogLoaded() ? FunctioningFloraConfig.ORECHID_COST_GOG.get() : FunctioningFloraConfig.ORECHID_COST.get();
    }

    /**
     * @author Leo
     * @reason Configurable delay
     */
    @Overwrite(remap = false)
    public int getDelay(){
        return XplatAbstractions.INSTANCE.gogLoaded() ? FunctioningFloraConfig.ORECHID_DELAY_GOG.get() : FunctioningFloraConfig.ORECHID_DELAY.get();
    }

    /**
     * @author Leo
     * @reason Configurable range
     */
    @Overwrite(remap = false)
    public int getRange() {
        return FunctioningFloraConfig.ORECHID_RANGE.get();
    }

    /**
     * @author Leo
     * @reason Configurable vertical range
     */
    @Overwrite(remap = false)
    public int getRangeY() {
        return FunctioningFloraConfig.ORECHID_RANGE_Y.get();
    }

}
