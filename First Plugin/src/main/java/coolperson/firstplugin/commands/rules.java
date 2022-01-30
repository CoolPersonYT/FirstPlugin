package coolperson.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rules implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("rules")) {
            if (sender instanceof Player) {

                Player player = (Player) sender;
                player.getPlayer().sendMessage(ChatColor.BLUE + "--------------------\nRules of CoolPerson.me\n--------------------\n"
                        + ChatColor.AQUA + "\n 1. Don't Be an Idiot" + ChatColor.BLUE + "\n--------------------");
            }

        }
        return true;
    }
}
