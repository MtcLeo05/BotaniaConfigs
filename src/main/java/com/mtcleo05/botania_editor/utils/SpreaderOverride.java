package com.mtcleo05.botania_editor.utils;

import com.mtcleo05.botania_editor.config.CommonConfig;
import vazkii.botania.common.block.mana.ManaSpreaderBlock;

import java.lang.reflect.Field;

public class SpreaderOverride {


    //Yes I know, reflection bad, but idk what else to use
    public static void changeMana() throws NoSuchFieldException, IllegalAccessException {
        Class<?> spreaderVariant = ManaSpreaderBlock.Variant.class;

        Field manaField = spreaderVariant.getDeclaredField("MANA");
        manaField.setAccessible(true);

        ManaSpreaderBlock.Variant mana = (ManaSpreaderBlock.Variant) manaField.get(null);

        Field burstMana = mana.getClass().getField("burstMana");
        burstMana.setAccessible(true);
        burstMana.setInt(mana, CommonConfig.MANA_SPREADER_BURST_MANA.get());

        Field manaCapacity = mana.getClass().getField("manaCapacity");
        manaCapacity.setAccessible(true);
        manaCapacity.setInt(mana, CommonConfig.MANA_SPREADER_MAX_MANA.get());

        Field color = mana.getClass().getField("color");
        color.setAccessible(true);
        color.setInt(mana, hexToColor(CommonConfig.MANA_SPREADER_BURST_COLOR.get()));

        Field hudColor = mana.getClass().getField("hudColor");
        hudColor.setAccessible(true);
        hudColor.setInt(mana, hexToColor(CommonConfig.MANA_SPREADER_HUD_COLOR.get()));

        Field preLossTick = mana.getClass().getField("preLossTicks");
        preLossTick.setAccessible(true);
        preLossTick.setInt(mana, CommonConfig.MANA_SPREADER_PRE_LOSS_TICK.get());

        Field lossPerTick = mana.getClass().getField("lossPerTick");
        lossPerTick.setAccessible(true);
        lossPerTick.setFloat(mana,
            CommonConfig.MANA_SPREADER_LOSS_TICK.get()
        );

        Field motionModifier = mana.getClass().getField("motionModifier");
        motionModifier.setAccessible(true);
        motionModifier.setFloat(mana,
            CommonConfig.MANA_SPREADER_BURST_SPEED.get()
        );
    }

    public static void changeRedstone() throws NoSuchFieldException, IllegalAccessException {
        Class<?> spreaderVariant = ManaSpreaderBlock.Variant.class;

        Field redstoneField = spreaderVariant.getDeclaredField("REDSTONE");
        redstoneField.setAccessible(true);

        ManaSpreaderBlock.Variant redstone = (ManaSpreaderBlock.Variant) redstoneField.get(null);

        Field burstMana = redstone.getClass().getField("burstMana");
        burstMana.setAccessible(true);
        burstMana.setInt(redstone, CommonConfig.REDSTONE_SPREADER_BURST_MANA.get());

        Field manaCapacity = redstone.getClass().getField("manaCapacity");
        manaCapacity.setAccessible(true);
        manaCapacity.setInt(redstone, CommonConfig.REDSTONE_SPREADER_MAX_MANA.get());

        Field color = redstone.getClass().getField("color");
        color.setAccessible(true);
        color.setInt(redstone, hexToColor(CommonConfig.REDSTONE_SPREADER_BURST_COLOR.get()));

        Field hudColor = redstone.getClass().getField("hudColor");
        hudColor.setAccessible(true);
        hudColor.setInt(redstone, hexToColor(CommonConfig.REDSTONE_SPREADER_HUD_COLOR.get()));

        Field preLossTick = redstone.getClass().getField("preLossTicks");
        preLossTick.setAccessible(true);
        preLossTick.setInt(redstone, CommonConfig.REDSTONE_SPREADER_PRE_LOSS_TICK.get());

        Field lossPerTick = redstone.getClass().getField("lossPerTick");
        lossPerTick.setAccessible(true);
        lossPerTick.setFloat(redstone,
                Float.valueOf(CommonConfig.REDSTONE_SPREADER_LOSS_TICK.get()))
        ;

        Field motionModifier = redstone.getClass().getField("motionModifier");
        motionModifier.setAccessible(true);
        motionModifier.setFloat(redstone,
                Float.valueOf(CommonConfig.REDSTONE_SPREADER_BURST_SPEED.get())
        );
    }

    public static void changeElven() throws NoSuchFieldException, IllegalAccessException {
        Class<?> spreaderVariant = ManaSpreaderBlock.Variant.class;

        Field elvenField = spreaderVariant.getDeclaredField("ELVEN");
        elvenField.setAccessible(true);

        ManaSpreaderBlock.Variant elven = (ManaSpreaderBlock.Variant) elvenField.get(null);

        Field burstMana = elven.getClass().getField("burstMana");
        burstMana.setAccessible(true);
        burstMana.setInt(elven, CommonConfig.ELVEN_SPREADER_BURST_MANA.get());

        Field manaCapacity = elven.getClass().getField("manaCapacity");
        manaCapacity.setAccessible(true);
        manaCapacity.setInt(elven, CommonConfig.ELVEN_SPREADER_MAX_MANA.get());

        Field color = elven.getClass().getField("color");
        color.setAccessible(true);
        color.setInt(elven, hexToColor(CommonConfig.ELVEN_SPREADER_BURST_COLOR.get()));

        Field hudColor = elven.getClass().getField("hudColor");
        hudColor.setAccessible(true);
        hudColor.setInt(elven, hexToColor(CommonConfig.ELVEN_SPREADER_HUD_COLOR.get()));

        Field preLossTick = elven.getClass().getField("preLossTicks");
        preLossTick.setAccessible(true);
        preLossTick.setInt(elven, CommonConfig.ELVEN_SPREADER_PRE_LOSS_TICK.get());

        Field lossPerTick = elven.getClass().getField("lossPerTick");
        lossPerTick.setAccessible(true);
        lossPerTick.setFloat(elven,
                Float.valueOf(CommonConfig.ELVEN_SPREADER_LOSS_TICK.get())
        );

        Field motionModifier = elven.getClass().getField("motionModifier");
        motionModifier.setAccessible(true);
        motionModifier.setFloat(elven,
                Float.valueOf(CommonConfig.ELVEN_SPREADER_BURST_SPEED.get())
        );
    }

    public static void changeGaia() throws NoSuchFieldException, IllegalAccessException {
        Class<?> spreaderVariant = ManaSpreaderBlock.Variant.class;

        Field gaiaField = spreaderVariant.getDeclaredField("GAIA");
        gaiaField.setAccessible(true);

        ManaSpreaderBlock.Variant gaia = (ManaSpreaderBlock.Variant) gaiaField.get(null);

        Field burstMana = gaia.getClass().getField("burstMana");
        burstMana.setAccessible(true);
        burstMana.setInt(gaia, CommonConfig.GAIA_SPREADER_BURST_MANA.get());

        Field manaCapacity = gaia.getClass().getField("manaCapacity");
        manaCapacity.setAccessible(true);
        manaCapacity.setInt(gaia, CommonConfig.GAIA_SPREADER_MAX_MANA.get());

        Field color = gaia.getClass().getField("color");
        color.setAccessible(true);
        color.setInt(gaia, hexToColor(CommonConfig.GAIA_SPREADER_BURST_COLOR.get()));

        Field hudColor = gaia.getClass().getField("hudColor");
        hudColor.setAccessible(true);
        hudColor.setInt(gaia, hexToColor(CommonConfig.GAIA_SPREADER_HUD_COLOR.get()));

        Field preLossTick = gaia.getClass().getField("preLossTicks");
        preLossTick.setAccessible(true);
        preLossTick.setInt(gaia, CommonConfig.GAIA_SPREADER_PRE_LOSS_TICK.get());

        Field lossPerTick = gaia.getClass().getField("lossPerTick");
        lossPerTick.setAccessible(true);
        lossPerTick.setFloat(gaia,
                Float.valueOf(CommonConfig.GAIA_SPREADER_LOSS_TICK.get())
        );

        Field motionModifier = gaia.getClass().getField("motionModifier");
        motionModifier.setAccessible(true);
        motionModifier.setFloat(gaia,
                Float.valueOf(CommonConfig.GAIA_SPREADER_BURST_SPEED.get())
        );
    }



    public static void setupSpreaders() throws NoSuchFieldException, IllegalAccessException {
        changeMana();
        changeRedstone();
        changeElven();
        changeGaia();
    }

    public static int hexToColor(String hexColor) {
        return Integer.parseInt(hexColor.replaceFirst("#", ""), 16);
    }

}
