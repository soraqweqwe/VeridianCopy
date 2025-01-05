package me.sora.veridiancopy.forge.client;


import me.sora.veridiancopy.Veridiancopy;
import me.sora.veridiancopy.client.VeridianCopyClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Veridiancopy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VeridianCopyForgeClient {
    @SubscribeEvent
    public static void setupClient(FMLClientSetupEvent event) {
        VeridianCopyClient.initClient();
    }

}
