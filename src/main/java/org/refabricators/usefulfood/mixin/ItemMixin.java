package org.refabricators.usefulfood.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

@Mixin(Items.class)
public abstract class ItemMixin {

  @ModifyArg(slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=sugar")), method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V", ordinal = 0))
  private static Item.Settings modifySettings(Item.Settings settings) {
      return settings.food(new FoodComponent.Builder().hunger(0).saturationModifier(0)
          .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 15*20, 0), 1.0f)
          .build());
  }

    
}
