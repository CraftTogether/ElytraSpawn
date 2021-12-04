package com.github.craftTogether.elytraspawn;

import org.bukkit.entity.Player;

public class Utilities {

    public static final double spawnRadius = ElytraPluginMain.plugin.getConfig().getDouble("spawnRadius");
    public static final double multiplyValue = ElytraPluginMain.plugin.getConfig().getDouble("multiplyValue");

    public static boolean isInSpawnRadius(Player player) {
        return player.getWorld().getSpawnLocation().distance(player.getLocation()) <= spawnRadius;
    }

}
