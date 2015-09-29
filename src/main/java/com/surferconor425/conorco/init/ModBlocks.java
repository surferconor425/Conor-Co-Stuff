package com.surferconor425.conorco.init;

import com.surferconor425.conorco.block.BlockConstructionBlue;
import com.surferconor425.conorco.block.BlockConorCo;
import com.surferconor425.conorco.reference.BlockRef;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockConorCo BlockConstructionBlue = new BlockConstructionBlue();

    public static void init()
    {
        GameRegistry.registerBlock(BlockConstructionBlue, BlockRef.Block1);
    }
}
