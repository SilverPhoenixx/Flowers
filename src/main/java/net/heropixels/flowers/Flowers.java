/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package net.heropixels.flowers;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Flowers
extends JavaPlugin {
    public static Flowers instance;

    public void onEnable() {
        instance = this;
        this.getCommand("Flowers").setExecutor(new FlowerCommand());
        Bukkit.getPluginManager().registerEvents(new FlowerEvent(), this);
        FlowersInventory.setLeaves();
        FlowersInventory.setUnderwater();
        FlowersInventory.setGrass();
        FlowersInventory.setFlowers();
        FlowersInventory.setSaplings();
        FlowersInventory.setFlowerInventory();
        super.onEnable();
    }

    public void onDisable() {
        super.onDisable();
    }

    public static Flowers getInstance() {
        return instance;
    }
}

