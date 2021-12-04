package com.github.x3rition.elytraspawn;

import org.bukkit.entity.Player;

public class Utilities {

    public static final double spawnRadius = ElytraPluginMain.plugin.getConfig().getDouble("spawnRadius");
    public static final double multiplyValue = ElytraPluginMain.plugin.getConfig().getDouble("multiplyValue");

    public static boolean isInSpawnRadius(Player player) {
        if (!player.getWorld().getName().equals("world")) {
            return false;
        } else {
            return player.getWorld().getSpawnLocation().distance(player.getLocation()) <= spawnRadius;
        }
    }

}