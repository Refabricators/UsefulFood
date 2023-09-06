package org.refabricators.usefulfood.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class MagicIceCreamItem extends BowlItem {

    public MagicIceCreamItem() {
        super(9, 0.6f, true);
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
