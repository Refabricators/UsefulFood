package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlItem extends UFFoodItem {

    public BowlItem(int hunger, float saturation, boolean removePoison) {
        super(hunger, saturation, 1, removePoison, null);
        
    }

    public BowlItem(int hunger, float saturation, boolean removePoison, boolean returnBowl) {
        super(hunger, saturation, 1, removePoison, (returnBowl ? Items.BOWL : null));
        
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        return new ItemStack(Items.BOWL);
    }
    
}
