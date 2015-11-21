package com.surferconor425.conorco.init;

import com.surferconor425.conorco.block.*;
import com.surferconor425.conorco.reference.BlockRef;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockConorCo BlockConstructionBlue = new BlockConstructionBlue();
    public static final BlockConorCo BlockRandDBlue = new BlockRandDBlue();
    public static final BlockConorCo BlockTarmacGrey = new BlockTarmacGrey();
    public static final BlockConorCo BlockMiltechRed = new BlockMiltechRed();
    public static final BlockConorCo BlockIndustrialOrange = new BlockIndustrialOrange();
    public static final BlockConorCo BlockCCBlack = new BlockCCBlack();
    public static final BlockConorCo BlockColourfulBlock = new BlockColourfulBlock();
    public static final BlockConorCo BlockColourfulBlockHL = new BlockColourfulBlockHL();

    public static void init()
    {
        GameRegistry.registerBlock(BlockConstructionBlue, BlockRef.Block1);
        GameRegistry.registerBlock(BlockRandDBlue, BlockRef.Block2);
        GameRegistry.registerBlock(BlockTarmacGrey, BlockRef.Block3);
        GameRegistry.registerBlock(BlockMiltechRed, BlockRef.Block4);
        GameRegistry.registerBlock(BlockIndustrialOrange, BlockRef.Block5);
        GameRegistry.registerBlock(BlockCCBlack, BlockRef.Block6);
        GameRegistry.registerBlock(BlockColourfulBlock, BlockRef.BlockX);
        GameRegistry.registerBlock(BlockColourfulBlockHL, BlockRef.BlockH);

    }
}
