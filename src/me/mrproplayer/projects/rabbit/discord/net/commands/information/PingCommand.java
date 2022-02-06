package me.mrproplayer.projects.rabbit.discord.net.commands.information;

import me.mrproplayer.projects.rabbit.discord.net.BotLauncher;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class PingCommand extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");


        if (args[0].equalsIgnoreCase("$" + "ping")) {


           event.getMessage().reply(BotLauncher.jda.getGatewayPing() + "ms").queue();

        }

    }

}
