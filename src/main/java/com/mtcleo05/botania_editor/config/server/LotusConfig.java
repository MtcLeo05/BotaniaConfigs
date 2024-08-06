package com.mtcleo05.botania_editor.config.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class LotusConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> BLACK_LOTUS_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> BLACKER_LOTUS_MANA;

    static {
        BUILDER.push("Lotus Config");

        BLACK_LOTUS_MANA =
            BUILDER.comment("Mana each black lotus")
                .comment("How much mana should the black lotus give [8000]")
                .define("Black Lotus Mana", 8000);

        BLACKER_LOTUS_MANA =
            BUILDER.comment("Mana each blacker lotus")
                .comment("How much mana should the blacker lotus give [100000]")
                .define("Blacker Lotus Mana", 100000);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
