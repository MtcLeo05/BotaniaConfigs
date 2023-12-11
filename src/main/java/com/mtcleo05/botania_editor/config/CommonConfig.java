package com.mtcleo05.botania_editor.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_MANA_TOOLTIP;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_ADVANCED_TOOLTIP;

    public static final ForgeConfigSpec.ConfigValue<Integer> ENDOFLAME_PROD;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_COST_GOG;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_DELAY;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_DELAY_GOG;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_RANGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_RANGE_Y;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORECHID_IGNEM_COST;


    static {
        BUILDER.push("Non reloadable configs");
        BUILDER.comment("These configs require a game restart");

        SHOULD_SHOW_MANA_TOOLTIP =
                BUILDER.comment("Should jade show how much mana the pool has?")
                        .define("Should Show Mana Tooltip", true);

        SHOULD_SHOW_ADVANCED_TOOLTIP =
                BUILDER.comment("Should jade show advanced configs?")
                        .comment("For example how much mana does a spreader pass each burst")
                        .comment("This config is useless if [Should Show Mana Tooltip] is false")
                        .define("Should Show Advanced Tooltip", true);

        BUILDER.pop();
        BUILDER.push("Reloadable configs");
        BUILDER.comment("These configs require the /reload command to be executed");

        ENDOFLAME_PROD =
                BUILDER.comment("Production of endoflame")
                        .comment("This is mana each tick, to know how much mana/sec multiply by 20 [5]")
                        .defineInRange("Endoflame Production", 5, 1, 100);

        ORECHID_COST =
                BUILDER.comment("Cost of orechid each block")
                        .comment("How much mana should orechid consume each block [17500]")
                        .defineInRange("Orechid Cost", 5, 1, 100000000);

        ORECHID_COST_GOG =
                BUILDER.comment("Cost of orechid each block in garden of glass")
                        .comment("How much mana should orechid consume each block, when in a garden of glass word [700]")
                        .comment("Usually this cost is lower than the normal, but it's not a rule")
                        .defineInRange("Orechid Cost GOG", 700, 1, 100000000);
        ORECHID_DELAY =
                BUILDER.comment("Ticks between a block conversion and the other")
                        .comment("How much time should the orechid wait before attempting to convert another block [100]")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid Delay", 2, 1, 100000000);

        ORECHID_DELAY_GOG =
                BUILDER.comment("Ticks between a block conversion and the other in garden of glass")
                        .comment("How much time should the orechid wait before attempting to convert another block, when in a garden of glass word [2]")
                        .comment("Usually this delay is lower than the normal, but it's not a rule")
                        .defineInRange("Orechid Delay GOG", 2, 1, 100000000);

        ORECHID_RANGE =
                BUILDER.comment("Horizontal range of orechid")
                        .comment("The range of the square where the orechid checks if there are convertible blocks [5]")
                        .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid Range", 5, 1, 100);
        ORECHID_RANGE_Y =
                BUILDER.comment("Vertical range of orechid")
                        .comment("The height of the cube where the orechid checks if there are convertible blocks [3]")
                        .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid Range Y", 3, 1, 100);

        ORECHID_IGNEM_COST =
                BUILDER.comment("Cost of orechid ignem each block")
                        .comment("How much mana should orechid ignem consume each block [20000]")
                        .defineInRange("Orechid Ignem Cost", 20000, 1, 100000000);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
