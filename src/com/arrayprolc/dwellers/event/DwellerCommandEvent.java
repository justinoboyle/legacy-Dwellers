package com.arrayprolc.dwellers.event;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DwellerCommandEvent extends Event implements Cancellable {

	CommandSender sender;
	Command command;
	String label;
	String[] args;
	String cancelledMessage;
	boolean cancelled = false;
	HandlerList handlers = new HandlerList();

	public CommandSender getSender() {
		return sender;
	}

	public Command getCommand() {
		return command;
	}

	public String getLabel() {
		return label;
	}

	public String[] getArgs() {
		return args;
	}

	public String getCancelledMessage() {
		return cancelledMessage;
	}

	public void setCancelledMessage(String cancelledMessage) {
		this.cancelledMessage = cancelledMessage;
	}

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

}
