package com.mtcleo05.botania_editor.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_MANA_TOOLTIP;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOULD_SHOW_ADVANCED_TOOLTIP;

    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> MANA_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> MANA_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> MANA_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> MANA_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> REDSTONE_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> REDSTONE_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> REDSTONE_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> REDSTONE_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> ELVEN_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> ELVEN_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> ELVEN_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> ELVEN_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> GAIA_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> GAIA_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> GAIA_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Float> GAIA_SPREADER_BURST_SPEED;


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
                        .define("Should show mana tooltip", true);
        SHOULD_SHOW_ADVANCED_TOOLTIP =
                BUILDER.comment("Should jade show advanced configs?")
                        .comment("For example how much mana does a spreader pass each burst")
                        .comment("This config is useless if [Should Show Mana Tooltip] is false")
                        .define("Should show advanced tooltip", true);
        BUILDER.pop();

        BUILDER.push("Reloadable configs");
        BUILDER.comment("These configs require the /reload command to be executed");

        ENDOFLAME_PROD =
                BUILDER.comment("Production of endoflame")
                        .comment("This is mana each tick, to know how much mana/sec multiply by 20 [5]")
                        .defineInRange("Endoflame production", 5, 1, 100);

        ORECHID_COST =
                BUILDER.comment("Cost of orechid each block")
                        .comment("How much mana should orechid consume each block [17500]")
                        .defineInRange("Orechid cost", 5, 1, 100000000);

        ORECHID_COST_GOG =
                BUILDER.comment("Cost of orechid each block in garden of glass")
                        .comment("How much mana should orechid consume each block, when in a garden of glass word [700]")
                        .comment("Usually this cost is lower than the normal, but it's not a rule")
                        .defineInRange("Orechid cost GOG", 700, 1, 100000000);
        ORECHID_DELAY =
                BUILDER.comment("Ticks between a block conversion and the other")
                        .comment("How much time should the orechid wait before attempting to convert another block [100]")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid delay", 2, 1, 100000000);

        ORECHID_DELAY_GOG =
                BUILDER.comment("Ticks between a block conversion and the other in garden of glass")
                        .comment("How much time should the orechid wait before attempting to convert another block, when in a garden of glass word [2]")
                        .comment("Usually this delay is lower than the normal, but it's not a rule")
                        .defineInRange("Orechid delay GOG", 2, 1, 100000000);

        ORECHID_RANGE =
                BUILDER.comment("Horizontal range of orechid")
                        .comment("The range of the square where the orechid checks if there are convertible blocks [5]")
                        .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid range", 5, 1, 100);
        ORECHID_RANGE_Y =
                BUILDER.comment("Vertical range of orechid")
                        .comment("The height of the cube where the orechid checks if there are convertible blocks [3]")
                        .comment("Increasing this too much could cause lag since a lot of blocks are being checked")
                        .comment("This affects both orechid and orechid ignem")
                        .defineInRange("Orechid range Y", 3, 1, 100);

        ORECHID_IGNEM_COST =
                BUILDER.comment("Cost of orechid ignem each block")
                        .comment("How much mana should orechid ignem consume each block [20000]")
                        .defineInRange("Orechid ignem Cost", 20000, 1, 100000000);

        BUILDER.push("Mana Spreader Config");
        MANA_SPREADER_BURST_MANA =
                BUILDER.comment("How much mana should the spreader pass each burst")
                        .comment("Default [160]")
                        .define("Mana each burst", 160);
        MANA_SPREADER_MAX_MANA =
                BUILDER.comment("How much mana can the spreader contain")
                        .comment("Default [1000]")
                        .define("Max mana", 1000);
        MANA_SPREADER_BURST_COLOR =
                BUILDER.comment("The hexadecimal color of the mana burst")
                        .comment("Putting an invalid color can, and will, break stuff :)")
                        .comment("From what I know it doesn't support opacity")
                        .comment("Default [#20FF20]")
                        .define("Burst color", "#20FF20");
        MANA_SPREADER_HUD_COLOR =
                BUILDER.comment("The hexadecimal color of the mana in the hud")
                        .comment("Same as the burst color, be sure the color is valid")
                        .comment("Default [#00FF00]")
                        .define("HUD color", "#00FF00");
        MANA_SPREADER_PRE_LOSS_TICK =
                BUILDER.comment("How much tick should pass before the burst starts losing mana")
                        .comment("As always 20 ticks => 1 second")
                        .comment("Default [60]")
                        .define("Pre loss tick", 60);
        MANA_SPREADER_LOSS_TICK =
                BUILDER.comment("How much mana should be loss each tick after the PreLossTick expires")
                        .comment("Default [4.0]")
                        .define("Loss tick", 4.0f);
        MANA_SPREADER_BURST_SPEED =
                BUILDER.comment("The speed of the mana burst")
                        .comment("Values to high can break stuff")
                        .comment("Default [1.0]")
                        .define("Burst speed", 1.0f);
        BUILDER.pop();

        BUILDER.push("Redstone Mana Spreader Config");
        REDSTONE_SPREADER_BURST_MANA =
                BUILDER.comment("How much mana should the spreader pass each burst")
                        .comment("Default [160]")
                        .define("Mana each burst", 160);
        REDSTONE_SPREADER_MAX_MANA =
                BUILDER.comment("How much mana can the spreader contain")
                        .comment("Default [1000]")
                        .define("Max mana", 1000);
        REDSTONE_SPREADER_BURST_COLOR =
                BUILDER.comment("The hexadecimal color of the mana burst")
                        .comment("Putting an invalid color can, and will, break stuff :)")
                        .comment("From what I know it doesn't support opacity")
                        .comment("Default [#FF2020]")
                        .define("Burst color", "#FF2020");
        REDSTONE_SPREADER_HUD_COLOR =
                BUILDER.comment("The hexadecimal color of the mana in the hud")
                        .comment("Same as the burst color, be sure the color is valid")
                        .comment("Default [#FF0000]")
                        .define("HUD color", "#FF0000");
        REDSTONE_SPREADER_PRE_LOSS_TICK =
                BUILDER.comment("How much tick should pass before the burst starts losing mana")
                        .comment("As always 20 ticks => 1 second")
                        .comment("Default [60]")
                        .define("Pre loss tick", 60);
        REDSTONE_SPREADER_LOSS_TICK =
                BUILDER.comment("How much mana should be loss each tick after the PreLossTick expires")
                        .comment("Default [4.0]")
                        .define("Loss tick", 4.0f);
        REDSTONE_SPREADER_BURST_SPEED =
                BUILDER.comment("The speed of the mana burst")
                        .comment("Values to high can break stuff")
                        .comment("Default [1.0]")
                        .define("Burst speed", 1.0f);
        BUILDER.pop();

        BUILDER.push("Elven Mana Spreader Config");
        ELVEN_SPREADER_BURST_MANA =
                BUILDER.comment("How much mana should the spreader pass each burst")
                        .comment("Default [240]")
                        .define("Mana each burst", 240);
        ELVEN_SPREADER_MAX_MANA =
                BUILDER.comment("How much mana can the spreader contain")
                        .comment("Default [1000]")
                        .define("Max mana", 1000);
        ELVEN_SPREADER_BURST_COLOR =
                BUILDER.comment("The hexadecimal color of the mana burst")
                        .comment("Putting an invalid color can, and will, break stuff :)")
                        .comment("From what I know it doesn't support opacity")
                        .comment("Default [#FF45C4]")
                        .define("Burst color", "#FF45C4");
        ELVEN_SPREADER_HUD_COLOR =
                BUILDER.comment("The hexadecimal color of the mana in the hud")
                        .comment("Same as the burst color, be sure the color is valid")
                        .comment("Default [#FF00AE]")
                        .define("HUD color", "#FF00AE");
        ELVEN_SPREADER_PRE_LOSS_TICK =
                BUILDER.comment("How much tick should pass before the burst starts losing mana")
                        .comment("As always 20 ticks => 1 second")
                        .comment("Default [80]")
                        .define("Pre loss tick", 80);
        ELVEN_SPREADER_LOSS_TICK =
                BUILDER.comment("How much mana should be loss each tick after the PreLossTick expires")
                        .comment("Default [4.0]")
                        .define("Loss tick", 4.0f);
        ELVEN_SPREADER_BURST_SPEED =
                BUILDER.comment("The speed of the mana burst")
                        .comment("Values to high can break stuff")
                        .comment("Default [1.0]")
                        .define("Burst speed", 1.25f);
        BUILDER.pop();

        BUILDER.push("Gaia Mana Spreader Config");
        GAIA_SPREADER_BURST_MANA =
                BUILDER.comment("How much mana should the spreader pass each burst")
                        .comment("Default [640]")
                        .define("Mana each burst", 640);
        GAIA_SPREADER_MAX_MANA =
                BUILDER.comment("How much mana can the spreader contain")
                        .comment("Default [6400]")
                        .define("Max mana", 6400);
        GAIA_SPREADER_BURST_COLOR =
                BUILDER.comment("The hexadecimal color of the mana burst")
                        .comment("Putting an invalid color can, and will, break stuff :)")
                        .comment("From what I know it doesn't support opacity")
                        .comment("Default [#20FF20]")
                        .define("Burst color", "#20FF20");
        GAIA_SPREADER_HUD_COLOR =
                BUILDER.comment("The hexadecimal color of the mana in the hud")
                        .comment("Same as the burst color, be sure the color is valid")
                        .comment("Default [#00FF00]")
                        .define("HUD color", "#00FF00");
        GAIA_SPREADER_PRE_LOSS_TICK =
                BUILDER.comment("How much tick should pass before the burst starts losing mana")
                        .comment("As always 20 ticks => 1 second")
                        .comment("Default [120]")
                        .define("Pre loss tick", 120);
        GAIA_SPREADER_LOSS_TICK =
                BUILDER.comment("How much mana should be loss each tick after the PreLossTick expires")
                        .comment("Default [20.0]")
                        .define("Loss tick", 20.0f);
        GAIA_SPREADER_BURST_SPEED =
                BUILDER.comment("The speed of the mana burst")
                        .comment("Values to high can break stuff")
                        .comment("Default [1.0]")
                        .define("Burst speed", 2.0f);

        BUILDER.pop(2);
        SPEC = BUILDER.build();
    }

}
