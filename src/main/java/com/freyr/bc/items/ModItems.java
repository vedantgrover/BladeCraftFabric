package com.freyr.bc.items;

import com.freyr.bc.BladeCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.RUBY_ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BladeCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BladeCraft.LOGGER.debug("Registering items for " + BladeCraft.MOD_ID);
    }
}
