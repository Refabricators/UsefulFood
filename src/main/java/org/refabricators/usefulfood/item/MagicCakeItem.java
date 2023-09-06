package org.refabricators.usefulfood.item;

import org.refabricators.usefulfood.block.UFCakeBlock;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class MagicCakeItem extends UFSugarCaneItem {

    public MagicCakeItem(UFCakeBlock cakeBlock) {
        super(cakeBlock);
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
