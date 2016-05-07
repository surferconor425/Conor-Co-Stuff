package com.surferconor425.conorco.init;

import com.surferconor425.conorco.item.dustPotassiumNitrate;
import com.surferconor425.conorco.item.ItemConorCo;
import com.surferconor425.conorco.reference.ItemRef;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
    public static final ItemConorCo dustPotassiumNitrate = new dustPotassiumNitrate();

    public static void init()
    {
        GameRegistry.registerItem(dustPotassiumNitrate, ItemRef.Dusts.dust1);
        OreDictionary.registerOre("dustSaltpeter", dustPotassiumNitrate);


    }
}
