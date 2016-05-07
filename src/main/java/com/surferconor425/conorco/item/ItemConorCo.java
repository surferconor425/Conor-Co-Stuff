package com.surferconor425.conorco.item;

import com.surferconor425.conorco.creativetab.CreativeTabConorCo;
import com.surferconor425.conorco.reference.MainRef;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by surferconor425 on 7/05/2016.
 */
public class ItemConorCo extends Item
{
    public ItemConorCo()
    {
        super();
        this.setCreativeTab(CreativeTabConorCo.ConorCo);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", MainRef.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", MainRef.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}