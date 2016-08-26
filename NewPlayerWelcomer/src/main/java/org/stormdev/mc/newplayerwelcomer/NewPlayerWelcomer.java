package org.stormdev.mc.newplayerwelcomer;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class NewPlayerWelcomer extends JavaPlugin implements Listener {
	@EventHandler
	public void onEnable(){
		Bukkit.getPluginManager().registerEvents(this, this);
		getLogger().info("New Player Welcomer enabled!");
	}
	
	@EventHandler
	void onJoin(PlayerJoinEvent event){
		if(!event.getPlayer().hasPlayedBefore()){
			Bukkit.broadcastMessage(ChatColor.AQUA+""+ChatColor.BOLD+"Welcome "+
					ChatColor.GREEN+ChatColor.BOLD+event.getPlayer().getName()+
					ChatColor.AQUA+ChatColor.BOLD+" to the server for the first time!");
		}
	}
}
