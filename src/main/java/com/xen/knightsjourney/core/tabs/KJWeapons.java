package com.xen.knightsjourney.core.tabs;

import com.xen.knightsjourney.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class KJWeapons extends ItemGroup {

	public static final KJWeapons KJ_WEAPONS = new KJWeapons(ItemGroup.TABS.length,
			"kj_weapons");

	public KJWeapons(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.IRON_CUTLASS.get());
	}

}
