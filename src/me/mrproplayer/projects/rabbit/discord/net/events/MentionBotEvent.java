package me.mrproplayer.projects.rabbit.discord.net.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MentionBotEvent extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");

        if (args[0].equalsIgnoreCase("<@!938601149186056252>")){

            event.getMessage().reply("Olá meu nome é rabbit :3 use / e veja meus comandos! ").queue();
        }
    }
}
