package org.refabricators.usefulfood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

public class UFItem extends Item {

    public UFItem() {
        super(new FabricItemSettings());
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.EPIC;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!(selected && (entity instanceof PlayerEntity))) return;
        PlayerEntity player = (PlayerEntity)entity;
        if(world.isClient() || player.isCreative()) return;
        int currentFoodLevel = player.getHungerManager().getFoodLevel();
        if(!(currentFoodLevel >= 0)) return;
        player.getHungerManager().setFoodLevel(currentFoodLevel - 1);
        player.getHungerManager().setSaturationLevel(0);
        
    }
    
}
