package me.sora.veridiancopy.forge;

import me.sora.veridiancopy.Veridiancopy;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Veridiancopy.MOD_ID)
public final class VeridiancopyForge {
    public VeridiancopyForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Veridiancopy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Veridiancopy.init();
    }
}
