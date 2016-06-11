package com.surferconor425.conorco.block;

import com.surferconor425.conorco.reference.MainRef;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockConorCo extends Block
{
    public BlockConorCo(Material material)
    {
        super(material);
    }

    public BlockConorCo()
    {
        this(Material.rock);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", MainRef.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        // tile.modid:blockname.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

