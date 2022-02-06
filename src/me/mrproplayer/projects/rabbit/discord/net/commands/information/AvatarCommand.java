package me.mrproplayer.projects.rabbit.discord.net.commands.information;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AvatarCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {



        SimpleDateFormat adf = new SimpleDateFormat("EEEE " + "hh:mm a");
        Date date = new Date(System.currentTimeMillis());
        Member target = event.getMember();


        EmbedBuilder Avatar = new EmbedBuilder();
        if (event.getMessage().getMentionedRoles().size() > 0 || event.getMessage().getMentionedChannels().size() > 0) {
            Avatar.setColor(Color.RED);
            Avatar.setTitle("Erro");
            Avatar.setDescription("Groupos e Salas não tem avatar");
            event.getChannel().sendMessage((Message) Avatar.build()).queue();
        } else {
            Avatar.setColor(Color.CYAN);
            if (event.getMessage().getMentionedMembers().isEmpty())
                Avatar.setTitle("Seu avatar!");
            else
                Avatar.setTitle("Avatar de " + event.getMessage().getMentionedMembers().get(0).getEffectiveName());
            Avatar.setImage(target.getUser().getAvatarUrl());
            Avatar.setFooter("Pedido por: " + event.getAuthor().getName() + " • " + adf.format(date), event.getMember().getUser().getAvatarUrl());
            event.getChannel().sendMessage((Message) Avatar.build()).queue();
        }


    }
}
