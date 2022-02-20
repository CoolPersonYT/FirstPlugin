package coolperson.firstplugin;

import coolperson.firstplugin.commands.Rules;
import coolperson.firstplugin.commands.Warps;
import coolperson.firstplugin.listeners.PlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        this.getCommand("rules").setExecutor(new Rules());
        this.getCommand("warp").setExecutor(new Warps());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}




