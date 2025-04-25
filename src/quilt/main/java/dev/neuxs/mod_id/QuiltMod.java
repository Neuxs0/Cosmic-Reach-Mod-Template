package dev.neuxs.mod_id;

import dev.crmodders.cosmicquilt.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.ModContainer;

public class QuiltMod implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		Mod.init();
	}
}
