package org.techern.minecraft.igneousextras.items.tools;

import net.minecraft.item.ItemHoe;
import org.techern.minecraft.igneousextras.items.IgneousItems;

public class ItemIgneousHoe extends ItemHoe {
	public ItemIgneousHoe(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_hoe");
		this.setRegistryName(unlocalizedName + "_hoe");
		this.setCreativeTab(IgneousItems.TOOLS_TAB);
	}
}
