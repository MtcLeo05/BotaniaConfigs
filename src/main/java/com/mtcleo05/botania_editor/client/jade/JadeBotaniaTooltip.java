package com.mtcleo05.botania_editor.client.jade;

import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import snownee.jade.api.*;
import vazkii.botania.common.block.mana.ManaPoolBlock;
import vazkii.botania.common.block.mana.ManaSpreaderBlock;

@WailaPlugin(JadeBotaniaTooltip.ID)
public class JadeBotaniaTooltip implements IWailaPlugin {

    public static final String ID = "botania";

    @Override
    @OnlyIn(Dist.CLIENT)
    public void registerClient(IWailaClientRegistration registration) {
        if(ClientConfig.SHOULD_SHOW_MANA_TOOLTIP.get()) {
            registration.registerBlockComponent(ManaPoolComponentProvider.INSTANCE, ManaPoolBlock.class);
            //I have to check each block 'cause idk which block uses this block entity
            //I should make sure that it doesn't do anything unless it's a generating flower
            registration.registerBlockComponent(GeneratingFlowerComponentProvider.INSTANCE, Block.class);
            registration.registerBlockComponent(SpreaderComponentProvider.INSTANCE, ManaSpreaderBlock.class);
            if(ClientConfig.SHOULD_SHOW_ADVANCED_TOOLTIP.get()){
                registration.registerBlockComponent(AdvancedSpreaderComponentProvider.INSTANCE, ManaSpreaderBlock.class);
                //Same as generating flower
                registration.registerBlockComponent(OrechidComponentProvider.INSTANCE, Block.class);
            }
        }
    }


}
