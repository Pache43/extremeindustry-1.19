package net.pache.extremeindustry;

import net.fabricmc.api.ModInitializer;
import net.pache.extremeindustry.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtremeIndustry implements ModInitializer {
	public static final String MOD_ID = "extremeindustry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
