package com.arrayprolc.dwellers.event;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.arrayprolc.dwellers.dweller.Dweller;

public class DwellerSpawnEvent extends Event implements Cancellable {

	boolean cancelled = false;
	HandlerList handlers = new HandlerList();
	Dweller dweller;
	Location spawnLocation;

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public void setHandlers(HandlerList handlers) {
		this.handlers = handlers;
	}

	public Dweller getDweller() {
		return dweller;
	}

	public void setDweller(Dweller dweller) {
		this.dweller = dweller;
	}

	public Location getSpawnLocation() {
		return spawnLocation;
	}

	public void setSpawnLocation(Location spawnLocation) {
		this.spawnLocation = spawnLocation;
	}

}
