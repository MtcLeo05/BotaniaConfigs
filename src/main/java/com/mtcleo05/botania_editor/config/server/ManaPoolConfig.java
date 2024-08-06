package com.mtcleo05.botania_editor.config.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class ManaPoolConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_POOL_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> DILUTED_MANA_POOL_MAX_MANA;

    static {
        BUILDER.push("Mana Pool Config");

        MANA_POOL_MAX_MANA =
            BUILDER.comment("Mana pool mana")
                .comment("How much mana can a mana pool contain [1000000]")
                .comment("This only affects mana pools placed after the configs is changed!")
                .defineInRange("Mana Pool Max Mana", 1000000, 0, Integer.MAX_VALUE);

        DILUTED_MANA_POOL_MAX_MANA =
            BUILDER.comment("Diluted mana pool mana")
                .comment("How much mana can a diluted mana pool contain [10000]")
                .comment("This only affects mana pools placed after the configs is changed!")
                .defineInRange("Diluted Mana Pool Max Mana", 10000, 0, Integer.MAX_VALUE);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
