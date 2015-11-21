package com.surferconor425.conorco.block;

import com.surferconor425.conorco.creativetab.CreativeTabConorCo;
import com.surferconor425.conorco.reference.BlockRef;
import net.minecraft.block.material.Material;

public class BlockTarmacGrey extends BlockConorCo
{
    public BlockTarmacGrey()
    {
        super(Material.rock);
        this.setBlockName(BlockRef.Block3);
        setCreativeTab(CreativeTabConorCo.ConorCo);
        setStepSound(soundTypeStone);
        setHardness(4.0F);

    }
}
