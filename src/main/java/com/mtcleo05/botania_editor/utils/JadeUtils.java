package com.mtcleo05.botania_editor.utils;

import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraft.network.chat.Component;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;
import vazkii.botania.common.block.flower.generating.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JadeUtils {

    public static final Map<Class<? extends GeneratingFlowerBlockEntity>, List<Component>> JADE_FLOWER_MAP = new HashMap<>();

    static {
        JADE_FLOWER_MAP.put(
            EndoflameBlockEntity.class,
            List.of(
                Component.translatable("botania_editor.prod", ServerConfig.ENDOFLAME_PROD.get())
            )
        );

        JADE_FLOWER_MAP.put(
            HydroangeasBlockEntity.class,
            List.of(
                Component.translatable("botania_editor.prod", ServerConfig.HYDROANGEAS_PROD.get()),
                Component.translatable("botania_editor.decay", ServerConfig.HYDROANGEAS_TICK.get())
            )
        );

        JADE_FLOWER_MAP.put(
            ThermalilyBlockEntity.class,
            List.of(
                Component.translatable("botania_editor.prod", ServerConfig.THERMALILY_PROD.get())
            )
        );

        JADE_FLOWER_MAP.put(
            RosaArcanaBlockEntity.class,
            List.of(
                Component.translatable("botania_editor.prodOrb", ServerConfig.ROSA_ARCANA_ORB_PROD.get()),
                Component.translatable("botania_editor.prodExp", ServerConfig.ROSA_ARCANA_PROD.get())
            )
        );

        JADE_FLOWER_MAP.put(
            MunchdewBlockEntity.class,
            List.of(
                Component.translatable("botania_editor.prod", ServerConfig.MUNCHDEW_MANA.get()),
                Component.translatable("botania_editor.orechid_range", ServerConfig.MUNCHDEW_RANGE.get(), ServerConfig.MUNCHDEW_RANGE_Y.get())
            )
        );
    }

}
