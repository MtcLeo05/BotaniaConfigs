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

    public static final ForgeConfigSpec.ConfigValue<Double> GOURMARYLLIS_MULT;

    public static final ForgeConfigSpec.ConfigValue<Double> NARSLIMMUS_MULT;

    public static final ForgeConfigSpec.ConfigValue<Integer> SPECTROLUS_SHEEP_PROD;
    public static final ForgeConfigSpec.ConfigValue<Integer> SPECTROLUS_BABY_SHEEP_PROD;
    public static final ForgeConfigSpec.ConfigValue<Integer> SPECTROLUS_ITEM_PROD;

    public static final ForgeConfigSpec.ConfigValue<Double> DANDELIFEON_MULT;

    public static final ForgeConfigSpec.ConfigValue<Double> RAFFLOWSIA_MULT;

    public static final ForgeConfigSpec.ConfigValue<Double> SHULKMENOT_MULT;

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

        BUILDER.push("Gourmaryllis Config");

        GOURMARYLLIS_MULT =
            BUILDER.comment("Production multiplier for gourmaryllis")
                .comment("By how much should the mana generated be multiplied [1]")
                .comment("This value is multiplied with the food value to give the final mana")
                .defineInRange("Gourmaryllis Mult", 1, 0, Double.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Narslimmus Config");

        NARSLIMMUS_MULT =
            BUILDER.comment("Production multiplier for narslimmus")
                .comment("By how much should the mana generated be multiplied [1]")
                .comment("This value is multiplied with the original mana given from the slime")
                .defineInRange("Narslimmus Mult", 1, 0, Double.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Spectrolus Config");

        SPECTROLUS_SHEEP_PROD =
            BUILDER.comment("Production each sheep for spectrolus")
                .comment("How much mana should be produced for each sheep sheared [5000]")
                .defineInRange("Spectrolus Sheep Mult", 5000, 0, Integer.MAX_VALUE);

        SPECTROLUS_BABY_SHEEP_PROD =
            BUILDER.comment("Production each baby sheep for spectrolus")
                .comment("How much mana should be produced for each baby sheep sheared [1]")
                .defineInRange("Spectrolus Baby Sheep Mult", 1, 0, Integer.MAX_VALUE);

        SPECTROLUS_ITEM_PROD =
            BUILDER.comment("Production each item for spectrolus")
                .comment("How much mana should be produced for each item [1200]")
                .defineInRange("Spectrolus Item Mult", 1200, 0, Integer.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Dandelifeon Config");

        DANDELIFEON_MULT =
            BUILDER.comment("Production multiplier for dandelifeon")
                .comment("By how much should the mana produced each cell be multiplied [1]")
                .defineInRange("Dandelifeon Mult", 1, 0, Double.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Rafflowsia Config");

        RAFFLOWSIA_MULT =
            BUILDER.comment("Production multiplier for rafflowsia")
                .comment("By how much should the mana produced each flower be multiplied [1]")
                .defineInRange("Rafflowsia Mult", 1, 0, Double.MAX_VALUE);

        BUILDER.pop();

        BUILDER.push("Shulk Me Not Config");

        SHULKMENOT_MULT =
            BUILDER.comment("Production multiplier for shulk me not")
                .comment("By how much should the mana produced each shulker be multiplied [1]")
                .defineInRange("Shulk Me Not Mult", 1, 0, Double.MAX_VALUE);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
