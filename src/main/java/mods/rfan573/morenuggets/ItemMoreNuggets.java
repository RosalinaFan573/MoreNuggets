package mods.rfan573.morenuggets;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMoreNuggets extends Item
{
    private String name;
    
    public ItemMoreNuggets(String name){
        this.name = name;
    }

    @Override
    public String getItemStackDisplayName(ItemStack param0) {
        return name;
    }
}