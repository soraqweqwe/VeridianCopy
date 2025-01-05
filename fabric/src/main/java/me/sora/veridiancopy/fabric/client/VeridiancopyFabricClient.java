package me.sora.veridiancopy.fabric.client;

import me.sora.veridiancopy.client.VeridianCopyClient;
import net.fabricmc.api.ClientModInitializer;

public final class VeridiancopyFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        VeridianCopyClient.initClient();
    }
}
