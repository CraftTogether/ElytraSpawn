package com.github.craftTogether.elytraspawn;

import org.bukkit.entity.Player;

public class Utilities {

    public static final double spawnRadius = Plugin.plugin.getConfig().getDouble("spawnRadius");
    public static final double multiplyValue = Plugin.plugin.getConfig().getDouble("multiplyValue");

    public static boolean isInSpawnRadius(Player player) {
        return player.getWorld().getSpawnLocation().distance(player.getLocation()) <= spawnRadius;
    }

}