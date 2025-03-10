package net.hackfight.createswitzerland;

import net.fabricmc.api.ModInitializer;

import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.hackfight.createswitzerland.item.ModItemGroups;
import net.hackfight.createswitzerland.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSwitzerland implements ModInitializer {
	public static final String MOD_ID = "create-switzerland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Create: Switzerland");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModFluids.registerModFluids();
	}
}