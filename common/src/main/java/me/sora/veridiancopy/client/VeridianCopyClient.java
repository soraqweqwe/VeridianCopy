package me.sora.veridiancopy.client;

import me.sora.veridiancopy.Veridiancopy;
import me.sora.veridiancopy.events.ChatEventHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class VeridianCopyClient {
    public static void initClient() {
        ChatEventHandler.init();
        Veridiancopy.LOGGER.info("123");
    }


}
