package org.refabricators.usefulfood.item;

import org.refabricators.usefulfood.UsefulFood;
import org.refabricators.usefulfood.block.ModBlocks;
import org.refabricators.usefulfood.block.UFCakeBlock;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    static RegistryKey<ItemGroup> itemGroup = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(UsefulFood.MOD_ID, "item_group"));

    public static final Item MILK_BOTTLE = register(new MilkBottleItem(), "milk_bottle");
    public static final Item CHOCOLATE_MILK_BOTTLE = register(new BottleItem(3, 6, true), "chocolate_milk_bottle");
    public static final Item CHEESE = register(new CheeseItem(2, 0.6f), "cheese");
    public static final Item CHOCOLATE_BAR = register(new UFFoodItem(6, 1.0f, 64, false, null), "chocolate_bar");
    public static final Item FRUIT_SALAD = register(new BowlItem(7, 0.6f, false), "fruit_salad");
    public static final Item MAGIC_FRUIT_SALAD = register(new MagicFruitSaladItem(6, 0.6f, false), "magic_fruit_salad");
    public static final Item SUGAR_CUBE = register(new SugarCubeItem(), "sugar_cube");
    public static final Item CARAMEL = register(new CaramelItem(), "caramel");
    public static final Item CARAMEL_APPLE = register(new CaramelAppleItem(), "caramel_apple");
    public static final Item ROASTED_SEEDS = register(new UFFoodItem(1, 0.5f, 64, false, null), "roasted_seeds");
    public static final Item FRIED_EGG = register(new UFFoodItem(3, 0.4f, 64, true, null), "fried_egg");
    public static final Item PUMPKIN_SOUP = register(new UFSoupItem(5, 0.8f), "pumpkin_soup");
    public static final Item SALAD = register(new BowlItem(3, 0.6f, false), "salad");
    public static final Item OATMEAL = register(new BowlItem(4, 0.6f, false), "oatmeal");
    public static final Item JELLY = register(new JellyItem(), "jelly");
    public static final Item RAW_MARSHMALLOW = register(new StickFoodItem(3, 0.3f), "raw_marshmallow");
    public static final Item COOKED_MARSHMALLOW = register(new StickFoodItem(4, 0.3f), "cooked_marshmallow");
    public static final Item VANILLA_ICE_CREAM = register(new BowlItem(2, 0.3f, true), "vanilla_ice_cream");
    public static final Item BREAD_SLICE = register(new UFFoodItem(1, 0.3f, 64, false, null), "bread_slice");
    public static final Item PORK_CHOP_SANDWICH = register(new UFFoodItem(11, 1.0f, 64, true, null), "pork_chop_sandwich");
    public static final Item STEAK_SANDWICH = register(new UFFoodItem(11, 1.0f, 64, true, null), "steak_sandwich");
    public static final Item FISH_SANDWICH = register(new UFFoodItem(8, 1.0f, 64, true, null), "fish_sandwich");
    public static final Item CHICKEN_SANDWICH = register(new UFFoodItem(9, 1.0f, 64, true, null), "chicken_sandwich");
    public static final Item EGG_SANDWICH = register(new UFFoodItem(6, 1.0f, 64, true, null), "egg_sandwich");
    public static final Item BISCUIT = register(new UFFoodItem(1, 0.3f, 64, true, null), "biscuit");
    public static final Item TRAILMIX = register(new BowlItem(4, 0.5f, false), "trailmix");
    public static final Item APPLE_CAKE = register(new UFSugarCaneItem((UFCakeBlock)ModBlocks.APPLE_CAKE), "apple_cake");
    public static final Item CHOCOLATE_CAKE = register(new UFSugarCaneItem((UFCakeBlock)ModBlocks.CHOCOLATE_CAKE), "chocolate_cake");
    public static final Item MAGIC_CAKE = register(new MagicCakeItem((UFCakeBlock)ModBlocks.MAGIC_CAKE), "magic_cake");
    public static final Item MUTTON_SANDWICH = register(new UFFoodItem(9, 1.0f, 64, true, null), "mutton_sandwich");
    public static final Item DEBUG_FOOD = register(new DebugFoodItem(), "debug_food");
    public static final Item SUSHI = register(new UFFoodItem(5, 0.3f, 64, true, null), "sushi");
    public static final Item RAW_SQUID_TENTACLE = register(new UFFoodItem(2, 0.3f, 64, true), "raw_squid_tentacle");
    public static final Item COOKED_SQUID_TENTACLE = register(new UFFoodItem(5, 0.8f, 64, true), "cooked_squid_tentacle");
    public static final Item MAGIC_APPLE_JUICE = register(new MagicAppleJuiceItem(13, 1.2f), "magic_apple_juice");
    public static final Item MELON_JUICE = register(new JuiceItem(6, 0.9f), "melon_juice");
    public static final Item APPLE_JUICE = register(new JuiceItem(12, 0.9f), "apple_juice");
    public static final Item CARROT_JUICE = register(new JuiceItem(12, 0.9f), "carrot_juice");
    public static final Item CARROT_SOUP = register(new UFSoupItem(9, 0.8f), "carrot_soup");
    public static final Item PUMPKIN_BREAD = register(new UFFoodItem(10, 0.6f, true), "pumpkin_bread");
    public static final Item FISH_N_CHIPS = register(new UFFoodItem(12, 1.2f, true), "fish_n_chips");
    public static final Item SUGAR_BISCUIT = register(new UFFoodItem(3, 0.3f), "sugar_biscuit");
    public static final Item APPLE_JAM_BISCUIT = register(new UFFoodItem(10, 0.3f), "apple_jam_biscuit");
    public static final Item CHOCOLATE_BISCUIT = register(new UFFoodItem(3, 1.0f), "chocolate_biscuit");
    public static final Item CARROT_PIE = register(new UFFoodItem(9, 0.8f, true), "carrot_pie");
    public static final Item HOT_CHOCOLATE_MILK_BOTTLE = register(new BottleItem(5, 9, true, true), "hot_chocolate_milk_bottle");
    public static final Item CHOCOLATE_ICE_CREAM = register(new BowlItem(9, 0.8f, true), "chocolate_ice_cream");
    public static final Item MAGIC_ICE_CREAM = register(new MagicIceCreamItem(), "magic_ice_cream");
    public static final Item SQUID_SUSHI = register(new UFFoodItem(5, 0.3f, true), "squid_sushi");
    public static final Item CACTUS_JUICE = register(new JuiceItem(5, 0.6f), "cactus_juice");
    public static final Item SPAGHETTI = register(new BowlItem(5, 0.6f, false), "spaghetti");
    public static final Item APPLE_ICE_CREAM = register(new BowlItem(5, 0.6f, true), "apple_ice_cream");
    public static final Item MELON_ICE_CREAM = register(new BowlItem(7, 0.6f, true), "melon_ice_cream");
    public static final Item CHOCOLATE_APPLE = register(new StickFoodItem(11, 0.6f), "chocolate_apple");
    public static final Item CARAMEL_BISCUIT = register(new CaramelBiscuitItem(), "caramel_biscuit");
    public static final Item FISH_SOUP = register(new UFSoupItem(12, 0.6f), "fish_soup");
    public static final Item TEA = register(new TeaItem(), "tea");
    public static final Item HOT_MILK_BOTTLE = register(new HotMilkBottleItem(), "hot_milk_bottle");
    public static final Item CARAMEL_CAKE = register(new UFSugarCaneItem((UFCakeBlock)ModBlocks.CARAMEL_CAKE), "caramel_cake");
    public static final Item CHEESE_SANDWICH = register(new UFFoodItem(5, 1, false), "cheese_sandwich");
    public static final Item CARAMEL_ICE_CREAM = register(new CaramelIceCreamItem(), "caramel_ice_cream");
    public static final Item CEREAL = register(new BowlItem(4, 0.5f, true), "cereal");
    public static final Item CHOCOLATE_CEREAL = register(new BowlItem(6, 0.5f, true), "chocolate_cereal");
    public static final Item FRENCH_FRIES = register(new UFFoodItem(7, 0.6f), "french_fries");
    public static final Item APPLE_JELLY = register(new AppleJellyItem(), "apple_jelly");
    public static final Item MELON_JELLY = register(new MelonJellyItem(), "melon_jelly");
    public static final Item DONUT = register(new UFFoodItem(7, 0.6f), "donut");
    public static final Item OREO = register(new UFFoodItem(9, 1), "oreo");
    public static final Item CARAMEL_TOAST = register(new CaramelToastItem(), "caramel_toast");
    public static final Item CHOCOLATE_TOAST = register(new UFFoodItem(8, 0.6f), "chocolate_toast");
    public static final Item SUGAR_TOAST = register(new SugarToastItem(), "sugar_toast");
    public static final Item SUGAR_PANCAKE = register(new SugarPancakeItem(), "sugar_pancake");
    public static final Item APPLE_JAM_PANCAKE = register(new UFFoodItem(15, 0.7f), "apple_jam_pancake");
    public static final Item APPLE_JAM_TOAST = register(new UFFoodItem(10, 0.7f), "apple_jam_toast");
    public static final Item APPLE_JAM = register(new BowlItem(8, 0.4f, false, true), "apple_jam");
    public static final Item CARAMEL_PANCAKE = register(new CaramelPancakeItem(), "caramel_pancake");
    public static final Item CHOCOLATE_PANCAKE = register(new UFFoodItem(13, 0.6f), "chocolate_pancake");
    public static final Item MELON_JAM_PANCAKE = register(new UFFoodItem(13, 0.4f), "melon_jam_pancake");
    public static final Item MELON_JAM_TOAST = register(new UFFoodItem(5, 0.3f), "melon_jam_toast");
    public static final Item MELON_JAM_BISCUIT = register(new UFFoodItem(8, 0.4f), "melon_jam_biscuit");
    public static final Item MELON_JAM = register(new BowlItem(6, 0.4f, false, true), "melon_jam");
    public static final Item PANCAKE_DOUGH = register(new UFFoodItem(5, 0.3f), "pancake_dough");
    public static final Item PANCAKE = register(new UFFoodItem(6, 0.6f), "pancake");    

    public static <T extends Item> T register(T item, String namespace) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(UsefulFood.MOD_ID, namespace);
        
        // Register the item.
        T registeredItem = Registry.register(Registries.ITEM, itemID, item);

        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
            content.add(registeredItem);
        });
 
        // Return the registered item!
        return registeredItem;
    }

    public static void initialize() {
        UsefulFood.LOGGER.info("Registering Mod Items");
    }
}
