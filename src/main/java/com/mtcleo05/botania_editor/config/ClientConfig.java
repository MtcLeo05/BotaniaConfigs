package com.mtcleo05.botania_editor.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_MANA_TOOLTIP;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_ADVANCED_TOOLTIP;

    static {

        BUILDER.push("Jade Config");

        SHOULD_SHOW_MANA_TOOLTIP =
            BUILDER.comment("Should jade show botania information?")
                .define("Should show mana tooltip", true);

        SHOULD_SHOW_ADVANCED_TOOLTIP =
            BUILDER.comment("Should jade show advanced configs?")
                .comment("For example how much mana does a spreader pass each burst")
                .comment("This config is useless if [Should Show Mana Tooltip] is false")
                .define("Should show advanced tooltip", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
