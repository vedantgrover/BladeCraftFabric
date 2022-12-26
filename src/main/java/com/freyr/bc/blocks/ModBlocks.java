package com.freyr.bc.blocks;

import com.freyr.bc.BladeCraft;
import com.freyr.bc.items.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.RUBY_ITEM_GROUP);
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 4f).requiresTool()), ModItemGroup.RUBY_ITEM_GROUP);
    public static final Block RUBY_ORE_BLOCK = registerBlock("ruby_ore_block", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.RUBY_ITEM_GROUP);
    public static final Block DEEPSLATE_RUBY_ORE_BLOCK = registerBlock("deepslate_ruby_ore_block", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f, 4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.RUBY_ITEM_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(BladeCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(BladeCraft.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        BladeCraft.LOGGER.debug("Registering Blocks for " + BladeCraft.MOD_ID);
    }
}
