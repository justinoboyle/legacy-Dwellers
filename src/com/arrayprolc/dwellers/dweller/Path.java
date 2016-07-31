package com.arrayprolc.dwellers.dweller;

import java.util.ArrayList;

import org.bukkit.Location;

public class Path {

	private ArrayList<Location> points = new ArrayList<Location>();
	private int ticksInBetweenPoints;
	private boolean shouldTeleportToStart;
	private boolean shouldUseAI;
	private int currentPoint;

	public Path(ArrayList<Location> points, int ticksInBetweenPoints,
			boolean shouldTeleportToStart, boolean shouldUseAI, int currentPoint) {
		super();
		this.points = points;
		this.ticksInBetweenPoints = ticksInBetweenPoints;
		this.shouldTeleportToStart = shouldTeleportToStart;
		this.shouldUseAI = shouldUseAI;
		this.currentPoint = currentPoint;
	}

	public ArrayList<Location> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Location> points) {
		this.points = points;
	}

	public int getTicksInBetweenPoints() {
		return ticksInBetweenPoints;
	}

	public void setTicksInBetweenPoints(int ticksInBetweenPoints) {
		this.ticksInBetweenPoints = ticksInBetweenPoints;
	}

	public boolean getShouldTeleportToStart() {
		return shouldTeleportToStart;
	}

	public void setShouldTeleportToStart(boolean shouldTeleportToStart) {
		this.shouldTeleportToStart = shouldTeleportToStart;
	}

	public boolean getShouldUseAI() {
		return shouldUseAI;
	}

	public void setShouldUseAI(boolean shouldUseAI) {
		this.shouldUseAI = shouldUseAI;
	}

	public int getCurrentPoint() {
		return currentPoint;
	}

	public void setCurrentPoint(int currentPoint) {
		this.currentPoint = currentPoint;
	}

}
