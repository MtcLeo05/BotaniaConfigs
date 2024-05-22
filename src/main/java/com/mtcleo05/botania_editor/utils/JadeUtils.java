package com.mtcleo05.botania_editor.utils;

import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;
import vazkii.botania.common.block.flower.generating.EndoflameBlockEntity;
import vazkii.botania.common.block.flower.generating.HydroangeasBlockEntity;
import vazkii.botania.common.block.flower.generating.ThermalilyBlockEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JadeUtils {

    public static final Map<Class<? extends GeneratingFlowerBlockEntity>, List<ForgeConfigSpec.ConfigValue<?>>> JADE_FLOWER_MAP = new HashMap<>();

    static {
        JADE_FLOWER_MAP.put(
            EndoflameBlockEntity.class,
            List.of(
                ServerConfig.ENDOFLAME_PROD
            )
        );

        JADE_FLOWER_MAP.put(
            HydroangeasBlockEntity.class,
            List.of(
                ServerConfig.HYDROANGEAS_PROD,
                ServerConfig.HYDROANGEAS_TICK
            )
        );

        JADE_FLOWER_MAP.put(
            ThermalilyBlockEntity.class,
            List.of(
                ServerConfig.THERMALILY_PROD
            )
        );
    }

}
