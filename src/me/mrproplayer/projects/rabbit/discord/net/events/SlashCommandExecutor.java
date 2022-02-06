package me.mrproplayer.projects.rabbit.discord.net.events;

import me.mrproplayer.projects.rabbit.discord.net.BotLauncher;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SlashCommandExecutor extends ListenerAdapter {

    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {

        if (event.getName().equals("ping")){

            event.reply(BotLauncher.jda.getGatewayPing() + "ms\n  Ping da api" + BotLauncher.jda.getRestPing()).queue();
        }

        if (event.getName().equals("say")){
            event.reply(event.getOption("content").getAsString() + "\n  mensagem enviada por: " + event.getMember().getAsMention()).queue();
        }

        if(event.getName().equals("laranjo")){





        }
    }
}
