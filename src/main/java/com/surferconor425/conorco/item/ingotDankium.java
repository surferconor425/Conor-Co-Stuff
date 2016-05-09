package com.surferconor425.conorco.item;

import cofh.lib.util.helpers.ItemHelper;
import com.surferconor425.conorco.reference.ItemRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;


/**
 * Created by surferconor425 on 09/05/2016.
 */
public class ingotDankium extends ItemConorCo
{
    public static ItemStack ingotDankium;
    {
        this.setUnlocalizedName(ItemRef.Ingots.ingot1);
        ItemHelper.isIngot(ingotDankium);

    }
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean isInHand) { list.add("Useless...for now"); }
}