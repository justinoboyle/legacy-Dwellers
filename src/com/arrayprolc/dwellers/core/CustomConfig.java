package com.arrayprolc.dwellers.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class CustomConfig {

	private FileConfiguration customConfig = null;
	private File customConfigFile = null;
	private String name;

	public CustomConfig(String fileName) {
		this.name = fileName;
	}

	public void reloadCustomConfig() {
		if (customConfigFile == null) {
			customConfigFile = new File(DwellersCore.getInstance()
					.getDataFolder(), name);
		}
		customConfig = YamlConfiguration.loadConfiguration(customConfigFile);

		Reader defConfigStream;
		try {
			defConfigStream = new InputStreamReader(DwellersCore.getInstance()
					.getResource(name), "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return;
		}
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration
					.loadConfiguration(defConfigStream);
			customConfig.setDefaults(defConfig);
		}
	}

	public File getCustomConfigFile() {
		return customConfigFile;
	}

	public void setCustomConfigFile(File customConfigFile) {
		this.customConfigFile = customConfigFile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCustomConfig(FileConfiguration customConfig) {
		this.customConfig = customConfig;
	}

	public FileConfiguration getCustomConfig() {
		if (customConfig == null) {
			reloadCustomConfig();
		}
		return customConfig;
	}

	public void saveCustomConfig() {
		if (customConfig == null || customConfigFile == null) {
			return;
		}
		try {
			getCustomConfig().save(customConfigFile);
		} catch (IOException ex) {
			DwellersCore
					.getInstance()
					.getLogger()
					.log(Level.SEVERE,
							"Could not save config to " + customConfigFile, ex);
		}
	}

}
