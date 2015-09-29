package com.surferconor425.conorco;

import com.surferconor425.conorco.init.ModBlocks;
import com.surferconor425.conorco.proxy.IProxy;
import com.surferconor425.conorco.reference.MainRef;
import com.surferconor425.conorco.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MainRef.MODID, name = MainRef.MODNAME, version = MainRef.VERSION)
public class ConorCo
{
    @SidedProxy(clientSide = MainRef.CLIENT_PROXY_CLASS, serverSide = MainRef.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(MainRef.MODID)
    public static com.surferconor425.conorco.ConorCo instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        LogHelper.info("Pre Initialization Complete");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
        LogHelper.info("Bet 10p there isnt a button named Singleplayer...for a good reason.");
    }
}
