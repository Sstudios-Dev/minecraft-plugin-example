package events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Code to execute when a player enters the server
        event.getPlayer().sendMessage("Welcome to the server!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Code to execute when a player exits the server
        event.getPlayer().sendMessage("See you soon! We hope to see you soon.");
    }
}
