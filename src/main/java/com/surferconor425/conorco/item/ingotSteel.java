package com.surferconor425.conorco.item;

import com.surferconor425.conorco.reference.ItemRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;


/**
 * Created by surferconor425 on 02/06/2016.
 */
public class ingotSteel extends ItemConorCo
{
    public static ItemStack ingotSteel;
    {
        this.setUnlocalizedName(ItemRef.Ingots.ingot4);

    }
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean isInHand) { list.add("Fe50C"); }
}