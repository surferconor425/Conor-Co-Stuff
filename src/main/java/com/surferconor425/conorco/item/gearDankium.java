package com.surferconor425.conorco.item;

import com.surferconor425.conorco.reference.ItemRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;


/**
 * Created by surferconor425 on 02/06/2016.
 */
public class gearDankium extends ItemConorCo
{
    public static ItemStack gearDankium;
    {
        this.setUnlocalizedName(ItemRef.Gears.gear1);

    }
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean isInHand) { list.add("TiTm"); }
}