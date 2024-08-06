package com.mtcleo05.botania_editor.config.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class SpreaderConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> MANA_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> MANA_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> MANA_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> MANA_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> MANA_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> REDSTONE_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> REDSTONE_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> REDSTONE_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> REDSTONE_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> ELVEN_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> ELVEN_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELVEN_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> ELVEN_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> ELVEN_SPREADER_BURST_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_BURST_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_MAX_MANA;
    public static final ForgeConfigSpec.ConfigValue<String> GAIA_SPREADER_BURST_COLOR;
    public static final ForgeConfigSpec.ConfigValue<String> GAIA_SPREADER_HUD_COLOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAIA_SPREADER_PRE_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> GAIA_SPREADER_LOSS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Double> GAIA_SPREADER_BURST_SPEED;

    static {
        BUILDER.push("Mana Spreader Config");

        MANA_SPREADER_BURST_MANA =
            BUILDER.comment("How much mana should the spreader pass each burst")
                .comment("Default [160]")
                .defineInRange("Mana each burst", 160, 0, Integer.MAX_VALUE);
        MANA_SPREADER_MAX_MANA =
            BUILDER.comment("How much mana can the spreader contain")
                .comment("Default [1000]")
                .defineInRange("Max mana", 1000, 0, Integer.MAX_VALUE);
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
                .defineInRange("Pre loss tick", 60, 0, Integer.MAX_VALUE);
        MANA_SPREADER_LOSS_TICK =
            BUILDER.comment("How much mana should be lost each tick after the PreLossTick expires")
                .comment("Default [4.0]")
                .defineInRange("Loss tick", 4.0d, 0, Double.MAX_VALUE);
        MANA_SPREADER_BURST_SPEED =
            BUILDER.comment("The speed of the mana burst")
                .comment("Values to high can break stuff")
                .comment("Default [1.0]")
                .defineInRange("Burst speed", 1.0d, 0, Double.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Redstone Mana Spreader Config");

        REDSTONE_SPREADER_BURST_MANA =
            BUILDER.comment("How much mana should the spreader pass each burst")
                .comment("Default [160]")
                .defineInRange("Mana each burst", 160, 0, Integer.MAX_VALUE);
        REDSTONE_SPREADER_MAX_MANA =
            BUILDER.comment("How much mana can the spreader contain")
                .comment("Default [1000]")
                .defineInRange("Max mana", 1000, 0, Integer.MAX_VALUE);
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
                .defineInRange("Pre loss tick", 60, 0, Integer.MAX_VALUE);
        REDSTONE_SPREADER_LOSS_TICK =
            BUILDER.comment("How much mana should be lost each tick after the PreLossTick expires")
                .comment("Default [4.0]")
                .defineInRange("Loss tick", 4.0d, 0, Double.MAX_VALUE);
        REDSTONE_SPREADER_BURST_SPEED =
            BUILDER.comment("The speed of the mana burst")
                .comment("Values to high can break stuff")
                .comment("Default [1.0]")
                .defineInRange("Burst speed", 1.0d, 0, Double.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Elven Mana Spreader Config");

        ELVEN_SPREADER_BURST_MANA =
            BUILDER.comment("How much mana should the spreader pass each burst")
                .comment("Default [240]")
                .defineInRange("Mana each burst", 240, 0, Integer.MAX_VALUE);
        ELVEN_SPREADER_MAX_MANA =
            BUILDER.comment("How much mana can the spreader contain")
                .comment("Default [1000]")
                .defineInRange("Max mana", 1000, 0, Integer.MAX_VALUE);
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
                .defineInRange("Pre loss tick", 80, 0, Integer.MAX_VALUE);
        ELVEN_SPREADER_LOSS_TICK =
            BUILDER.comment("How much mana should be lost each tick after the PreLossTick expires")
                .comment("Default [4.0]")
                .defineInRange("Loss tick", 4.0d, 0, Double.MAX_VALUE);
        ELVEN_SPREADER_BURST_SPEED =
            BUILDER.comment("The speed of the mana burst")
                .comment("Values to high can break stuff")
                .comment("Default [1.0]")
                .defineInRange("Burst speed", 1.25d, 0, Double.MAX_VALUE);
        BUILDER.pop();

        BUILDER.push("Gaia Mana Spreader Config");

        GAIA_SPREADER_BURST_MANA =
            BUILDER.comment("How much mana should the spreader pass each burst")
                .comment("Default [640]")
                .defineInRange("Mana each burst", 640, 0, Integer.MAX_VALUE);
        GAIA_SPREADER_MAX_MANA =
            BUILDER.comment("How much mana can the spreader contain")
                .comment("Default [6400]")
                .defineInRange("Max mana", 6400, 0, Integer.MAX_VALUE);
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
                .defineInRange("Pre loss tick", 120, 0, Integer.MAX_VALUE);
        GAIA_SPREADER_LOSS_TICK =
            BUILDER.comment("How much mana should be lost each tick after the PreLossTick expires")
                .comment("Default [20.0]")
                .defineInRange("Loss tick", 20.0d, 0, Double.MAX_VALUE);
        GAIA_SPREADER_BURST_SPEED =
            BUILDER.comment("The speed of the mana burst")
                .comment("Values to high can break stuff")
                .comment("Default [1.0]")
                .defineInRange("Burst speed", 1.0d, 0, Double.MAX_VALUE);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
