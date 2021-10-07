package com.xen.knightsjourney.core.init;

import com.xen.knightsjourney.KnightsJourney;
import com.xen.knightsjourney.core.tabs.KJResources;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
				KnightsJourney.MOD_ID);
		
		//KJ Refined
		public static final RegistryObject<Item> REFINED_COAL = ITEMS.register("refined_coal",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> REFINED_IRON = ITEMS.register("refined_iron",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> REFINED_GOLD = ITEMS.register("refined_gold",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> REFINED_DIAMOND = ITEMS.register("refined_diamond",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> REFINED_NETHERITE = ITEMS.register("refined_netherite",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		
		//KJ Resources
		public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> SILVER = ITEMS.register("silver",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> TIN = ITEMS.register("tin",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
				() -> new Item(new Item.Properties().tab(KJResources.KJ_RESOURCES)));
		
}
