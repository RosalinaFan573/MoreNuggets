package mods.rfan573.morenuggets;

import net.fybertech.meddle.MeddleMod;
import net.fybertech.meddleapi.MeddleAPI;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.creativetab.CreativeTabs;

@MeddleMod(id = "MoreNuggets", author = "RosalinaFan573")
public class MoreNuggets {

	//Item Definitions
	public static final Item itemNuggetIron = new ItemMoreNuggets("Iron Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetIron");
	public static final Item itemNuggetDiamond = new ItemMoreNuggets("Diamond Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetDiamond");
	public static final Item itemNuggetLapis = new ItemMoreNuggets("Lapis Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetLapis");
	public static final Item itemNuggetObsidian = new ItemMoreNuggets("Obsidian Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetObsidian");
	public static final Item itemNuggetEmerald = new ItemMoreNuggets("Emerald Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetEmerald");
	public static final Item itemNuggetDiorite = new ItemMoreNuggets("Diorite Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetDiorite");
	public static final Item itemNuggetAndesite = new ItemMoreNuggets("Andesite Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetAndesite");
	public static final Item itemNuggetGranite = new ItemMoreNuggets("Granite Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetGranite");
	public static final Item itemNuggetChorus = new ItemMoreNuggets("Chorus Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetChorus");
	public static final Item itemNuggetPrismarine = new ItemMoreNuggets("Prismarine Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetPrismarine");
	public static final Item itemStoneBrick = new ItemMoreNuggets("Stone Brick").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("stoneBrickItem");
	public static final Item itemNuggetQuartz = new ItemMoreNuggets("Quartz Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetQuartz");
	public static final Item itemNuggetChicken = new ItemMoreNuggets("Chicken Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetChicken");
	public static final Item itemNuggetStone = new ItemMoreNuggets("Stone Nugget").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetStone");
	public static final Item itemNuggetBiscuit = new ItemMoreNuggets("Nugget in a Biscuit").setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("nuggetInABiscuit");
	public static final Item itemShardObsidian = new ItemMoreNuggets("Obsidian Shard").setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("shardObsidian");

	public void init() {
		//MeddleAPI Registers
		MeddleAPI.registerItem(1400, "iron_nugget", itemNuggetIron);
		MeddleAPI.registerItem(1401, "diamond_nugget", itemNuggetDiamond);
		MeddleAPI.registerItem(1402, "lapis_nugget", itemNuggetLapis);
		MeddleAPI.registerItem(1403, "obsidian_nugget", itemNuggetObsidian);
		MeddleAPI.registerItem(1404, "emerald_nugget", itemNuggetEmerald);
		MeddleAPI.registerItem(1405, "diorite_nugget", itemNuggetDiorite);
		MeddleAPI.registerItem(1406, "andesite_nugget", itemNuggetAndesite);
		MeddleAPI.registerItem(1407, "granite_nugget", itemNuggetGranite);
		MeddleAPI.registerItem(1408, "chorus_nugget", itemNuggetChorus);
		MeddleAPI.registerItem(1409, "prismarine_nugget", itemNuggetPrismarine);
		MeddleAPI.registerItem(1410, "stone_brick", itemStoneBrick);
		MeddleAPI.registerItem(1411, "quartz_nugget", itemNuggetQuartz);
		MeddleAPI.registerItem(1412, "chicken_nugget", itemNuggetChicken);
		MeddleAPI.registerItem(1413, "stone_nugget", itemNuggetStone);
		MeddleAPI.registerItem(1414, "nugget_in_a_biscuit", itemNuggetBiscuit);
		MeddleAPI.registerItem(1415, "obsidian_shard", itemShardObsidian);

		//Crafting Recipes
		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetIron, 9), "i", Character.valueOf('i'), Items.iron_ingot);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.iron_ingot), "iii", "iii", "iii", Character.valueOf('i'), itemNuggetIron);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetDiamond, 9), "d", Character.valueOf('d'), Items.l);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.l), "ddd", "ddd", "ddd", Character.valueOf('d'), itemNuggetDiamond);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetLapis, 9), "l", Character.valueOf('l'), new ItemStack(Items.be, 1, 4));
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.be, 1, 4), "lll", "lll", "lll", Character.valueOf('l'), itemNuggetLapis);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetObsidian, 9), "o", Character.valueOf('o'), itemShardObsidian);
		CraftingManager.getInstance().addRecipe(new ItemStack(itemShardObsidian), "ooo", "ooo", "ooo", Character.valueOf('o'), itemNuggetObsidian);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetEmerald, 9), "e", Character.valueOf('e'), Items.bZ);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.bZ), "eee", "eee", "eee", Character.valueOf('e'), itemNuggetEmerald);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetDiorite, 9), "d", Character.valueOf('d'), new ItemStack(Blocks.stone, 1, 4));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 4), "ddd", "ddd", "ddd", Character.valueOf('d'), itemNuggetDiorite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetAndesite, 9), "a", Character.valueOf('a'), new ItemStack(Blocks.stone, 1, 6));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 6), "aaa", "aaa", "aaa", Character.valueOf('a'), itemNuggetAndesite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetGranite, 9), "g", Character.valueOf('g'), new ItemStack(Blocks.stone, 1, 2));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 2), "ggg", "ggg", "ggg", Character.valueOf('g'), itemNuggetGranite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetChorus, 9), "c", Character.valueOf('c'), Items.cU);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cU), "ccc", "ccc", "ccc", Character.valueOf('c'), itemNuggetChorus);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetPrismarine, 9), "p", Character.valueOf('p'), Items.cN);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cN), "ppp", "ppp", "ppp", Character.valueOf('p'), itemNuggetPrismarine);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemStoneBrick, 9), "b", Character.valueOf('b'), new ItemStack(Blocks.bf, 1, 0));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.bf, 1, 0), "bbb", "bbb", "bbb", Character.valueOf('b'), itemStoneBrick);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetQuartz, 9), "q", Character.valueOf('q'), Items.cr);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cr), "qqq", "qqq", "qqq", Character.valueOf('q'), itemNuggetQuartz);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetChicken, 9), "c", Character.valueOf('c'), Items.bt);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.bt), "ccc", "ccc", "ccc", Character.valueOf('c'), itemNuggetChicken);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetStone, 9), "s", Character.valueOf('s'), itemStoneBrick);
		CraftingManager.getInstance().addRecipe(new ItemStack(itemStoneBrick), "sss", "sss", "sss", Character.valueOf('s'), itemNuggetStone);

		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(itemNuggetBiscuit), Items.S, itemNuggetChicken);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemShardObsidian, 9), "o", Character.valueOf('o'), Blocks.obsidian);
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.obsidian), "ooo", "ooo", "ooo", Character.valueOf('o'), itemShardObsidian);

		CommonProxy proxy = (CommonProxy)MeddleAPI.createProxyInstance("mods.rfan573.morenuggets.CommonProxy", "mods.rfan573.morenuggets.ClientProxy");
		proxy.init();
	}
}
