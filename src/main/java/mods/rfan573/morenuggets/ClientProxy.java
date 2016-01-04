package mods.rfan573.morenuggets;

import net.fybertech.meddleapi.MeddleClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ClientProxy extends CommonProxy {

@Override
	public void init()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetIron, 0, new ModelResourceLocation("iron_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetDiamond, 0, new ModelResourceLocation("diamond_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetLapis, 0, new ModelResourceLocation("lapis_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetObsidian, 0, new ModelResourceLocation("obsidian_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetEmerald, 0, new ModelResourceLocation("emerald_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetDiorite, 0, new ModelResourceLocation("diorite_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetAndesite, 0, new ModelResourceLocation("andesite_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetGranite, 0, new ModelResourceLocation("granite_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetChorus, 0, new ModelResourceLocation("chorus_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetPrismarine, 0, new ModelResourceLocation("prismarine_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemStoneBrick, 0, new ModelResourceLocation("stone_brick", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetQuartz, 0, new ModelResourceLocation("quartz_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetChicken, 0, new ModelResourceLocation("chicken_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetStone, 0, new ModelResourceLocation("stone_nugget", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemNuggetBiscuit, 0, new ModelResourceLocation("nugget_in_a_biscuit", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MoreNuggets.itemShardObsidian, 0, new ModelResourceLocation("obsidian_shard", "inventory"));
}
}