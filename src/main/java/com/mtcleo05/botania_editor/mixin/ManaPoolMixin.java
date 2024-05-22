package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.ServerConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.mana.ManaBlockType;
import vazkii.botania.api.mana.ManaNetworkAction;
import vazkii.botania.api.mana.ManaPool;
import vazkii.botania.api.mana.ManaReceiver;
import vazkii.botania.common.block.block_entity.BotaniaBlockEntity;
import vazkii.botania.common.block.block_entity.mana.ManaPoolBlockEntity;
import vazkii.botania.common.block.mana.ManaPoolBlock;
import vazkii.botania.common.handler.ManaNetworkHandler;

@Mixin(ManaPoolBlockEntity.class)
public class ManaPoolMixin extends BotaniaBlockEntity {

    @Shadow(remap = false)
    private int manaCap;

    @Shadow(remap = false)
    public int getMaxMana(){return 0;}

    public ManaPoolMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    //TODO: Make this without overwrite
    /**
     * @author MtcLeo05
     * @reason Change mana pool mana
     */
    @Overwrite(remap = false)
    private void initManaCapAndNetwork() {
        if (this.getMaxMana() == -1) {
            this.manaCap = ((ManaPoolBlock)this.getBlockState().getBlock()).variant == ManaPoolBlock.Variant.DILUTED ? ServerConfig.DILUTED_MANA_POOL_MAX_MANA.get() : ServerConfig.MANA_POOL_MAX_MANA.get();
        }

        if (!ManaNetworkHandler.instance.isPoolIn(this.level, (ManaPool) this) && !this.isRemoved()) {
            BotaniaAPI.instance().getManaNetworkInstance().fireManaNetworkEvent((ManaReceiver) this, ManaBlockType.POOL, ManaNetworkAction.ADD);
        }
    }
}
