package com.github.x3rition.elytraspawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import com.github.x3rition.elytraspawn.ElytraSpawn;

public final class ElytraPluginMain extends JavaPlugin {

    public ElytraPluginMain() {
    }

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new ElytraSpawn(this), this);

        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "ElytraSpawn-Plugin is active");
    }

    @Override
    public void onDisable() {
        //nothing to do :)))
    }
}

