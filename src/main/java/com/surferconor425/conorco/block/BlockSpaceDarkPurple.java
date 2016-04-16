package com.surferconor425.conorco.block;

import com.surferconor425.conorco.creativetab.CreativeTabConorCo;
import com.surferconor425.conorco.reference.BlockRef;
import net.minecraft.block.material.Material;

public class BlockSpaceDarkPurple extends BlockConorCo
{
    public BlockSpaceDarkPurple()
    {
        super(Material.rock);
        this.setBlockName(BlockRef.Block8);
        setCreativeTab(CreativeTabConorCo.ConorCo);
        setStepSound(soundTypeStone);
        setHardness(4.0F);

    }
}
