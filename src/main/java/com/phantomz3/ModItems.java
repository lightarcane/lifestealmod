package com.phantomz3;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HEART = registerItem("heart", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LifestealMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LifestealMod.LOGGER.info("Registering mod items for " + LifestealMod.MOD_ID);
    }
}