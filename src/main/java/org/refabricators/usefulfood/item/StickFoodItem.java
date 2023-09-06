package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class StickFoodItem extends UFFoodItem {

    public StickFoodItem(int hunger, float saturation) {
        super(hunger, saturation, 1, false, null);
        
    }

    public StickFoodItem(int hunger, float saturation, boolean returnStick) {
        super(hunger, saturation, 1, false, (returnStick ? Items.STICK : null));
        
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        return new ItemStack(Items.STICK);
    }
    
}
