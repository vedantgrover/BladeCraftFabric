package com.freyr.bc.world.feature;

import com.freyr.bc.BladeCraft;
import com.freyr.bc.blocks.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_RUBY_ORES = List.of(
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE_BLOCK.getDefaultState()),
        OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE = ConfiguredFeatures.register("ruby_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_RUBY_ORES, 5));

    public static void registerConfiguredFeatures() {
        BladeCraft.LOGGER.debug("Registering Configured Features for " + BladeCraft.MOD_ID);
    }
}
