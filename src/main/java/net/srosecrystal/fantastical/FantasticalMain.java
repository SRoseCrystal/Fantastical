package net.srosecrystal.fantastical;

import net.fabricmc.api.ModInitializer;
import net.srosecrystal.fantastical.biomes.FantasyBiomes;

public class FantasticalMain implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		FantasyBiomes.init();
	}
}
