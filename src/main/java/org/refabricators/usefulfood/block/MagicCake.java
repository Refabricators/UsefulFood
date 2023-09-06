package org.refabricators.usefulfood.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagicCake extends SpecialCake {

    public MagicCake() {
        super(48, 0.5f);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ActionResult result = super.onUse(state, world, pos, player, hand, hit);
        if (result == ActionResult.SUCCESS) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 3));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 0));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000, 0));
        }
        return result;
    }
    
}
