package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SugarToastItem extends UFFoodItem {

    public SugarToastItem() {
        super(3, 0.2f);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 5 * 20, 0));
        return stack;
    }
    
}
