package com.mtcleo05.botania_editor.config.server;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeneratingFloraConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> ENDOFLAME_PROD;

    public static final ForgeConfigSpec.ConfigValue<Integer> HYDROANGEAS_TICK;
    public static final ForgeConfigSpec.ConfigValue<Integer> HYDROANGEAS_PROD;

    public static final ForgeConfigSpec.ConfigValue<Integer> THERMALILY_PROD;

    public static final ForgeConfigSpec.ConfigValue<Integer> ROSA_ARCANA_ORB_PROD;
    public static final ForgeConfigSpec.ConfigValue<Integer> ROSA_ARCANA_PROD;

    public static final ForgeConfigSpec.ConfigValue<Integer> MUNCHDEW_MANA;
    public static final ForgeConfigSpec.ConfigValue<Integer> MUNCHDEW_RANGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> MUNCHDEW_RANGE_Y;

    public static final ForgeConfigSpec.ConfigValue<Integer> ENTROPINNYUM_PROD;

    public static final ForgeConfigSpec.ConfigValue<Integer> KEKIMURUS_PROD;

    static {
        BUILDER.push("Endoflame Config");

        ENDOFLAME_PROD =
            BUILDER.comment("Production of endoflame")
                .comment("This is mana each tick, to know how much mana/sec multiply by 20 [3]")
                .defineInRange("Endoflame Production", 3, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Hydroangeas / Thermalily Config");

        HYDROANGEAS_TICK =
            BUILDER.comment("Hydroangeas duration")
                .comment("How many ticks should hydroangeas last [72000]")
                .comment("Put a value equal or below 0 to disable it")
                .define("Hydroangeas Ticks", 72000);

        HYDROANGEAS_PROD =
            BUILDER.comment("Hydroangeas production")
                .comment("How much mana should it produce each tick [1]")
                .defineInRange("Hydroangeas Production", 1, 1, Integer.MAX_VALUE);

        THERMALILY_PROD =
            BUILDER.comment("Thermalily production")
                .comment("How much mana should it produce each tick [20]")
                .defineInRange("Thermalily Production", 20, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Rosa Arcana Config");

        ROSA_ARCANA_PROD =
            BUILDER.comment("Production of rosa arcana (player exp)")
                .comment("This is mana for each player exp point [50]")
                .defineInRange("Rosa Arcana Production", 50, 1, Integer.MAX_VALUE);

        ROSA_ARCANA_ORB_PROD =
            BUILDER.comment("Production of rosa arcana (exp orb)")
                .comment("This is mana for each orb exp point [50]")
                .defineInRange("Rosa Arcana Orb Production", 50, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Munchdew Config");

        MUNCHDEW_MANA =
            BUILDER.comment("Production of munchdew (per leaf)")
                .comment("This is mana for each eaten leaf [160]")
                .defineInRange("Munchdew Production", 160, 1, Integer.MAX_VALUE);

        MUNCHDEW_RANGE =
            BUILDER.comment("Range of munchdew (horizontal)")
                .comment("The horizontal range of munchdew [8]")
                .defineInRange("Munchdew Range", 8, 1, Integer.MAX_VALUE);

        MUNCHDEW_RANGE_Y =
            BUILDER.comment("Range of munchdew (vertical)")
                .comment("The vertical range of munchdew [16]")
                .defineInRange("Munchdew Range Y", 16, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Entropinnyum Config");

        ENTROPINNYUM_PROD =
            BUILDER.comment("Production of entropinnyum")
                .comment("How much mana entropinnyum produces each explosion (also defines max mana) [6500]")
                .defineInRange("Entropinnyum Prod", 6500, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Kekimurus Config");

        KEKIMURUS_PROD =
            BUILDER.comment("Production of kekimurus")
                .comment("How much mana kekimurus produces each slice [1800]")
                .defineInRange("Kekimurus Prod", 1800, 1, Integer.MAX_VALUE);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
