package com.surferconor425.conorco.init;

import cofh.lib.util.helpers.ItemHelper;
import com.surferconor425.conorco.block.BlockConorCo;
import com.surferconor425.conorco.item.*;
import com.surferconor425.conorco.reference.ItemRef;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
    public static final ItemConorCo dustPotassiumNitrate = new dustPotassiumNitrate();
    public static final ItemConorCo ingotDankium = new ingotDankium();
    public static final ItemConorCo ingotTecmonium = new ingotTecmonium();
    public static final ItemConorCo ingotTitanium = new ingotTitanium();
    public static final ItemConorCo gearDankium = new gearDankium();
    public static final ItemConorCo dustTecmonium = new dustTecmonium();
    public static final ItemConorCo ingotSteel = new ingotSteel();

    public static void init()
    {

        // Potassium Nitrate
        GameRegistry.registerItem(dustPotassiumNitrate, ItemRef.Dusts.dust1);
        OreDictionary.registerOre("dustSaltpeter", dustPotassiumNitrate);
        ItemHelper.addShapelessOreRecipe(ItemHelper.cloneStack(dustPotassiumNitrate, 2), "dustSaltpeter", "dustSaltpeter");

        // Dankium Ingot
        GameRegistry.registerItem(ingotDankium, ItemRef.Ingots.ingot1);
        OreDictionary.registerOre("ingotDankium", ingotDankium);
        ItemHelper.addShapelessOreRecipe(ItemHelper.stack(ingotDankium), "ingotTecmonium", "ingotTitanium");
        // ThermalExpansionHelper.addSmelterRecipe(1000, ItemHelper.cloneStack(ingotDankium, 2), ingotTecmonium, ingotTitanium);

        // Dankium Gear
        GameRegistry.registerItem(gearDankium, ItemRef.Gears.gear1);
        OreDictionary.registerOre("gearDankium", gearDankium);
        ItemHelper.addGearRecipe(ItemHelper.stack(gearDankium), "ingotDankium");

        // Tecmonium Ingot
        GameRegistry.registerItem(ingotTecmonium, ItemRef.Ingots.ingot2);
        OreDictionary.registerOre("ingotTecmonium", ingotTecmonium);

        // Tecmonium Dust
        GameRegistry.registerItem(dustTecmonium, ItemRef.Dusts.dust2);
        OreDictionary.registerOre("dustTecmonium", dustTecmonium);

        // Titanium Ingot
        GameRegistry.registerItem(ingotTitanium, ItemRef.Ingots.ingot3);
        OreDictionary.registerOre("ingotTitanium", ingotTitanium);

        // Steel Ingot
        GameRegistry.registerItem(ingotSteel, ItemRef.Ingots.ingot4);
        OreDictionary.registerOre("ingotSteel", ingotSteel);

    }
}
