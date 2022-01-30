package coolperson.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class warps implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("spawn")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Teleporting to Spawn in 5 Seconds");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    player.teleport(new Location(Bukkit.getWorld("world"), 0, 200, 0));
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Successfully Teleported to Spawn!");
                } else if (args[0].equalsIgnoreCase("mall")) {
                    player.sendMessage("There isn't a mall yet, why don't you make one?");
                } else if (args[0].equalsIgnoreCase("list")) {
                    player.sendMessage(ChatColor.BLUE + "----Warp-List----" + ChatColor.AQUA + "\n- /warp spawn\n- /warp mall" + ChatColor.BLUE + "\n----------------");
                } else {
                        player.sendMessage(ChatColor.BLUE + "----Warp-List----" + ChatColor.AQUA + "\n- /warp spawn\n- /warp mall"
                                + ChatColor.BLUE + "\n----------------" +  ChatColor.RED + "\nThat is not a valid warp,\ntry one of the above.");
                    }
                }
            }
        return true;
        }
    }
