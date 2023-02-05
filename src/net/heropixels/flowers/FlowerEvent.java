/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.inventory.ClickType
 *  org.bukkit.event.inventory.InventoryAction
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryCloseEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.bukkit.plugin.Plugin
 */
package net.heropixels.flowers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class FlowerEvent
implements Listener {
    public static HashMap<UUID, String> flowerType = new HashMap();
    public static HashMap<UUID, ArrayList<String>> flowerIds = new HashMap();
    public static HashMap<UUID, String> upOrdown = new HashMap();

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getAction() == InventoryAction.UNKNOWN || e.getAction() == InventoryAction.NOTHING) {
            return;
        }
        if (e.getClick() == ClickType.UNKNOWN) {
            return;
        }
        if (e.getView().getTitle().equals("§2Flowers")) {
            e.setCancelled(true);
            Player p = (Player)e.getWhoClicked();
            if (e.getClickedInventory() == p.getInventory()) {
                return;
            }
            if (e.getCurrentItem() == null) {
                return;
            }
            if(e.getCurrentItem().getType() == Material.BLACK_STAINED_GLASS_PANE) return;;
            if (e.getSlot() == 8) {
                this.clearInventory(e.getClickedInventory());
                if (flowerType.containsKey(p.getUniqueId())) {
                    flowerType.remove(p.getUniqueId());
                }
                flowerType.put(p.getUniqueId(), "LEAVES");
                FlowersInventory.setLeaves(e.getClickedInventory());
                return;
            }
            if (e.getSlot() == 17) {
                this.clearInventory(e.getClickedInventory());
                if (flowerType.containsKey(p.getUniqueId())) {
                    flowerType.remove(p.getUniqueId());
                }
                flowerType.put(p.getUniqueId(), "SAPLINGS");
                FlowersInventory.setSapling(e.getClickedInventory());
                return;
            }
            if (e.getSlot() == 26) {
                this.clearInventory(e.getClickedInventory());
                if (flowerType.containsKey(p.getUniqueId())) {
                    flowerType.remove(p.getUniqueId());
                }
                flowerType.put(p.getUniqueId(), "GRASS");
                FlowersInventory.setGrass(e.getClickedInventory());
                return;
            }
            if (e.getSlot() == 35) {
                this.clearInventory(e.getClickedInventory());
                if (flowerType.containsKey(p.getUniqueId())) {
                    flowerType.remove(p.getUniqueId());
                }
                flowerType.put(p.getUniqueId(), "FLOWERS");
                FlowersInventory.setFlower(e.getClickedInventory());
                return;
            }
            if (e.getSlot() == 44) {
                this.clearInventory(e.getClickedInventory());
                if (flowerType.containsKey(p.getUniqueId())) {
                    flowerType.remove(p.getUniqueId());
                }
                flowerType.put(p.getUniqueId(), "UNDERWATER");
                FlowersInventory.setUnderwater(e.getClickedInventory());
                return;
            }
            if (e.getSlot() == 42) {
                ItemStack itemStack = FlowersInventory.createItemStack(new ItemStack(Material.GRASS_BLOCK), "§aFlowers");
                ItemMeta meta = itemStack.getItemMeta();
                if (flowerIds.containsKey(p.getUniqueId())) {
                    meta.setLore(flowerIds.get(p.getUniqueId()));
                }
                itemStack.setItemMeta(meta);
                p.getInventory().addItem(new ItemStack[]{itemStack});
                return;
            }
            if (e.getSlot() == 38) {
                if (flowerIds.containsKey(p.getUniqueId())) {
                    if (flowerIds.get(p.getUniqueId()).isEmpty()) {
                        return;
                    }
                    e.getClickedInventory().setItem(44 + flowerIds.get(p.getUniqueId()).size(), new ItemStack(Material.AIR));
                    flowerIds.get(p.getUniqueId()).remove(flowerIds.get(p.getUniqueId()).size() - 1);
                }
                return;
            }
            if (flowerType.get(p.getUniqueId()).equals("FLOWERS")) {
                this.addIdToList(p, e.getCurrentItem(), e.getClickedInventory(), FlowersInventory.flowers.get(e.getSlot()));
            } else if (flowerType.get(p.getUniqueId()).equals("SAPLINGS")) {
                this.addIdToList(p, e.getCurrentItem(), e.getClickedInventory(), FlowersInventory.saplings.get(e.getSlot()));
            } else if (flowerType.get(p.getUniqueId()).equals("GRASS")) {
                this.addIdToList(p, e.getCurrentItem(), e.getClickedInventory(), FlowersInventory.grass.get(e.getSlot()));
            } else if (flowerType.get(p.getUniqueId()).equals("LEAVES")) {
                this.addIdToList(p, e.getCurrentItem(), e.getClickedInventory(), FlowersInventory.leaves.get(e.getSlot()));
            } else if(flowerType.get(p.getUniqueId()).equalsIgnoreCase("UNDERWATER")) {
                this.addIdToList(p, e.getCurrentItem(), e.getClickedInventory(), FlowersInventory.water.get(e.getSlot()));
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
        if (e.getView().getTitle().contains("§2Flowers")) {
            if (flowerIds.containsKey(e.getPlayer().getUniqueId())) {
                flowerIds.remove(e.getPlayer().getUniqueId());
            }
            if (flowerType.containsKey(e.getPlayer().getUniqueId())) {
                flowerType.remove(e.getPlayer().getUniqueId());
            }
        }
    }

    @EventHandler(ignoreCancelled=false)
    public void onPlace(final BlockPlaceEvent e) {
        final Player p = e.getPlayer();
        if (p.getInventory().getItemInMainHand().hasItemMeta() && p.getInventory().getItemInMainHand().getItemMeta().hasLore() && p.getInventory().getItemInHand().getItemMeta().hasDisplayName() && p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§aFlowers")) {
            e.setCancelled(true);
            Bukkit.getScheduler().scheduleSyncDelayedTask(Flowers.getInstance(), new Runnable(){

                @Override
                public void run() {
                    Block b = e.getBlockPlaced();
                    if (upOrdown.containsKey(p.getUniqueId()) && upOrdown.get(p.getUniqueId()).equalsIgnoreCase("DOWN")) {
                        FlowerEvent.this.setDown(p, e.getBlockPlaced());
                    } else {
                        FlowerEvent.this.setUp(p, e.getBlockPlaced());
                    }
                }
            }, 1L);
        }
    }

    public void addIdToList(Player p, ItemStack itemStack, Inventory inv, String id) {
        if (itemStack == null) {
            return;
        }
        if (flowerIds.get(p.getUniqueId()) != null && flowerIds.get(p.getUniqueId()).size() >= 9) {
            return;
        }
        if (!flowerIds.containsKey(p.getUniqueId())) {
            flowerIds.put(p.getUniqueId(), new ArrayList());
        }
        flowerIds.get(p.getUniqueId()).add(id);
        inv.setItem(44 + flowerIds.get(p.getUniqueId()).size(), itemStack);
    }

    public void setDown(Player p, Block pasteBlock) {
        List<String> ids = p.getInventory().getItemInMainHand().getItemMeta().getLore();
        int i = 0;
        for (String blockdata : ids) {
            Block block = pasteBlock.getLocation().subtract(0.0, i, 0.0).getBlock();
            if (block.getType() != Material.AIR) {
                ++i;
                continue;
            }
            ++i;
            block.setBlockData(Bukkit.createBlockData(blockdata));
        }
    }

    public void setUp(Player p, Block pasteBlock) {
        List<String> ids = p.getInventory().getItemInMainHand().getItemMeta().getLore();
        int i = 0;
        for (String blockdata : ids) {
            Block block = pasteBlock.getLocation().add(0.0, i, 0.0).getBlock();
            if (block.getType() != Material.AIR) {
                ++i;
                continue;
            }
            ++i;
            block.setBlockData(Bukkit.createBlockData(blockdata));
        }
    }

    public void clearInventory(Inventory inv) {
        for (int reihe = 0; reihe < 4; ++reihe) {
            for (int slot = 0; slot < 7; ++slot) {
                int x = reihe * 9;
                if (inv.getItem(x + slot) == null) continue;
                inv.setItem(x + slot, new ItemStack(Material.AIR));
            }
        }
    }

}

