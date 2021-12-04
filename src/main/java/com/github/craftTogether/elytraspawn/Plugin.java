package com.github.craftTogether.elytraspawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    public static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new ElytraSpawn(this), this);

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "ElytraSpawn-Plugin is active");
    }

}

