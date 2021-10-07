package com.xen.knightsjourney.core.tabs;

import com.xen.knightsjourney.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class KJResources extends ItemGroup {

	public static final KJResources KJ_RESOURCES = new KJResources(ItemGroup.TABS.length,
			"kj_resources");

	public KJResources(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.REFINED_COAL.get());
	}

}
