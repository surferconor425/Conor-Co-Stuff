package com.surferconor425.conorco.item;

import com.surferconor425.conorco.reference.ItemRef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;


/**
 * Created by surferconor425 on 07/05/2016.
 */
public class dustPotassiumNitrate extends ItemConorCo
{
    public static ItemStack dustPotassiumNitrate;
    {
        this.setUnlocalizedName(ItemRef.Dusts.dust1);

    }
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean isInHand) { list.add("KNO3"); }
}