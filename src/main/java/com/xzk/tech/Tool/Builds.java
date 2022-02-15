package com.xzk.tech.Tool;

import com.xzk.tech.block.BlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import static com.xzk.tech.block.BlastFurnaceBaseDoors.OPEN;
import static com.xzk.tech.block.BlastFurnaceBaseDoors.SIDE_4;
import static com.xzk.tech.block.BlastFurnaceBaseMultiBlocks.BFBMultiBlocks;
import static com.xzk.tech.block.BoilersBaseMultiBlocks.BBMultiBlocks;
import static com.xzk.tech.block.BoilersBaseMultiBlocks.FACING;

public class Builds {

    public static void IfUse(Boolean IsSuccess, PlayerEntity entity, ItemStack itemstack, ItemStack itemstack1){
        if(IsSuccess){
            entity.inventory.removeItem(itemstack);
            entity.inventory.add(itemstack1);
        }else{
            assert entity != null;
            entity.sendMessage(new StringTextComponent("[Fail To Build]: ").withStyle(TextFormatting.RED).append(new StringTextComponent("Warning! It's not available to build.").withStyle(TextFormatting.YELLOW)), Util.NIL_UUID);
        }
    }

    public static void IfUse(Boolean IsSuccess, PlayerEntity entity, ItemStack itemstack){
        if(IsSuccess){
            assert entity != null;
            entity.inventory.removeItem(itemstack);
        }else{
            assert entity != null;
            entity.sendMessage(new StringTextComponent("[Fail To Build]: ").withStyle(TextFormatting.RED).append(new StringTextComponent("Warning! It's not available to build.").withStyle(TextFormatting.YELLOW)), Util.NIL_UUID);
        }
    }

    public static boolean BlastFurnaceBaseBuilding(World world, BlockPos pos,PlayerEntity entity) {
        BlockPos test1 = new BlockPos(pos.getX() - 2, pos.getY() - 1, pos.getZ() - 2);
        BlockPos test2 = new BlockPos(pos.getX() - 2, pos.getY() - 1, pos.getZ()-1);
        BlockPos test3 = new BlockPos(pos.getX() - 2, pos.getY() - 1, pos.getZ());
        BlockPos test4 = new BlockPos(pos.getX() - 2, pos.getY() - 1, pos.getZ() + 1);
        BlockPos test5 = new BlockPos(pos.getX() - 2, pos.getY() - 1, pos.getZ()+2);
        BlockPos test6 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ() + 2);
        BlockPos test7 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ() + 1);
        BlockPos test8 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ());
        BlockPos test9 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ() - 1);
        BlockPos test10 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ() - 2);
        BlockPos test11 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() + 2);
        BlockPos test12 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() + 1);
        BlockPos test13 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        BlockPos test14 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() - 1);
        BlockPos test15 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() - 2);
        BlockPos test16 = new BlockPos(pos.getX() + 2, pos.getY() - 1, pos.getZ() - 2);
        BlockPos test17 = new BlockPos(pos.getX() + 2, pos.getY() - 1, pos.getZ()-1);
        BlockPos test18 = new BlockPos(pos.getX() + 2, pos.getY() - 1, pos.getZ());
        BlockPos test19 = new BlockPos(pos.getX() + 2, pos.getY() - 1, pos.getZ() + 1);
        BlockPos test20 = new BlockPos(pos.getX() + 2, pos.getY() - 1, pos.getZ()+2);
        BlockPos test21 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ() + 2);
        BlockPos test22 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ() + 1);
        BlockPos test23 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ());
        BlockPos test24 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ() - 1);
        BlockPos test25 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ() - 2);
        BlockPos test26 = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()+1);
        BlockPos test27 = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
        BlockPos test28 = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()-1);
        BlockPos test29 = new BlockPos(pos.getX(), pos.getY(), pos.getZ()+1);
        BlockPos test30 = new BlockPos(pos.getX(), pos.getY(), pos.getZ()-1);
        BlockPos test31 = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()+1);
        BlockPos test32 = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
        BlockPos test33 = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()-1);
        BlockPos test34 = new BlockPos(pos.getX() + 1, pos.getY()+1, pos.getZ()+1);
        BlockPos test35 = new BlockPos(pos.getX() + 1, pos.getY()+1, pos.getZ());
        BlockPos test36 = new BlockPos(pos.getX() + 1, pos.getY()+1, pos.getZ()-1);
        BlockPos test37 = new BlockPos(pos.getX(), pos.getY()+1, pos.getZ()+1);
        BlockPos test38 = new BlockPos(pos.getX(), pos.getY()+1, pos.getZ());
        BlockPos test39 = new BlockPos(pos.getX(), pos.getY()+1, pos.getZ()-1);
        BlockPos test40 = new BlockPos(pos.getX() - 1, pos.getY()+1, pos.getZ()+1);
        BlockPos test41 = new BlockPos(pos.getX() - 1, pos.getY()+1, pos.getZ());
        BlockPos test42 = new BlockPos(pos.getX() - 1, pos.getY()+1, pos.getZ()-1);
        BlockPos test43 = new BlockPos(pos.getX() + 1, pos.getY()+2, pos.getZ()+1);
        BlockPos test44 = new BlockPos(pos.getX() + 1, pos.getY()+2, pos.getZ());
        BlockPos test45 = new BlockPos(pos.getX() + 1, pos.getY()+2, pos.getZ()-1);
        BlockPos test46 = new BlockPos(pos.getX(), pos.getY()+2, pos.getZ()+1);
        BlockPos test47 = new BlockPos(pos.getX(), pos.getY()+2, pos.getZ());
        BlockPos test48 = new BlockPos(pos.getX(), pos.getY()+2, pos.getZ()-1);
        BlockPos test49 = new BlockPos(pos.getX() - 1, pos.getY()+2, pos.getZ()+1);
        BlockPos test50 = new BlockPos(pos.getX() - 1, pos.getY()+2, pos.getZ());
        BlockPos test51 = new BlockPos(pos.getX() - 1, pos.getY()+2, pos.getZ()-1);
        BlockPos test52 = new BlockPos(pos.getX() + 1, pos.getY()+3, pos.getZ()+1);
        BlockPos test53 = new BlockPos(pos.getX() + 1, pos.getY()+3, pos.getZ());
        BlockPos test54 = new BlockPos(pos.getX() + 1, pos.getY()+3, pos.getZ()-1);
        BlockPos test55 = new BlockPos(pos.getX(), pos.getY()+3, pos.getZ()+1);
        BlockPos test56 = new BlockPos(pos.getX(), pos.getY()+3, pos.getZ());
        BlockPos test57 = new BlockPos(pos.getX(), pos.getY()+3, pos.getZ()-1);
        BlockPos test58 = new BlockPos(pos.getX() - 1, pos.getY()+3, pos.getZ()+1);
        BlockPos test59 = new BlockPos(pos.getX() - 1, pos.getY()+3, pos.getZ());
        BlockPos test60 = new BlockPos(pos.getX() - 1, pos.getY()+3, pos.getZ()-1);
        BlockPos test61 = new BlockPos(pos.getX(), pos.getY()+4, pos.getZ());
        BlockPos test62 = new BlockPos(pos.getX(), pos.getY()+5, pos.getZ());

        if (world.getBlockState(test1) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test2) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test3) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test4) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test5) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test6) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test7) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test8) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test9) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test10) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test11) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test12) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test13) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test14) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test15) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test16) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test17) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test18) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test19) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test20) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test21) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test22) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test23) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test24) == Blocks.BRICKS.defaultBlockState() &&
                world.getBlockState(test25) == Blocks.BRICK_SLAB.defaultBlockState() &&
                world.getBlockState(test26) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test27) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test28) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test29) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test30) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test31) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test32) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test33) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test34) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test35) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test36) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test37) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test38) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test39) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test40) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test41) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test42) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test43) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test44) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test45) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test46) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test47) == Blocks.IRON_BLOCK.defaultBlockState() &&
                world.getBlockState(test48) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test49) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test50) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test51) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test52) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test53) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test54) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test55) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test56) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test57) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test58) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test59) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test60) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test61) == Blocks.AIR.defaultBlockState() &&
                world.getBlockState(test62) == Blocks.AIR.defaultBlockState()
        ) {
            world.setBlock(pos, BlockRegistry.BlastFurnaceBase.get().defaultBlockState(), 3);
            world.setBlock(test1, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().defaultBlockState(), 3);
            world.setBlock(test2, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,5), 3);
            world.setBlock(test3, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,5), 3);
            world.setBlock(test4, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,5), 3);
            world.setBlock(test5, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,3), 3);
            world.setBlock(test6, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,4), 3);
            world.setBlock(test7, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,12), 3);
            world.setBlock(test8, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,11), 3);
            world.setBlock(test9, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,13), 3);
            world.setBlock(test10, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,6), 3);
            world.setBlock(test11, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,4), 3);
            world.setBlock(test12, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,10), 3);
            world.setBlock(test13, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,11), 3);
            world.setBlock(test14, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,8), 3);
            world.setBlock(test15, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,6), 3);
            world.setBlock(test16, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,1), 3);
            world.setBlock(test17, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,7), 3);
            world.setBlock(test18, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,7), 3);
            world.setBlock(test19, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,7), 3);
            world.setBlock(test20, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,2), 3);
            world.setBlock(test21, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,4), 3);
            world.setBlock(test22, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,15), 3);
            world.setBlock(test23, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,9), 3);
            world.setBlock(test24, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,14), 3);
            world.setBlock(test25, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,6), 3);
            world.setBlock(test26, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,18), 3);
            world.setBlock(test28, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,17), 3);
            world.setBlock(test31, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,19), 3);
            world.setBlock(test33, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,16), 3);
            world.setBlock(test32, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,20), 3);
            world.setBlock(test30, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,21), 3);
            world.setBlock(test27, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,22), 3);
            world.setBlock(test29, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,23), 3);
            world.setBlock(test40, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,26), 3);
            world.setBlock(test36, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,24), 3);
            world.setBlock(test34, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,25), 3);
            world.setBlock(test42, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,27), 3);
            world.setBlock(test35, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,20), 3);
            world.setBlock(test37, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,21), 3);
            world.setBlock(test39, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,23), 3);
            world.setBlock(test41, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,22), 3);
            world.setBlock(test49, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,29), 3);
            world.setBlock(test45, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,31), 3);
            world.setBlock(test43, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,28), 3);
            world.setBlock(test51, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,30), 3);
            world.setBlock(test38, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,36), 3);
            world.setBlock(test44, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,35), 3);
            world.setBlock(test46, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,32), 3);
            world.setBlock(test48, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,34), 3);
            world.setBlock(test50, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,33), 3);
            world.setBlock(test47, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,36), 3);
            world.setBlock(test49, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,29), 3);
            world.setBlock(test54, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,31), 3);
            world.setBlock(test52, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,28), 3);
            world.setBlock(test60, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,30), 3);
            world.setBlock(test53, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,35), 3);
            world.setBlock(test55, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,32), 3);
            world.setBlock(test57, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,34), 3);
            world.setBlock(test59, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,33), 3);
            world.setBlock(test56, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,36), 3);
            world.setBlock(test58, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,29), 3);
            world.setBlock(test61, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,36), 3);
            world.setBlock(test62, BlockRegistry.BlastFurnaceBaseMultiBlocks.get().getStateDefinition().any().setValue(BFBMultiBlocks,36), 3);


            double distance = entity.distanceToSqr(test27.getX(),test27.getY(),test27.getZ());
            int replacement = 0;

            if(entity.distanceToSqr(test29.getX(),test29.getY(),test29.getZ()) < distance){
                replacement = 1;
                distance = entity.distanceToSqr(test29.getX(),test29.getY(),test29.getZ());
            }

            if(entity.distanceToSqr(test30.getX(),test30.getY(),test30.getZ()) < distance){
                replacement = 2;
                distance = entity.distanceToSqr(test30.getX(),test30.getY(),test30.getZ());
            }

            if(entity.distanceToSqr(test32.getX(),test32.getY(),test32.getZ()) < distance){
                replacement = 3;
            }

            switch (replacement){
                case 0:
                    world.setBlock(test27, BlockRegistry.BlastFurnaceBaseDoors.get().getStateDefinition().any().setValue(OPEN,false).setValue(SIDE_4,1), 3);
                    break;

                case 1:
                    world.setBlock(test29, BlockRegistry.BlastFurnaceBaseDoors.get().getStateDefinition().any().setValue(OPEN,false).setValue(SIDE_4,2), 3);
                    break;

                case 2:
                    world.setBlock(test30, BlockRegistry.BlastFurnaceBaseDoors.get().defaultBlockState(), 3);
                    break;

                case 3:
                    world.setBlock(test32, BlockRegistry.BlastFurnaceBaseDoors.get().getStateDefinition().any().setValue(OPEN,false).setValue(SIDE_4,3), 3);
                    break;
            }

            return true;
        } else {
            return false;
        }
    }

    public static Boolean BoilersBaseBuilding(World world, BlockPos pos,PlayerEntity entity) {
        //z- north,z+ south,x- west,x+ east
        BlockPos test0 = new BlockPos(pos.getX()-1,pos.getY()-1,pos.getZ()-1);
        BlockPos test1 = new BlockPos(pos.getX()-1,pos.getY()-1,pos.getZ());
        BlockPos test2 = new BlockPos(pos.getX()-1,pos.getY()-1,pos.getZ()+1);
        BlockPos test9 = new BlockPos(pos.getX()-1,pos.getY(),pos.getZ()-1);
        BlockPos test10 = new BlockPos(pos.getX()-1,pos.getY(),pos.getZ());
        BlockPos test11 = new BlockPos(pos.getX()-1,pos.getY(),pos.getZ()+1);

        BlockPos test3 = new BlockPos(pos.getX(),pos.getY()-1,pos.getZ()-1);
        BlockPos test4 = new BlockPos(pos.getX(),pos.getY()-1,pos.getZ());
        BlockPos test5 = new BlockPos(pos.getX(),pos.getY()-1,pos.getZ()+1);
        BlockPos test12 = new BlockPos(pos.getX(),pos.getY(),pos.getZ()-1);
        BlockPos test13 = new BlockPos(pos.getX(),pos.getY(),pos.getZ()+1);

        BlockPos test6 = new BlockPos(pos.getX()+1,pos.getY()-1,pos.getZ()-1);
        BlockPos test7 = new BlockPos(pos.getX()+1,pos.getY()-1,pos.getZ());
        BlockPos test8 = new BlockPos(pos.getX()+1,pos.getY()-1,pos.getZ()+1);
        BlockPos test14 = new BlockPos(pos.getX()+1,pos.getY(),pos.getZ()-1);
        BlockPos test15 = new BlockPos(pos.getX()+1,pos.getY(),pos.getZ());
        BlockPos test16 = new BlockPos(pos.getX()+1,pos.getY(),pos.getZ()+1);

        if(
                world.getBlockState(test4) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test13) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test5) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test1) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test2) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test10) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test11) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test7) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test8) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test15) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test16) == BlockRegistry.IronPlateBlock.get().defaultBlockState()

        ){//north
            world.setBlock(test4,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,1),3);
            world.setBlock(test13,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,0),3);
            world.setBlock(test5,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,1),3);
            world.setBlock(test7,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,3),3);
            world.setBlock(test8,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,5),3);
            world.setBlock(test15,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,2),3);
            world.setBlock(test16,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,4),3);
            world.setBlock(test1,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,9),3);
            world.setBlock(test2,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,8),3);
            world.setBlock(test10,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,6),3);
            world.setBlock(test11,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,7),3);
            world.setBlock(pos,BlockRegistry.BoilersBase.get().getStateDefinition().any().setValue(FACING, Direction.NORTH),3);
            return true;
        }else if(
                world.getBlockState(test4) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test3) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test12) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test0) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test1) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test9) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test10) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test6) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test7) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test14) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test15) == BlockRegistry.IronPlateBlock.get().defaultBlockState()
        ){//south
            world.setBlock(test4,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,1),3);
            world.setBlock(test3,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,1),3);
            world.setBlock(test12,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,0),3);
            world.setBlock(test6,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,8),3);
            world.setBlock(test7,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,9),3);
            world.setBlock(test14,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,7),3);
            world.setBlock(test15,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,6),3);
            world.setBlock(test0,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,5),3);
            world.setBlock(test1,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,3),3);
            world.setBlock(test9,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,4),3);
            world.setBlock(test10,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,2),3);
            world.setBlock(pos,BlockRegistry.BoilersBase.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH),3);
            return true;
        }else if(
                world.getBlockState(test0) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test1) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test2) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test9) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test10) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test11) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test3) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test4) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test5) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test12) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test13) == BlockRegistry.IronPlateBlock.get().defaultBlockState()
        ){
            world.setBlock(test0,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,8),3);
            world.setBlock(test1,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,1),3);
            world.setBlock(test2,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,5),3);
            world.setBlock(test9,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,7),3);
            world.setBlock(test10,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,0),3);
            world.setBlock(test11,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,4),3);
            world.setBlock(test3,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,9),3);
            world.setBlock(test4,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,1),3);
            world.setBlock(test5,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,3),3);
            world.setBlock(test12,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,6),3);
            world.setBlock(test13,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,2),3);
            world.setBlock(pos,BlockRegistry.BoilersBase.get().getStateDefinition().any().setValue(FACING, Direction.EAST),3);
            return true;
        }else if(
                world.getBlockState(test3) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test6) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test12) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test14) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test4) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test7) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test15) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test5) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test8) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test13) == BlockRegistry.IronPlateBlock.get().defaultBlockState() &&
                        world.getBlockState(test16) == BlockRegistry.IronPlateBlock.get().defaultBlockState()
        ){
            world.setBlock(test3,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,3),3);
            world.setBlock(test6,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,5),3);
            world.setBlock(test12,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,2),3);
            world.setBlock(test14,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(BBMultiBlocks,4),3);
            world.setBlock(test4,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.WEST).setValue(BBMultiBlocks,1),3);
            world.setBlock(test7,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,1),3);
            world.setBlock(test15,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.EAST).setValue(BBMultiBlocks,0),3);
            world.setBlock(test5,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,9),3);
            world.setBlock(test8,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,8),3);
            world.setBlock(test13,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,6),3);
            world.setBlock(test16,BlockRegistry.BoilersBaseMultiBlocks.get().getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(BBMultiBlocks,7),3);
            world.setBlock(pos,BlockRegistry.BoilersBase.get().getStateDefinition().any().setValue(FACING, Direction.WEST),3);
            return true;
        }
        else return false;
    }
}
