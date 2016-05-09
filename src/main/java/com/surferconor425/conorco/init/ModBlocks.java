package com.surferconor425.conorco.init;

import cofh.lib.util.helpers.ItemHelper;
import com.surferconor425.conorco.block.*;
import com.surferconor425.conorco.reference.BlockRef;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockConorCo BlockLarchAirlinesBlue = new BlockLarchAirlinesBlue();
    public static final BlockConorCo BlockRandDBlue = new BlockRandDBlue();
    public static final BlockConorCo BlockTarmacGrey = new BlockTarmacGrey();
    public static final BlockConorCo BlockMiltechRed = new BlockMiltechRed();
    public static final BlockConorCo BlockIndustrialOrange = new BlockIndustrialOrange();
    public static final BlockConorCo BlockCCBlack = new BlockCCBlack();
    public static final BlockConorCo BlockFuelexPurple = new BlockFuelexPurple();
    public static final BlockConorCo BlockSpaceDarkPurple = new BlockSpaceDarkPurple();

    public static void init()
    {

        //Registry

        GameRegistry.registerBlock(BlockLarchAirlinesBlue, BlockRef.Block1);
        GameRegistry.registerBlock(BlockRandDBlue, BlockRef.Block2);
        GameRegistry.registerBlock(BlockTarmacGrey, BlockRef.Block3);
        GameRegistry.registerBlock(BlockMiltechRed, BlockRef.Block4);
        GameRegistry.registerBlock(BlockIndustrialOrange, BlockRef.Block5);
        GameRegistry.registerBlock(BlockCCBlack, BlockRef.Block6);
        GameRegistry.registerBlock(BlockFuelexPurple, BlockRef.Block7);
        GameRegistry.registerBlock(BlockSpaceDarkPurple, BlockRef.Block8);
    }
}
