package mods.rfan573.morenuggets;

import net.fybertech.meddle.Meddle;
import net.fybertech.meddle.MeddleMod;
import net.fybertech.meddleapi.MeddleAPI;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.creativetab.CreativeTabs;

@MeddleMod(id = "MoreNuggets")
public class MoreNuggets {

//Item Definitions I
	public static Item itemNuggetIron;

	public static Item itemNuggetDiamond;

	public static Item itemNuggetLapis;

	public static Item itemNuggetObsidian;

	public static Item itemNuggetEmerald;

	public static Item itemNuggetDiorite;

	public static Item itemNuggetAndesite;

	public static Item itemNuggetGranite;

	public static Item itemNuggetChorus;

	public static Item itemNuggetPrismarine;

	public static Item itemStoneBrick;

	public static Item itemNuggetQuartz;

	public static Item itemNuggetChicken;

	public static Item itemNuggetStone;

	public static Item itemNuggetBiscuit;

	public static Item itemShardObsidian;

	public void init()
	{

//Item Definitions II
		itemNuggetIron = new ItemIronNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetIron");

		itemNuggetDiamond = new ItemDiamondNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetDiamond");

		itemNuggetLapis = new ItemLapisNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetLapis");

		itemNuggetObsidian = new ItemObsidianNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetObsidian");

		itemNuggetEmerald = new ItemEmeraldNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetEmerald");

		itemNuggetDiorite = new ItemDioriteNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetDiorite");

		itemNuggetAndesite = new ItemAndesiteNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetAndesite");

		itemNuggetGranite = new ItemGraniteNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetGranite");

		itemNuggetChorus = new ItemChorusNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetChorus");

		itemNuggetPrismarine = new ItemPrismarineNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetPrismarine");

		itemStoneBrick = new ItemStoneBrick().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("stoneBrickItem");

		itemNuggetQuartz = new ItemQuartzNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetQuartz");

		itemNuggetChicken = new ItemChickenNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetChicken");

		itemNuggetStone = new ItemStoneNugget().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("nuggetStone");

		itemNuggetBiscuit = new ItemNuggetInABiscuit().setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("nuggetInABiscuit");

		itemShardObsidian = new ItemObsidianShard().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("shardObsidian");


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

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetDiamond, 9), "d", Character.valueOf('d'), Items.k);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.k), "ddd", "ddd", "ddd", Character.valueOf('d'), itemNuggetDiamond);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetLapis, 9), "l", Character.valueOf('l'), new ItemStack(Items.bd, 1, 4));
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.bd, 1, 4), "lll", "lll", "lll", Character.valueOf('l'), itemNuggetLapis);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetObsidian, 9), "o", Character.valueOf('o'), itemShardObsidian);
		CraftingManager.getInstance().addRecipe(new ItemStack(itemShardObsidian), "ooo", "ooo", "ooo", Character.valueOf('o'), itemNuggetObsidian);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetEmerald, 9), "e", Character.valueOf('e'), Items.bY);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.bY), "eee", "eee", "eee", Character.valueOf('e'), itemNuggetEmerald);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetDiorite, 9), "d", Character.valueOf('d'), new ItemStack(Blocks.stone, 1, 4));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 4), "ddd", "ddd", "ddd", Character.valueOf('d'), itemNuggetDiorite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetAndesite, 9), "a", Character.valueOf('a'), new ItemStack(Blocks.stone, 1, 6));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 6), "aaa", "aaa", "aaa", Character.valueOf('a'), itemNuggetAndesite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetGranite, 9), "g", Character.valueOf('g'), new ItemStack(Blocks.stone, 1, 2));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.stone, 1, 2), "ggg", "ggg", "ggg", Character.valueOf('g'), itemNuggetGranite);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetChorus, 9), "c", Character.valueOf('c'), Items.cT);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cT), "ccc", "ccc", "ccc", Character.valueOf('c'), itemNuggetChorus);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetPrismarine, 9), "p", Character.valueOf('p'), Items.cM);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cM), "ppp", "ppp", "ppp", Character.valueOf('p'), itemNuggetPrismarine);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemStoneBrick, 9), "b", Character.valueOf('b'), new ItemStack(Blocks.bf, 1, 0));
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.bf, 1, 0), "bbb", "bbb", "bbb", Character.valueOf('b'), itemStoneBrick);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetQuartz, 9), "q", Character.valueOf('q'), Items.cq);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.cq), "qqq", "qqq", "qqq", Character.valueOf('q'), itemNuggetQuartz);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetChicken, 9), "c", Character.valueOf('c'), Items.bs);
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.bs), "ccc", "ccc", "ccc", Character.valueOf('c'), itemNuggetChicken);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemNuggetStone, 9), "s", Character.valueOf('s'), itemStoneBrick);
		CraftingManager.getInstance().addRecipe(new ItemStack(itemStoneBrick), "sss", "sss", "sss", Character.valueOf('s'), itemNuggetStone);

		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(itemNuggetBiscuit), Items.R, itemNuggetChicken);

		CraftingManager.getInstance().addRecipe(new ItemStack(itemShardObsidian, 9), "o", Character.valueOf('o'), Blocks.obsidian);
		CraftingManager.getInstance().addRecipe(new ItemStack(Blocks.obsidian), "ooo", "ooo", "ooo", Character.valueOf('o'), itemShardObsidian);

		CommonProxy proxy = (CommonProxy)MeddleAPI.createProxyInstance("mods.rfan573.morenuggets.CommonProxy", "mods.rfan573.morenuggets.ClientProxy");
		proxy.init();
}
}