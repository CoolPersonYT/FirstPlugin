package coolperson.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import coolperson.firstplugin.Main;
public class Warps implements CommandExecutor {
    Main plugin;
    public Warps(Main main){
        this.plugin = main;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            
            if (args.length > 0) {
                switch(args[0].toLowerCase()){
                    case "spawn":
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Teleporting to Spawn in 5 Seconds");
                        new BukkitRunnable(){ 
                            @Override
                            public void run(){
                                player.teleport(new Location(Bukkit.getWorld("world"), 0, 200, 0));
                                player.sendMessage(ChatColor.LIGHT_PURPLE + "Successfully Teleported to Spawn!");
                            }
                        }.runTaskLater(this.plugin,100L);
                        break;
                    case "mall"->player.sendMessage("There isn't a mall yet, why don't you make one?");
                    case "list"->player.sendMessage(ChatColor.BLUE + "----Warp-List----" + ChatColor.AQUA + "\n- /warp spawn\n- /warp mall" + ChatColor.BLUE + "\n----------------");
                    default ->  player.sendMessage(ChatColor.BLUE + "----Warp-List----" + ChatColor.AQUA + "\n- /warp spawn\n- /warp mall"
                                + ChatColor.BLUE + "\n----------------" +  ChatColor.RED + "\nThat is not a valid warp,\ntry one of the above.");

                }
               
            } else {
                player.sendMessage(ChatColor.BLUE + "----Warp-List----" + ChatColor.AQUA + "\n- /warp spawn\n- /warp mall"
                                + ChatColor.BLUE + "\n----------------" +  ChatColor.RED + "\nThat is not a valid warp,\ntry one of the above.");
            }
        return true;
        }
    }
