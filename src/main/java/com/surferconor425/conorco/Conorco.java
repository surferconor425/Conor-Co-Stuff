package com.surferconor425.conorco;

import com.surferconor425.conorco.Utilities.ReferenceHelper;
import com.surferconor425.conorco.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ReferenceHelper.ModInfo.MODID, name = ReferenceHelper.ModInfo.MODNAME, version = ReferenceHelper.ModInfo.VERSION)
public class Conorco {

    @Mod.Instance
    public static Conorco instance;

    @SidedProxy(clientSide = ReferenceHelper.ModInfo.CLIENT_PROXY_CLASS, serverSide = ReferenceHelper.ModInfo.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }
}
