package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SugarCubeItem extends UFFoodItem {

    public SugarCubeItem() {
        super(4, 0.1f, 64, false, null);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60* 20, 0));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 60* 20, 0));
        return stack;
    }
    
}
