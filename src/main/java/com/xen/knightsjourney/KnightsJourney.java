package com.xen.knightsjourney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("knightsjourney")
public class KnightsJourney {
    
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "knightsjourney";

    public KnightsJourney() {
    	@SuppressWarnings("unused")
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
	}
}
