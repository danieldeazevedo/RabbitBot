package me.mrproplayer.projects.rabbit.discord.net;


import me.mrproplayer.projects.rabbit.discord.net.commands.information.DataCommand;
import me.mrproplayer.projects.rabbit.discord.net.commands.information.PingCommand;
import me.mrproplayer.projects.rabbit.discord.net.events.MentionBotEvent;
import me.mrproplayer.projects.rabbit.discord.net.events.SlashCommandExecutor;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

import static net.dv8tion.jda.api.interactions.commands.OptionType.STRING;

public class BotLauncher extends ListenerAdapter {


    public static JDA jda;
    public static void main(String[] args) throws LoginException, IllegalArgumentException {


        jda = JDABuilder.create("OTM4NjAxMTQ5MTg2MDU2MjUy.YfsqcA.yk33qUgsnzz7CkcNOav6Casl9Rg",
                EnumSet.allOf(GatewayIntent.class)).build();


        jda.addEventListener(new BotLauncher());
        jda.addEventListener(new PingCommand());
        jda.addEventListener(new MentionBotEvent());
        jda.addEventListener(new SlashCommandExecutor());
        jda.addEventListener(new DataCommand());



        //SlashCommand


        jda.upsertCommand("ping", "See the bot ping!").queue();
        jda.upsertCommand("say", "type something for the bot to talk about!")
                .addOption(STRING,"content", "type here!", true).queue();




    }
}