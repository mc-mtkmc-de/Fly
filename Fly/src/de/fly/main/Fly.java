package de.fly.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.fly.command.FlyCommand;

public class Fly extends JavaPlugin {
	
	private static Fly plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("fly").setExecutor(new FlyCommand());
		
	}
	
	public static Fly getplugin() {
		return plugin;
	}

}
