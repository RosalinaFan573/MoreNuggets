package mods.rfan573.morenuggets;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import static mods.rfan573.morenuggets.MoreNuggets.*;

public class ClientProxy extends CommonProxy {

	@Override
	public void init() {
		registerItem(itemNuggetIron, "iron_nugget");
		registerItem(itemNuggetDiamond, "diamond_nugget");
		registerItem(itemNuggetLapis, "lapis_nugget");
		registerItem(itemNuggetObsidian, "obsidian_nugget");
		registerItem(itemNuggetEmerald, "emerald_nugget");
		registerItem(itemNuggetDiorite, "diorite_nugget");
		registerItem(itemNuggetAndesite, "andesite_nugget");
		registerItem(itemNuggetGranite, "granite_nugget");
		registerItem(itemNuggetChorus, "chorus_nugget");
		registerItem(itemNuggetPrismarine, "prismarine_nugget");
		registerItem(itemStoneBrick, "stone_brick");
		registerItem(itemNuggetQuartz, "quartz_nugget");
		registerItem(itemNuggetChicken, "chicken_nugget");
		registerItem(itemNuggetStone, "stone_nugget");
		registerItem(itemNuggetBiscuit, "nugget_in_a_biscuit");
		registerItem(itemShardObsidian, "obsidian_shard");
	}
	
	public void registerItem(Item item, String name) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(name, "inventory"));
	}
}