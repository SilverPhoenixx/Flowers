/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package net.heropixels.flowers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FlowersInventory {
    public static String flowerInventoryName = "§2Flowers";
    public static Inventory Flower = Bukkit.createInventory(null, 54, flowerInventoryName);
    public static HashMap<Integer, String> leaves = new HashMap();
    public static HashMap<Integer, String> saplings = new HashMap();
    public static HashMap<Integer, String> flowers = new HashMap();
    public static HashMap<Integer, String> grass = new HashMap();
    public static HashMap<Integer, String> water = new HashMap<>();

    public static void setLeaves() {
        leaves.put(0, "minecraft:oak_leaves");
        leaves.put(1, "minecraft:spruce_leaves");
        leaves.put(2, "minecraft:birch_leaves");
        leaves.put(3, "minecraft:jungle_leaves");
        leaves.put(4, "minecraft:acacia_leaves");
        leaves.put(5, "minecraft:dark_oak_leaves");
        leaves.put(6, "minecraft:azalea_leaves");
        leaves.put(9, "minecraft:flowering_azalea_leaves");
        leaves.put(12, "minecraft:nether_brick_fence");
        leaves.put(13, "minecraft:dark_oak_fence");
        leaves.put(14, "minecraft:spruce_fence");
        leaves.put(15, "minecraft:acacia_fence");
        leaves.put(18, "minecraft:jungle_fence");
        leaves.put(19, "minecraft:oak_fence");
        leaves.put(20, "minecraft:birch_fence");
        leaves.put(21, "minecraft:crimson_fence");
        leaves.put(22, "minecraft:warped_fence");
        leaves.put(23, "minecraft:mossy_cobblestone_wall");
        leaves.put(24, "minecraft:cobblestone_wall");
        leaves.put(27, "minecraft:flower_pot");
        leaves.put(28, "minecraft:mycelium");
        leaves.put(29, "minecraft:mossy_cobblestone");
        leaves.put(30, "minecraft:netherrack");
        leaves.put(31, "minecraft:soul_sand");
        leaves.put(32, "minecraft:diamond_block");
        leaves.put(33, "minecraft:gold_block");

    }
    public static void setUnderwater() {
        water.put(0, "minecraft:fire_coral[waterlogged=false]");
        water.put(1, "minecraft:fire_coral_fan[waterlogged=false]");
        water.put(2, "minecraft:tube_coral[waterlogged=false]");
        water.put(3, "minecraft:tube_coral_fan[waterlogged=false]");
        water.put(4, "minecraft:horn_coral[waterlogged=false]");
        water.put(5, "minecraft:horn_coral_fan[waterlogged=false]");
        water.put(9, "minecraft:bubble_coral[waterlogged=false]");
        water.put(10, "minecraft:bubble_coral_fan[waterlogged=false]");
        water.put(11, "minecraft:brain_coral[waterlogged=false]");
        water.put(12, "minecraft:brain_coral_fan[waterlogged=false]");
        water.put(18, "minecraft:lily_pad");
        water.put(19, "minecraft:sugar_cane");
    }

    public static void setUnderwater(Inventory inv) {
        inv.setItem(0, new ItemStack(Material.FIRE_CORAL, 1));
        inv.setItem(1, new ItemStack(Material.FIRE_CORAL_FAN, 1));
        inv.setItem(2, new ItemStack(Material.TUBE_CORAL, 1));
        inv.setItem(3, new ItemStack(Material.TUBE_CORAL, 1));
        inv.setItem(4, new ItemStack(Material.HORN_CORAL, 1));
        inv.setItem(5, new ItemStack(Material.HORN_CORAL_FAN, 1));
        inv.setItem(9, new ItemStack(Material.BUBBLE_CORAL, 1));
        inv.setItem(10, new ItemStack(Material.BUBBLE_CORAL_FAN, 1));
        inv.setItem(11, new ItemStack(Material.BRAIN_CORAL, 1));
        inv.setItem(12, new ItemStack(Material.BRAIN_CORAL_FAN, 1));
        inv.setItem(18, new ItemStack(Material.LILY_PAD, 1));
        inv.setItem(19, new ItemStack(Material.SUGAR_CANE, 1));
    }
    public static void setSaplings() {
        saplings.put(0, "minecraft:oak_sapling");
        saplings.put(1, "minecraft:spruce_sapling");
        saplings.put(2, "minecraft:birch_sapling");
        saplings.put(3, "minecraft:jungle_sapling");
        saplings.put(4, "minecraft:acacia_sapling");
        saplings.put(5, "minecraft:dark_oak_sapling");
        saplings.put(9, "minecraft:red_mushroom");
        saplings.put(10, "minecraft:brown_mushroom");
        saplings.put(11, "minecraft:crimson_fungus");
        saplings.put(12, "minecraft:warped_fungus");
        saplings.put(13, "minecraft:cactus");
        saplings.put(18, "minecraft:nether_wart");
        saplings.put(19, "minecraft:wheat[age=7]");
        saplings.put(20, "minecraft:pumpkin_stem[age=7]");
        saplings.put(21, "minecraft:cocoa[age=2]");
        saplings.put(22, "minecraft:sweet_berry_bush[age=3]");
        saplings.put(23, "minecraft:bamboo_sapling");
        saplings.put(24, "minecraft:bamboo[age=1,leaves=large,stage=1]");
    }

    public static void setGrass() {
        grass.put(0, "minecraft:peony[half=upper]");
        grass.put(9, "minecraft:peony[half=lower]");

        grass.put(1, "minecraft:rose_bush[half=upper]");
        grass.put(10, "minecraft:rose_bush[half=lower]");

        grass.put(2, "minecraft:tall_grass[half=upper]");
        grass.put(11, "minecraft:tall_grass[half=lower]");

        grass.put(3, "minecraft:large_fern[half=upper]");
        grass.put(12, "minecraft:large_fern[half=lower]");

        grass.put(4, "minecraft:lilac[half=upper]");
        grass.put(13, "minecraft:lilac[half=lower]");

        grass.put(5, "minecraft:sunflower[half=upper]");
        grass.put(14, "minecraft:sunflower[half=lower]");

        grass.put(6, "minecraft:small_dripleaf[half=upper,waterlogged=false]");
        grass.put(15, "minecraft:small_dripleaf[half=lower,waterlogged=false]");

        grass.put(18, "minecraft:fern");
        grass.put(19, "minecraft:grass");
        grass.put(20, "minecraft:dead_bush");
    }

    public static void setFlowers() {
        flowers.put(0, "minecraft:poppy");
        flowers.put(1, "minecraft:dandelion");
        flowers.put(2, "minecraft:blue_orchid");
        flowers.put(3, "minecraft:allium");
        flowers.put(4, "minecraft:azure_bluet");
        flowers.put(5, "minecraft:red_tulip");
        flowers.put(6, "minecraft:orange_tulip");
        flowers.put(9, "minecraft:white_tulip");
        flowers.put(10, "minecraft:pink_tulip");
        flowers.put(11, "minecraft:oxeye_daisy");
        flowers.put(12, "minecraft:cornflower");
        flowers.put(13, "minecraft:lily_of_the_valley");
        flowers.put(14, "minecraft:wither_rose");

        flowers.put(18, "minecraft:chorus_plant[down=true,up=true]");
        flowers.put(19, "minecraft:chorus_flower");
        flowers.put(20, "minecraft:azalea");
        flowers.put(21, "minecraft:flowering_azalea");
        flowers.put(22, "minecraft:spore_blossom");
        flowers.put(23, "minecraft:hanging_roots");
        flowers.put(24, "minecraft:big_dripleaf");
        flowers.put(27, "minecraft:weeping_vines_plant");
        flowers.put(28, "minecraft:crimson_roots");
        flowers.put(29, "minecraft:twisting_vines_plant");
        flowers.put(30, "minecraft:warped_roots");
        flowers.put(31, "minecraft:nether_sprouts");
        leaves.put(32, "minecraft:vine");

    }

    public static void setFlowerInventory() {
        ItemStack glasspane = FlowersInventory.createItemStack(new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1, (short) 13), "§2 ");
        Flower.setItem(7, glasspane);
        Flower.setItem(16, glasspane);
        Flower.setItem(25, glasspane);
        Flower.setItem(34, glasspane);
        Flower.setItem(43, glasspane);
        Flower.setItem(42, glasspane);
        Flower.setItem(41, glasspane);
        Flower.setItem(40, glasspane);
        Flower.setItem(39, glasspane);
        Flower.setItem(37, glasspane);
        Flower.setItem(36, glasspane);
        Flower.setItem(8, FlowersInventory.createItemStack(new ItemStack(Material.OAK_LEAVES, 1), "§aLaub"));
        Flower.setItem(17, FlowersInventory.createItemStack(new ItemStack(Material.OAK_SAPLING, 1), "§aSetzlinge"));
        Flower.setItem(26, FlowersInventory.createItemStack(new ItemStack(Material.TALL_GRASS, 1), "§aGräser"));
        Flower.setItem(35, FlowersInventory.createItemStack(new ItemStack(Material.POPPY, 1), "§aBlumen"));
        Flower.setItem(44, FlowersInventory.createItemStack(new ItemStack(Material.TUBE_CORAL), "§aUnterwasser"));
        Flower.setItem(38, FlowersInventory.createItemStack(new ItemStack(Material.REDSTONE_BLOCK), "§cLösche die erste Pflanze"));
        Flower.setItem(42, FlowersInventory.createItemStack(new ItemStack(Material.EMERALD_BLOCK), "§aErstelle Pflanze"));
    }

    public static ItemStack createItemStack(ItemStack it, String name) {
        ItemMeta mt = it.getItemMeta();
        mt.setDisplayName(name);
        it.setItemMeta(mt);
        return it;
    }

    public static void setFlower(Inventory inv) {
        inv.setItem(0, new ItemStack(Material.POPPY, 1));
        inv.setItem(1, new ItemStack(Material.DANDELION, 1));
        inv.setItem(2, new ItemStack(Material.BLUE_ORCHID, 1));
        inv.setItem(3, new ItemStack(Material.ALLIUM, 1));
        inv.setItem(4, new ItemStack(Material.AZURE_BLUET, 1));
        inv.setItem(5, new ItemStack(Material.RED_TULIP, 1));
        inv.setItem(6, new ItemStack(Material.ORANGE_TULIP, 1));
        inv.setItem(9, new ItemStack(Material.WHITE_TULIP, 1));
        inv.setItem(10, new ItemStack(Material.PINK_TULIP, 1));
        inv.setItem(11, new ItemStack(Material.OXEYE_DAISY, 1));
        inv.setItem(12, new ItemStack(Material.CORNFLOWER, 1));
        inv.setItem(13, new ItemStack(Material.LILY_OF_THE_VALLEY, 1));
        inv.setItem(14, new ItemStack(Material.WITHER_ROSE, 1));

        inv.setItem(18, new ItemStack(Material.CHORUS_PLANT));
        inv.setItem(19,  new ItemStack(Material.CHORUS_FLOWER));
        inv.setItem(20,  new ItemStack(Material.AZALEA));
        inv.setItem(21,  new ItemStack(Material.FLOWERING_AZALEA));
        inv.setItem(22,  new ItemStack(Material.SPORE_BLOSSOM));
        inv.setItem(23,  new ItemStack(Material.HANGING_ROOTS));
        inv.setItem(24,  new ItemStack(Material.BIG_DRIPLEAF));
        inv.setItem(27,  new ItemStack(Material.WEEPING_VINES));
        inv.setItem(28,  new ItemStack(Material.CRIMSON_ROOTS));
        inv.setItem(29,  new ItemStack(Material.TWISTING_VINES));
        inv.setItem(30,  new ItemStack(Material.WARPED_ROOTS));
        inv.setItem(31, new ItemStack(Material.NETHER_SPROUTS));
        inv.setItem(32, new ItemStack(Material.VINE));
    }

    public static void setLeaves(Inventory inv) {
        inv.setItem(0, new ItemStack(Material.OAK_LEAVES, 1 ));
        inv.setItem(1, new ItemStack(Material.SPRUCE_LEAVES, 1));
        inv.setItem(2, new ItemStack(Material.BIRCH_LEAVES, 1));
        inv.setItem(3, new ItemStack(Material.JUNGLE_LEAVES, 1));
        inv.setItem(4, new ItemStack(Material.ACACIA_LEAVES, 1));
        inv.setItem(5, new ItemStack(Material.DARK_OAK_LEAVES, 1));
        inv.setItem(6, new ItemStack(Material.AZALEA_LEAVES));
        inv.setItem(7, new ItemStack(Material.FLOWERING_AZALEA_LEAVES));
        inv.setItem(12, new ItemStack(Material.NETHER_BRICK_FENCE, 1));
        inv.setItem(13, new ItemStack(Material.DARK_OAK_FENCE, 1));
        inv.setItem(14, new ItemStack(Material.SPRUCE_FENCE, 1));
        inv.setItem(15, new ItemStack(Material.ACACIA_FENCE, 1));
        inv.setItem(18, new ItemStack(Material.JUNGLE_FENCE, 1));
        inv.setItem(19, new ItemStack(Material.OAK_FENCE, 1));
        inv.setItem(20, new ItemStack(Material.BIRCH_FENCE, 1));
        inv.setItem(21, new ItemStack(Material.CRIMSON_FENCE));
        inv.setItem(22, new ItemStack(Material.WARPED_FENCE));
        inv.setItem(23, new ItemStack(Material.COBBLESTONE_WALL, 1));
        inv.setItem(24, new ItemStack(Material.MOSSY_COBBLESTONE_WALL, 1));
        inv.setItem(27, new ItemStack(Material.FLOWER_POT));
        inv.setItem(28, new ItemStack(Material.MYCELIUM));
        inv.setItem(29, new ItemStack(Material.MOSSY_COBBLESTONE));
        inv.setItem(30, new ItemStack(Material.NETHERRACK));
        inv.setItem(31, new ItemStack(Material.SOUL_SAND));
        inv.setItem(32, new ItemStack(Material.DIAMOND_BLOCK));
        inv.setItem(33, new ItemStack(Material.GOLD_BLOCK));
    }

    public static void setGrass(Inventory inv) {
        inv.setItem(0, new ItemStack(Material.PEONY, 1));
        inv.setItem(9, new ItemStack(Material.PEONY, 1));

        inv.setItem(1, new ItemStack(Material.ROSE_BUSH, 1));
        inv.setItem(10, new ItemStack(Material.ROSE_BUSH, 1));

        inv.setItem(2, new ItemStack(Material.TALL_GRASS, 1));
        inv.setItem(11, new ItemStack(Material.TALL_GRASS, 1));

        inv.setItem(3, new ItemStack(Material.LARGE_FERN, 1));
        inv.setItem(12, new ItemStack(Material.LARGE_FERN, 1));

        inv.setItem(4, new ItemStack(Material.LILAC, 1));
        inv.setItem(13, new ItemStack(Material.LILAC, 1));

        inv.setItem(5, new ItemStack(Material.SUNFLOWER, 1));
        inv.setItem(14, new ItemStack(Material.SUNFLOWER, 1));

        inv.setItem(6, new ItemStack(Material.SMALL_DRIPLEAF, 1));
        inv.setItem(15, new ItemStack(Material.SMALL_DRIPLEAF, 1));

        inv.setItem(18, new ItemStack(Material.FERN, 1));
        inv.setItem(19, new ItemStack(Material.GRASS, 1));
        inv.setItem(20, new ItemStack(Material.DEAD_BUSH, 1));
    }

    public static void setSapling(Inventory inv) {
        inv.setItem(0, new ItemStack(Material.OAK_SAPLING, 1));
        inv.setItem(1, new ItemStack(Material.SPRUCE_SAPLING, 1));
        inv.setItem(2, new ItemStack(Material.BIRCH_SAPLING, 1));
        inv.setItem(3, new ItemStack(Material.JUNGLE_SAPLING, 1));
        inv.setItem(4, new ItemStack(Material.ACACIA_SAPLING, 1));
        inv.setItem(5, new ItemStack(Material.DARK_OAK_SAPLING, 1));

        inv.setItem(9, new ItemStack(Material.RED_MUSHROOM, 1));
        inv.setItem(10, new ItemStack(Material.BROWN_MUSHROOM, 1));
        inv.setItem(11, new ItemStack(Material.CRIMSON_FUNGUS, 1));
        inv.setItem(12, new ItemStack(Material.WARPED_FUNGUS, 1));
        inv.setItem(13, new ItemStack(Material.CACTUS, 1));
        inv.setItem(18, new ItemStack(Material.NETHER_WART));
        inv.setItem(19, new ItemStack(Material.WHEAT_SEEDS));
        inv.setItem(20, new ItemStack(Material.PUMPKIN_SEEDS));
        inv.setItem(21, new ItemStack(Material.COCOA_BEANS));
        inv.setItem(22, new ItemStack(Material.SWEET_BERRIES));
        inv.setItem(23, new ItemStack(Material.GREEN_DYE));
        inv.setItem(24, new ItemStack(Material.BAMBOO));
    }
}

