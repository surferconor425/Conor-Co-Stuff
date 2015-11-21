package com.surferconor425.conorco.block;

import com.surferconor425.conorco.creativetab.CreativeTabConorCo;
import com.surferconor425.conorco.reference.BlockRef;
import net.minecraft.block.material.Material;

public class BlockColourfulBlockHL extends BlockConorCo
{
    public BlockColourfulBlockHL()
    {
        super(Material.rock);
        this.setBlockName(BlockRef.BlockH);
        setCreativeTab(CreativeTabConorCo.ConorCo);
        setStepSound(soundTypeStone);
        setHardness(4.0F);

    }
}
