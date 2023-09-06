package org.refabricators.usefulfood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UFFoodItem extends Item {
    boolean removePoison = false;

     

    public UFFoodItem(int hunger, float saturation, int maxStackSize, boolean removePoison, Item recipeRemainder) {
        super(new FabricItemSettings().food(new FoodComponent.Builder().hunger(hunger)
        .saturationModifier(saturation).build()).maxCount(maxStackSize).recipeRemainder(recipeRemainder));
        
        this.removePoison = removePoison;
               
    }

    public UFFoodItem(int hunger, float saturation, int maxStackSize, boolean removePoison) {
        this(hunger, saturation, maxStackSize, removePoison, null);
    }

    public UFFoodItem(int hunger, float saturation, int maxStackSize) {
        this(hunger, saturation, maxStackSize, false, null);
    }

    public UFFoodItem(int hunger, float saturation) {
        this(hunger, saturation, 64, false, null);
    }

    public UFFoodItem(int hunger, float saturation, boolean removePoison) {
        this(hunger, saturation, 64, removePoison, null);
    }

    

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if(!world.isClient() && removePoison) user.removeStatusEffect(StatusEffects.POISON);
        return stack;
    }
    
}
