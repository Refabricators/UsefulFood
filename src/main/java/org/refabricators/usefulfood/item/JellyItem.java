package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class JellyItem extends BowlItem {

    public JellyItem() {
        super(5, 0.3f, false);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack stack2 = super.finishUsing(stack, world, user);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 30 * 20, 0));
        return stack2;
    }
    
}
