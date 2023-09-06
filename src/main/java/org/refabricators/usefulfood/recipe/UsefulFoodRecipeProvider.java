package org.refabricators.usefulfood.recipe;

import java.util.function.Consumer;

import org.refabricators.usefulfood.item.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

public class UsefulFoodRecipeProvider extends FabricRecipeProvider {
    RecipeCategory category = RecipeCategory.FOOD;

    public UsefulFoodRecipeProvider(FabricDataOutput output) {
        super(output);
       
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        
       shapeless(exporter);
       shaped(exporter);
    }

    public void shapeless(Consumer<RecipeJsonProvider> exporter) {
        //milk bottle
        ShapelessRecipeJsonBuilder.create(category, ModItems.MILK_BOTTLE, 2)
       .input(Items.GLASS_BOTTLE, 2).input(Items.MILK_BUCKET, 1)
       .criterion("milk_bottle", InventoryChangedCriterion.Conditions.items(Items.MILK_BUCKET))
       .offerTo(exporter);
       //magic fruit salad
       ShapelessRecipeJsonBuilder.create(category, ModItems.MAGIC_FRUIT_SALAD , 1)
       .input(Items.BOWL).input(Items.GLISTERING_MELON_SLICE).input(Items.GOLDEN_APPLE)
       .criterion("magic_fruit_salad", InventoryChangedCriterion.Conditions.items(Items.BOWL))
       .offerTo(exporter);
       //sugar cube
       ShapelessRecipeJsonBuilder.create(category, ModItems.SUGAR_CUBE, 1)
       .input(Items.SUGAR, 4)
       .criterion("sugar_cube", InventoryChangedCriterion.Conditions.items(Items.SUGAR))
       .offerTo(exporter);
       //caramel apple
       ShapelessRecipeJsonBuilder.create(category, ModItems.CARAMEL_APPLE)
       .input(Items.STICK).input(Items.APPLE).input(ModItems.CARAMEL)
       .criterion("caramel_apple", InventoryChangedCriterion.Conditions.items(Items.STICK))
       .offerTo(exporter);
       //pumpkin soup
       ShapelessRecipeJsonBuilder.create(category, ModItems.PUMPKIN_SOUP, 1)
       .input(Items.BOWL).input(Blocks.PUMPKIN)
       .criterion("pumpkin_soup", InventoryChangedCriterion.Conditions.items(Items.BOWL))
       .offerTo(exporter);
       //salad
       ShapelessRecipeJsonBuilder.create(category, ModItems.SALAD, 1)
       .input(Items.BOWL).input(Items.WHEAT_SEEDS).input(Blocks.DANDELION).input(Blocks.RED_TULIP)
       .criterion("salad", InventoryChangedCriterion.Conditions.items(Items.BOWL))
       .offerTo(exporter);

       
    }

    public void shaped(Consumer<RecipeJsonProvider> exporter) {
        
    }
    
}
