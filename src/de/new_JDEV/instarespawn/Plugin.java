package de.new_JDEV.instarespawn;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new DeathEvent(), this);
	}
	
}
