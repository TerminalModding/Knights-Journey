package com.xen.knightsjourney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xen.knightsjourney.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("knightsjourney")
public class KnightsJourney {
    
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "knightsjourney";

    public KnightsJourney() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
	}
}
