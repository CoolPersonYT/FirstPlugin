package coolperson.coolpersonme.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoin implements Listener{


    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
        // gets player username
        String username = event.getPlayer().getDisplayName();
        // if player has joined before sends welcome back message
        if (event.getPlayer().hasPlayedBefore())
            event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome Back " + username + "!");
        // if player hasn't joined before sends welcome message
        else {
            event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome " + username + "! \n To check the rules do /rules and if you need help \n ask a mod or an admin!");
        }
    }
}
