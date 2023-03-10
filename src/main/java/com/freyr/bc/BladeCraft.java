package com.freyr.bc;

import com.freyr.bc.blocks.ModBlocks;
import com.freyr.bc.items.ModItems;
import com.freyr.bc.world.feature.ModConfiguredFeatures;
import com.freyr.bc.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BladeCraft implements ModInitializer {
	public static final String MOD_ID = "bc";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures(); // Must be on top
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();
	}
}
