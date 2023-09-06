package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MagicAppleJuiceItem extends JuiceItem {

    public MagicAppleJuiceItem(int hunger, float saturation) {
        super(hunger, saturation);

    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if(!world.isClient()) {
            
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 3));
        }
        
        return stack;
    }


    
}
