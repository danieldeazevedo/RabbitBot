package me.mrproplayer.projects.rabbit.discord.net.commands.information;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class DataCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        long dataDeHoje = System.currentTimeMillis() / 1000;

        if (args[0].equalsIgnoreCase("$" + "data")) {

            event.getMessage().reply("<t:" + dataDeHoje + ":F>").queue();
        }
    }
}
