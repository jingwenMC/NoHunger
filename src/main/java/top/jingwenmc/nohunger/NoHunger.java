package top.jingwenmc.nohunger;

import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;
import top.jingwenmc.nohunger.commands.nohungertoggle;
import top.jingwenmc.nohunger.events.Hunger;

public final class NoHunger extends JavaPlugin {
    public static Boolean isEnabled = true;
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[NoHunger]Registering Command...");
        getCommand("nohungertoggle").setExecutor(new nohungertoggle());
        System.out.println("[NoHunger]Registering Event...");
        getServer().getPluginManager().registerEvents(new Hunger(),this);
        System.out.println("[NoHunger]Enabled.");
        System.out.println("[NoHunger]Plugin by jingwenMC , for KinoMC");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[NoHunger]Disabled...");
        System.out.println("[NoHunger]Plugin by jingwenMC , for KinoMC");
    }
}
