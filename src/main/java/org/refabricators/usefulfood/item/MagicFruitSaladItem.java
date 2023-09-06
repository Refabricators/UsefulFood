package org.refabricators.usefulfood.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

public class MagicFruitSaladItem extends BowlItem {

    public MagicFruitSaladItem(int hunger, float saturation, boolean removePoison) {
        super(hunger, saturation, removePoison);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack stack2 = super.finishUsing(stack, world, user);

        if(!world.isClient()) {
            if(removePoison) user.removeStatusEffect(StatusEffects.POISON);
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10* 20, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5* 20, 0));
        }
        
        return stack2;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.EPIC;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
    
}
