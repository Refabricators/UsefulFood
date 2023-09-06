package org.refabricators.usefulfood;

import org.refabricators.usefulfood.recipe.UsefulFoodRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack;

public class UsefulFoodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		UsefulFood.LOGGER.info("Hi");
		Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(UsefulFoodRecipeProvider::new);
	}
}
