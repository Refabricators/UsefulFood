package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TeaItem extends BottleItem {

    public TeaItem() {
        super(0, 0, false);
        
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack stack2 =  super.finishUsing(stack, world, user);
        user.heal(2);
        return stack2;
        
    }
    
}
