/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.inventory.ItemStack
 */
package net.heropixels.flowers;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class FlowerCommand
implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player)sender;
            if (cmd.getName().equalsIgnoreCase("FLOWERS")) {
                Inventory inv = Bukkit.createInventory(null, 54, FlowersInventory.flowerInventoryName);
                inv.setContents(FlowersInventory.Flower.getContents().clone());
                FlowersInventory.setFlower(inv);

                FlowerEvent.flowerType.put(p.getUniqueId(), "FLOWERS");
                p.openInventory(inv);
            } else if (cmd.getName().equalsIgnoreCase("FLOWERTOGGLE")) {
                if (FlowerEvent.upOrdown.containsKey(p.getUniqueId()) && FlowerEvent.upOrdown.get(p.getUniqueId()).equalsIgnoreCase("DOWN")) {
                    FlowerEvent.upOrdown.remove(p.getUniqueId());
                    FlowerEvent.upOrdown.put(p.getUniqueId(), "UP");
                    p.sendMessage("§cDie Blumen werden nun nach oben platziert.");
                } else {
                    FlowerEvent.upOrdown.remove(p.getUniqueId());
                    FlowerEvent.upOrdown.put(p.getUniqueId(), "DOWN");
                    p.sendMessage("§cDie Blumen werden nun nach unten platziert.");
                }
            }
        }
        return false;
    }
}

