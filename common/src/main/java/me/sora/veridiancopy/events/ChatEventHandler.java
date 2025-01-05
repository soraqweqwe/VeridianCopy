package me.sora.veridiancopy.events;

import dev.architectury.event.CompoundEventResult;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.client.ClientChatEvent;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.network.chat.Style;

public class ChatEventHandler {
    public static void init() {
        ClientChatEvent.RECEIVED.register((type, message) -> {
            Style style = message.getStyle().withClickEvent(
                    new ClickEvent(ClickEvent.Action.COPY_TO_CLIPBOARD, message.getString())
            ).withHoverEvent(
                    new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.translatable("gui.veridiancopy.tooltip"))
            );
            message = Component.literal(message.getString()).withStyle(style);
            return CompoundEventResult.interruptTrue(message);
        });
    }
}