package github.pluginexample;

import commands.DiamonCommand;
import events.PlayerJoinQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin_example extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the /diamon command
        getCommand("diamon").setExecutor(new DiamonCommand());

        // Register the Listener of incoming and outgoing players
        getServer().getPluginManager().registerEvents(new PlayerJoinQuitListener(), this);

        // Show message in the console when enabling the plugin
        getLogger().info("SstudiosDev Template on!");
        getLogger().info("Hello World!");
    }

    @Override
    public void onDisable() {
        // Show message in the console when disabling the plugin
        getLogger().info("SstudiosDev Template off!");
        getLogger().info("Goodbye");
    }

    // Other methods and functions of your plugin...
}