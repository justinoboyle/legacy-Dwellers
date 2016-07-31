package com.arrayprolc.dwellers.core;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.arrayprolc.dwellers.dweller.Dweller;

public class DwellersCore extends JavaPlugin {

	private static DwellersCore instance;
	private static CustomConfig trackerInstance;

	public void onEnable() {
		
		instance = this;
		Dweller d = new Dweller("testGuy", new Location(Bukkit.getWorld("world"), 0, 0, 0), EntityType.COW, null, new String[] { "Hello!", "How are you?" }, new ItemStack(Material.DIAMOND_HELMET),
				new ItemStack(Material.DIAMOND_CHESTPLATE), new ItemStack(Material.DIAMOND_LEGGINGS), new ItemStack(Material.DIAMOND_BOOTS), new ItemStack(Material.DIAMOND_SWORD),
				null, false, true, false, false, false, true, false, false, true, true, UUID.randomUUID());
		d.save();
	}

	public static CustomConfig getTracker() {
		return trackerInstance;
	}

	public static DwellersCore getInstance() {
		return instance;
	}

}
