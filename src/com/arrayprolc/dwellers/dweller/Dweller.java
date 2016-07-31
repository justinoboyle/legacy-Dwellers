package com.arrayprolc.dwellers.dweller;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.arrayprolc.dwellers.core.DwellersCore;

public class Dweller {

	private String name;
	private Location location;
	private EntityType type;
	private SettingsPackage settingsPackage;
	private String[] lines;
	private ItemStack itemHelmet;
	private ItemStack itemChestplate;
	private ItemStack itemLeggings;
	private ItemStack itemBoots;
	private ItemStack itemHand;
	private Path path;
	private boolean hasPath;
	private boolean doesTalk;
	private boolean doesLookAtPlayer;
	private boolean hasDefaultAI;
	private boolean canMove;
	private boolean getPushable;
	private boolean shouldDisplayName;
	private boolean hasGravity;
	private boolean getDamageable;
	private boolean getInteractable;
	private UUID uniqueId;

	public Dweller(String name, Location location, EntityType type,
			SettingsPackage settingsPackage, String[] lines,
			ItemStack itemHelmet, ItemStack itemChestplate,
			ItemStack itemLeggings, ItemStack itemBoots, ItemStack itemHand,
			Path path, boolean hasPath, boolean doesTalk,
			boolean doesLookAtPlayer, boolean hasDefaultAI, boolean canMove,
			boolean getPushable, boolean shouldDisplayName, boolean hasGravity,
			boolean getDamageable, boolean getInteractable, UUID uniqueId) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.settingsPackage = settingsPackage;
		this.lines = lines;
		this.itemHelmet = itemHelmet;
		this.itemChestplate = itemChestplate;
		this.itemLeggings = itemLeggings;
		this.itemBoots = itemBoots;
		this.itemHand = itemHand;
		this.path = path;
		this.hasPath = hasPath;
		this.doesTalk = doesTalk;
		this.doesLookAtPlayer = doesLookAtPlayer;
		this.hasDefaultAI = hasDefaultAI;
		this.canMove = canMove;
		this.getPushable = getPushable;
		this.shouldDisplayName = shouldDisplayName;
		this.hasGravity = hasGravity;
		this.getDamageable = getDamageable;
		this.getInteractable = getInteractable;
		this.uniqueId = uniqueId;
	}

	public Dweller(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public EntityType getType() {
		return type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public SettingsPackage getSettingsPackage() {
		return settingsPackage;
	}

	public void setSettingsPackage(SettingsPackage settingsPackage) {
		this.settingsPackage = settingsPackage;
	}

	public String[] getLines() {
		return lines;
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}

	public ItemStack getItemHelmet() {
		return itemHelmet;
	}

	public void setItemHelmet(ItemStack itemHelmet) {
		this.itemHelmet = itemHelmet;
	}

	public ItemStack getItemChestplate() {
		return itemChestplate;
	}

	public void setItemChestplate(ItemStack itemChestplate) {
		this.itemChestplate = itemChestplate;
	}

	public ItemStack getItemLeggings() {
		return itemLeggings;
	}

	public void setItemLeggings(ItemStack itemLeggings) {
		this.itemLeggings = itemLeggings;
	}

	public ItemStack getItemBoots() {
		return itemBoots;
	}

	public void setItemBoots(ItemStack itemBoots) {
		this.itemBoots = itemBoots;
	}

	public ItemStack getItemHand() {
		return itemHand;
	}

	public void setItemHand(ItemStack itemHand) {
		this.itemHand = itemHand;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public boolean getHasPath() {
		return hasPath;
	}

	public void setHasPath(boolean hasPath) {
		this.hasPath = hasPath;
	}

	public boolean getDoesTalk() {
		return doesTalk;
	}

	public void setDoesTalk(boolean doesTalk) {
		this.doesTalk = doesTalk;
	}

	public boolean getDoesLookAtPlayer() {
		return doesLookAtPlayer;
	}

	public void setDoesLookAtPlayer(boolean doesLookAtPlayer) {
		this.doesLookAtPlayer = doesLookAtPlayer;
	}

	public boolean getHasDefaultAI() {
		return hasDefaultAI;
	}

	public void setHasDefaultAI(boolean hasDefaultAI) {
		this.hasDefaultAI = hasDefaultAI;
	}

	public boolean getCanMove() {
		return canMove;
	}

	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}

	public boolean getPushable() {
		return getPushable;
	}

	public void setPushable(boolean getPushable) {
		this.getPushable = getPushable;
	}

	public boolean getshouldDisplayName() {
		return shouldDisplayName;
	}

	public void setshouldDisplayName(boolean shouldDisplayName) {
		this.shouldDisplayName = shouldDisplayName;
	}

	public boolean getHasGravity() {
		return hasGravity;
	}

	public void setHasGravity(boolean hasGravity) {
		this.hasGravity = hasGravity;
	}

	public boolean getDamageable() {
		return getDamageable;
	}

	public void setDamageable(boolean getDamageable) {
		this.getDamageable = getDamageable;
	}

	public boolean getInteractable() {
		return getInteractable;
	}

	public void setInteractable(boolean getInteractable) {
		this.getInteractable = getInteractable;
	}

	public UUID getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(UUID uniqueId) {
		this.uniqueId = uniqueId;
	}
/*	this.name = name;
	this.location = location;
	this.type = type;
	this.settingsPackage = settingsPackage;
	this.lines = lines;
	this.itemHelmet = itemHelmet;
	this.itemChestplate = itemChestplate;
	this.itemLeggings = itemLeggings;
	this.itemBoots = itemBoots;
	this.itemHand = itemHand;
	this.path = path;
	this.hasPath = hasPath;
	this.doesTalk = doesTalk;
	this.doesLookAtPlayer = doesLookAtPlayer;
	this.hasDefaultAI = hasDefaultAI;
	this.canMove = canMove;
	this.getPushable = getPushable;
	this.shouldDisplayName = shouldDisplayName;
	this.hasGravity = hasGravity;
	this.getDamageable = getDamageable;
	this.getInteractable = getInteractable;
	this.uniqueId = uniqueId;*/
	public void save() {
		
		String p = "Dweller." + this.getName() + ".";
		
		DwellersCore.getInstance().getConfig().set(p + "location", location);
		DwellersCore.getInstance().getConfig().set(p + "type", type.toString());
		//settingsPackage.save(p);
		DwellersCore.getInstance().getConfig().set(p + "lines", lines);
		DwellersCore.getInstance().getConfig().set(p + "itemHelmet", itemHelmet);
		DwellersCore.getInstance().getConfig().set(p + "itemChestplate", itemChestplate);
		DwellersCore.getInstance().getConfig().set(p + "itemLeggings", itemLeggings);
		DwellersCore.getInstance().getConfig().set(p + "itemBoots", itemBoots);
		DwellersCore.getInstance().getConfig().set(p + "itemHand", itemHand);
		//path.save();
		DwellersCore.getInstance().getConfig().set(p + "doesTalk", doesTalk);
		DwellersCore.getInstance().getConfig().set(p + "doesLookAtPlayer", doesLookAtPlayer);
		DwellersCore.getInstance().getConfig().set(p + "hasDefaultAI", hasDefaultAI);
		DwellersCore.getInstance().getConfig().set(p + "canMove", canMove);
		DwellersCore.getInstance().getConfig().set(p + "getPushable", getPushable);
		DwellersCore.getInstance().getConfig().set(p + "shouldDisplayName", shouldDisplayName);
		DwellersCore.getInstance().getConfig().set(p + "hasGravity", hasGravity);
		DwellersCore.getInstance().getConfig().set(p + "getDamageable", getDamageable);
		DwellersCore.getInstance().getConfig().set(p + "getInteractable", getInteractable);
		DwellersCore.getInstance().getConfig().set(p + "uniqueId", uniqueId);
		
		DwellersCore.getInstance().saveConfig();
		
	}

}
