package com.github.craftTogether.elytraspawn;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class SpawnProtectListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Bukkit.getWorld("world").getPlayers().forEach((player) -> {
            if (event.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                if (Utilities.isInSpawnRadius(player)) {
                    event.setCancelled(true);
                }

            }
        });
    }

    @EventHandler
    public void onBlockBrake(BlockBreakEvent event) {
        Bukkit.getWorld("world").getPlayers().forEach((player) -> {
            if (event.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                if (Utilities.isInSpawnRadius(player)) {
                    event.setCancelled(true);
                }
            }
        });
    }

}
