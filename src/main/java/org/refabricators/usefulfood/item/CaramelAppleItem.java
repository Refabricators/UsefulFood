package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CaramelAppleItem extends StickFoodItem {

    public CaramelAppleItem() {
        super(10, 0.5f);
        
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack stack2 = super.finishUsing(stack, world, user);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0));
        return stack2;
    }
    
}
