package com.arrayprolc.dwellers.util;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

public class DwellerUtil {

	public static void callEvent(Event event) {
		Bukkit.getPluginManager().callEvent(event);
	}

}
