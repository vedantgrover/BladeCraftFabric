package com.freyr.bc.items;

import com.freyr.bc.BladeCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.RUBY_ITEM_GROUP)));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings().group(ModItemGroup.RUBY_ITEM_GROUP)));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.SAPPHIRE_ITEM_GROUP)));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings().group(ModItemGroup.SAPPHIRE_ITEM_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BladeCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BladeCraft.LOGGER.debug("Registering items for " + BladeCraft.MOD_ID);
    }
}
