package com.freyr.bc.items;

import com.freyr.bc.BladeCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup RUBY_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(BladeCraft.MOD_ID, "ruby_item_group"), () -> new ItemStack(ModItems.RUBY));
    public static final ItemGroup SAPPHIRE_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(BladeCraft.MOD_ID, "sapphire_item_group"), () -> new ItemStack(ModItems.SAPPHIRE));
}
