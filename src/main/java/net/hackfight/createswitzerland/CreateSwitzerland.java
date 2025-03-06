package net.hackfight.createswitzerland;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSwitzerland implements ModInitializer {
	public static final String MOD_ID = "create-switzerland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Create: Switzerland is ready to go!");


	}
}