package org.refabricators.usefulfood.block;

import org.refabricators.usefulfood.UsefulFood;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block APPLE_CAKE = register(new SpecialCake(18, 0.6f), "apple_cake");
    public static final Block CHOCOLATE_CAKE = register(new SpecialCake(12, 0.5f), "chocolate_cake");
    public static final Block MAGIC_CAKE = register(new MagicCake(), "magic_cake");
    public static final Block CARAMEL_CAKE = register(new SpecialCake(19, 0.8f), "caramel_cake");
    
    public static <T extends Block> T register(T block, String name) {
        Identifier id = new Identifier(UsefulFood.MOD_ID, name);
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {
        UsefulFood.LOGGER.info("Registering Mod Blocks");
    }
}
