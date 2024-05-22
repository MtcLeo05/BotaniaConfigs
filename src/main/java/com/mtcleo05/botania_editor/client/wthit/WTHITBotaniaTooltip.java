package com.mtcleo05.botania_editor.client.wthit;

import com.mtcleo05.botania_editor.config.ClientConfig;
import com.mtcleo05.botania_editor.config.ServerConfig;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import net.minecraft.world.level.block.Block;
import snownee.jade.api.WailaPlugin;
import vazkii.botania.common.block.mana.ManaPoolBlock;
import vazkii.botania.common.block.mana.ManaSpreaderBlock;

@WailaPlugin(WTHITBotaniaTooltip.ID)
public class WTHITBotaniaTooltip implements IWailaPlugin {
    public static final String ID = "botania";

    @Override
    public void register(IRegistrar iRegistrar) {
        if(ClientConfig.SHOULD_SHOW_MANA_TOOLTIP.get()) {
            iRegistrar.addComponent(ManaPoolComponentProvider.INSTANCE, TooltipPosition.HEAD, ManaPoolBlock.class);
            //I have to check each block 'cause idk which block uses this block entity
            //I should make sure that it doesn't do anything unless it's a generating flower
            iRegistrar.addComponent(GeneratingFlowerComponentProvider.INSTANCE, TooltipPosition.HEAD, Block.class);
            iRegistrar.addComponent(SpreaderComponentProvider.INSTANCE, TooltipPosition.HEAD, ManaSpreaderBlock.class);
            if(ClientConfig.SHOULD_SHOW_ADVANCED_TOOLTIP.get()){
                iRegistrar.addComponent(AdvancedSpreaderComponentProvider.INSTANCE, TooltipPosition.HEAD, ManaSpreaderBlock.class);
                //Same as generating flower
                iRegistrar.addComponent(OrechidComponentProvider.INSTANCE, TooltipPosition.HEAD, Block.class);
            }
        }
    }
}
