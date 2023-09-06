package org.refabricators.usefulfood.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BottleItem extends UFFoodItem {

    public BottleItem(int hunger, float saturation, boolean removePoison) {
        super(hunger, saturation, 16, removePoison, null);
        
    }

    public BottleItem(int hunger, float saturation, boolean removePoison, boolean returnBottle) {
        super(hunger, saturation, 16, removePoison, (returnBottle ? Items.GLASS_BOTTLE : null));
    }

    

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        if(!world.isClient()) 
            world.playSoundFromEntity(null, user, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, world.getRandom().nextFloat() * 0.1F + 0.9F);
        
        if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
            ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
            PlayerEntity playerEntity = (PlayerEntity)user;
            if (!playerEntity.getInventory().insertStack(itemStack)) playerEntity.dropItem(itemStack, false);
            
        }

        if(stack.isEmpty()) return new ItemStack(Items.GLASS_BOTTLE);

        
        
        return stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    
}
