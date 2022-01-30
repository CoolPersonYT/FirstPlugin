package coolperson.firstplugin;

import coolperson.firstplugin.commands.rules;
import coolperson.firstplugin.commands.warps;
import coolperson.firstplugin.listeners.playerjoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Started");
        getServer().getPluginManager().registerEvents(new playerjoin(),this);
        this.getCommand("rules").setExecutor(new rules());
        this.getCommand("warp").setExecutor(new warps());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin Stopped");
    }
}




