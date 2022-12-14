package samalet.minecraftdiscordbot.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import samalet.minecraftdiscordbot.Plugin;
import samalet.minecraftdiscordbot.util.ChatUtil;

/**
 * File is part of BeBrAPI. Thank you for using it! Also check out my YouTube channel where you can also leave your suggestions! https://www.youtube.com/c/BeBr0
 *
 * @author BeBr0
 */
public class JoinDiscord implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        ChatUtil.getInstance().sendMessage(
                sender,
                "Ссылка на присоединение - " + Plugin.getInstance().getConfig().get("permanent_invite_link"),
                false
        );

        return false;
    }
}

