package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HotMilkBottleItem extends BottleItem {

    public HotMilkBottleItem() {
        super(5, 7, true, true);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack stack2 = super.finishUsing(stack, world, user);
        user.clearStatusEffects();
        return stack2;
    }
    
}
