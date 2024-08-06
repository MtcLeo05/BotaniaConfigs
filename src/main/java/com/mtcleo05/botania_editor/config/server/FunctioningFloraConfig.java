package com.mtcleo05.botania_editor.config.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class FunctioningFloraConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_COST_GOG;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_DELAY;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_DELAY_GOG;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_RANGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_RANGE_Y;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_IGNEM_COST;

    static {
        BUILDER.push("Orechid Config");

        ORECHID_COST =
            BUILDER.comment("Cost of orechid each block")
                .comment("How much mana should orechid consume each block [17500]")
                .defineInRange("Orechid cost", 17500, 1, Integer.MAX_VALUE);

        ORECHID_IGNEM_COST =
            BUILDER.comment("Cost of orechid ignem each block")
                .comment("How much mana should orechid ignem consume each block [20000]")
                .defineInRange("Orechid ignem Cost", 20000, 1, Integer.MAX_VALUE);

        ORECHID_COST_GOG =
            BUILDER.comment("Cost of orechid each block in garden of glass")
                .comment("How much mana should orechid consume each block, when in a garden of glass word [700]")
                .comment("Usually this cost is lower than the normal, but it's not a rule")
                .defineInRange("Orechid cost GOG", 700, 1, Integer.MAX_VALUE);

        ORECHID_DELAY =
            BUILDER.comment("Ticks between a block conversion and the other")
                .comment("How much time should the orechid wait before attempting to convert another block [100]")
                .comment("This affects both orechid and orechid ignem")
                .defineInRange("Orechid delay", 100, 1, Integer.MAX_VALUE);

        ORECHID_DELAY_GOG =
            BUILDER.comment("Ticks between a block conversion and the other in garden of glass")
                .comment("How much time should the orechid wait before attempting to convert another block, when in a garden of glass word [2]")
                .comment("Usually this delay is lower than the normal, but it's not a rule")
                .defineInRange("Orechid delay GOG", 2, 1, Integer.MAX_VALUE);

        ORECHID_RANGE =
            BUILDER.comment("Horizontal range of orechid")
                .comment("The range of the square where the orechid checks if there are convertible blocks [5]")
                .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                .comment("This affects both orechid and orechid ignem")
                .defineInRange("Orechid range", 5, 1, Integer.MAX_VALUE);

        ORECHID_RANGE_Y =
            BUILDER.comment("Vertical range of orechid")
                .comment("The height of the cube where the orechid checks if there are convertible blocks [3]")
                .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                .comment("This affects both orechid and orechid ignem")
                .defineInRange("Orechid range Y", 3, 1, Integer.MAX_VALUE);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
