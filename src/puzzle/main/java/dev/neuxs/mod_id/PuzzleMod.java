package dev.neuxs.mod_id;

import com.github.puzzle.core.loader.launch.provider.mod.entrypoint.impls.ClientModInitializer;

public class PuzzleMod implements ClientModInitializer {
    @Override
    public void onInit() {
        Mod.init();
    }
}