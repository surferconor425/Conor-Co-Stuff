package com.surferconor425.conorco.creativetab;

import com.surferconor425.conorco.init.ModBlocks;
import com.surferconor425.conorco.reference.MainRef;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabConorCo
{
    public static CreativeTabs ConorCo= new CreativeTabs(MainRef.MODID) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
            ItemStack iStack = new ItemStack(ModBlocks.BlockConstructionBlue);
            return iStack.getItem();
        }

        @Override
        @SideOnly(Side.CLIENT)
        public int func_151243_f()
        {
            return 7;
        }
    };
}

