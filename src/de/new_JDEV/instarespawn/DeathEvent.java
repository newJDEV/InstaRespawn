package de.new_JDEV.instarespawn;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {
	
	@EventHandler
	public void onDeath(PlayerDeathEvent pde) {
		Player p = pde.getEntity().getPlayer();
		Location loc = p.getWorld().getSpawnLocation();
		loc = p.getWorld().getHighestBlockAt(loc).getLocation();
		p.setHealth(20);
		p.teleport(loc);
	}
	
}
