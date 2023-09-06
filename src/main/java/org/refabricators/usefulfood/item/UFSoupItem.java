package org.refabricators.usefulfood.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class UFSoupItem extends BowlItem {

    public UFSoupItem(int hunger, float saturation) {
        super(hunger, saturation, false);
        
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    
}
