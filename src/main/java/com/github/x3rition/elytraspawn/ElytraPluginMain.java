package com.github.x3rition.elytraspawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ElytraPluginMain extends JavaPlugin {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new ElytraSpawn(this), this);

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new SpawnProtectListener(), this);


        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Elytra-Spawn-Plugin is active");
    }

    @Override
    public void onDisable() {
        //nothing to do :)))
    }
}