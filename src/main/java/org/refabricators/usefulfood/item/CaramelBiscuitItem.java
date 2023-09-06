package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CaramelBiscuitItem extends UFFoodItem {

    public CaramelBiscuitItem() {
        super(7, 0.6f, 64, false, null);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0));
        return stack;
    }
    
}
