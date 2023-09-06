package org.refabricators.usefulfood;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.refabricators.usefulfood.block.ModBlocks;
import org.refabricators.usefulfood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulFood implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "usefulfood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup USEFULFOOD_ITEM_GROUP = FabricItemGroup.builder()
  	.displayName(Text.literal("UsefulFood")).build();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "item_group"), USEFULFOOD_ITEM_GROUP);
		ModBlocks.initialize();
		ModItems.initialize();
	}
}