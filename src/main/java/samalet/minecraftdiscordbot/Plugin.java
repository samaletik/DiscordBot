package samalet.minecraftdiscordbot;

import org.bukkit.plugin.java.JavaPlugin;
import samalet.minecraftdiscordbot.command.RegisterCommand;
import samalet.minecraftdiscordbot.bot.Bot;
import samalet.minecraftdiscordbot.command.RegisterCommand;
import samalet.minecraftdiscordbot.events.MinecraftChatEvent;
import samalet.minecraftdiscordbot.events.PlayerFirstTimeJoinEvent;

public final class Plugin extends JavaPlugin {

    private static Plugin instance = null;

    public static Plugin getInstance() {
        return instance;
    }

    // TODO Tab prefix

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new MinecraftChatEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerFirstTimeJoinEvent(), this);

        getCommand("registerDiscord").setExecutor(new RegisterCommand());
    }

    @Override
    public void onDisable() {
        instance = null;

        Bot.getInstance().shutdown();
    }
}
