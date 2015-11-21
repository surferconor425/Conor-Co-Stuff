package com.surferconor425.conorco.reference;

public class MainRef
{
    // All the references made throughout the mod, along with a template because I cant be arsed to type it out every time.
    // public static final String TEMPLATE = "Hello";

    public static final String MODID = "conorco";
    public static final String MODNAME = "Conor Co. Stuff";
    public static final String VERSION = "@MOD_VERSION@";
    public static final String CLIENT_PROXY_CLASS = "com.surferconor425.conorco.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.surferconor425.conorco.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "com.surferconor425.conorco.client.gui.GuiFactory";
    public static final String LOWERCASE_MOD_ID = MainRef.MODID; //Dunno why I had uppercase MODID, doing this so I dont have to run through my code to remove LOWERCASE_MOD_ID if it is anywhere
}
