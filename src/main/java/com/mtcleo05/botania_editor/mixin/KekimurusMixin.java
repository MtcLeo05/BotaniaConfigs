package com.mtcleo05.botania_editor.mixin;

import com.mtcleo05.botania_editor.config.server.GeneratingFloraConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import vazkii.botania.api.block_entity.GeneratingFlowerBlockEntity;
import vazkii.botania.api.block_entity.RadiusDescriptor;
import vazkii.botania.common.block.flower.generating.KekimurusBlockEntity;

@Mixin(KekimurusBlockEntity.class)
public class KekimurusMixin extends GeneratingFlowerBlockEntity {

    public KekimurusMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    /**
     * @author Leo
     * @reason Custom mana each cake
     */
    @Overwrite(remap = false)
    public void tickFlower() {
        super.tickFlower();
        if (!this.getLevel().isClientSide) {
            int mana = GeneratingFloraConfig.KEKIMURUS_PROD.get();
            if (this.getMaxMana() - this.getMana() >= mana && !this.getLevel().isClientSide && this.ticksExisted % 80 == 0) {
                for(int i = 0; i < 11; ++i) {
                    for(int j = 0; j < 11; ++j) {
                        for(int k = 0; k < 11; ++k) {
                            BlockPos pos = this.getEffectivePos().offset(i - 5, j - 5, k - 5);
                            BlockState state = this.getLevel().getBlockState(pos);
                            Block block = state.getBlock();
                            if (block instanceof CakeBlock) {
                                int nextSlicesEaten = state.getValue(CakeBlock.BITES) + 1;
                                if (nextSlicesEaten > 6) {
                                    this.getLevel().removeBlock(pos, false);
                                } else {
                                    this.getLevel().setBlockAndUpdate(pos, state.setValue(CakeBlock.BITES, nextSlicesEaten));
                                }

                                this.getLevel().levelEvent(2001, pos, Block.getId(state));
                                this.getLevel().playSound(null, this.getEffectivePos(), SoundEvents.GENERIC_EAT, SoundSource.BLOCKS, 1.0F, 0.5F + (float)Math.random() * 0.5F);
                                this.addMana(mana);
                                this.sync();
                                return;
                            }
                        }
                    }
                }
            }

        }
    }

    @Shadow
    public @Nullable RadiusDescriptor getRadius() {
        return null;
    }

    @Shadow
    public int getMaxMana() {
        return 0;
    }

    @Shadow
    public int getColor() {
        return 0;
    }

}
