package com.xzk.tech.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BoilersBaseMultiBlocks extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    public static final IntegerProperty BBMultiBlocks = IntegerProperty.create("b_b_multiblocks",0,9);

    private static VoxelShape shape0_0;
    private static VoxelShape shape0_1;
    private static VoxelShape shape0_2;
    private static VoxelShape shape0_3;
    private static VoxelShape shape1_0;
    private static VoxelShape shape1_1;
    private static VoxelShape shape1_2;
    private static VoxelShape shape1_3;
    private static VoxelShape shape2_0;
    private static VoxelShape shape2_1;
    private static VoxelShape shape2_2;
    private static VoxelShape shape2_3;
    private static VoxelShape shape3_0;
    private static VoxelShape shape3_1;
    private static VoxelShape shape3_2;
    private static VoxelShape shape3_3;
    private static VoxelShape shape4_0;
    private static VoxelShape shape4_1;
    private static VoxelShape shape4_2;
    private static VoxelShape shape4_3;
    private static VoxelShape shape5_0;
    private static VoxelShape shape5_1;
    private static VoxelShape shape5_2;
    private static VoxelShape shape5_3;
    private static VoxelShape shape6_0;
    private static VoxelShape shape6_1;
    private static VoxelShape shape6_2;
    private static VoxelShape shape6_3;
    private static VoxelShape shape7_0;
    private static VoxelShape shape7_1;
    private static VoxelShape shape7_2;
    private static VoxelShape shape7_3;
    private static VoxelShape shape8_0;
    private static VoxelShape shape8_1;
    private static VoxelShape shape8_2;
    private static VoxelShape shape8_3;
    private static VoxelShape shape9_0;
    private static VoxelShape shape9_1;
    private static VoxelShape shape9_2;
    private static VoxelShape shape9_3;

    static {
        shape0_0 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 1),
                Block.box(0, 4, 1, 16, 7, 2),
                Block.box(0, 7, 2, 16, 9, 3),
                Block.box(0, 9, 3, 16, 10, 4),
                Block.box(0, 10, 4, 16, 11, 5),
                Block.box(0, 11, 5, 16, 12, 6),
                Block.box(0, 13, 7, 16, 14, 9),
                Block.box(0, 14, 9, 16, 15, 12),
                Block.box(0, 15, 12, 16, 16, 16),
                Block.box(0, 12, 6, 16, 13, 7)
                );

        shape0_1 = VoxelShapes.or(
                Block.box(15, 0, 0, 16, 4, 16),
                Block.box(14, 4, 0, 15, 7, 16),
                Block.box(13, 7, 0, 14, 9, 16),
                Block.box(12, 9, 0, 13, 10, 16),
                Block.box(11, 10, 0, 12, 11, 16),
                Block.box(10, 11, 0, 11, 12, 16),
                Block.box(7, 13, 0, 9, 14, 16),
                Block.box(4, 14, 0, 7, 15, 16),
                Block.box(0, 15, 0, 4, 16, 16),
                Block.box(9, 12, 0, 10, 13, 16)
        );

        shape0_2 = VoxelShapes.or(
                Block.box(0, 0, 15, 16, 4, 16),
                Block.box(0, 4, 14, 16, 7, 15),
                Block.box(0, 7, 13, 16, 9, 14),
                Block.box(0, 9, 12, 16, 10, 13),
                Block.box(0, 10, 11, 16, 11, 12),
                Block.box(0, 11, 10, 16, 12, 11),
                Block.box(0, 13, 7, 16, 14, 9),
                Block.box(0, 14, 4, 16, 15, 7),
                Block.box(0, 15, 0, 16, 16, 4),
                Block.box(0, 12, 9, 16, 13, 10)
        );

        shape0_3 = VoxelShapes.or(
                Block.box(0, 0, 0, 1, 4, 16),
                Block.box(1, 4, 0, 2, 7, 16),
                Block.box(2, 7, 0, 3, 9, 16),
                Block.box(3, 9, 0, 4, 10, 16),
                Block.box(4, 10, 0, 5, 11, 16),
                Block.box(5, 11, 0, 6, 12, 16),
                Block.box(7, 13, 0, 9, 14, 16),
                Block.box(9, 14, 0, 12, 15, 16),
                Block.box(12, 15, 0, 16, 16, 16),
                Block.box(6, 12, 0, 7, 13, 16)
        );

        shape1_0 = VoxelShapes.or(
                Block.box(0, 0, 12, 16, 1, 16),
                Block.box(0, 1, 9, 16, 2, 12),
                Block.box(0, 2, 7, 16, 3, 9),
                Block.box(0, 3, 6, 16, 4, 7),
                Block.box(0, 4, 5, 16, 5, 6),
                Block.box(0, 5, 4, 16, 6, 5),
                Block.box(0, 7, 2, 16, 9, 3),
                Block.box(0, 9, 1, 16, 12, 2),
                Block.box(0, 12, 0, 16, 16, 1),
                Block.box(0, 6, 3, 16, 7, 4)
        );

        shape1_1 = VoxelShapes.or(
                Block.box(0, 0, 0, 4, 1, 16),
                Block.box(4, 1, 0, 7, 2, 16),
                Block.box(7, 2, 0, 9, 3, 16),
                Block.box(9, 3, 0, 10, 4, 16),
                Block.box(10, 4, 0, 11, 5, 16),
                Block.box(11, 5, 0, 12, 6, 16),
                Block.box(13, 7, 0, 14, 9, 16),
                Block.box(14, 9, 0, 15, 12, 16),
                Block.box(15, 12, 0, 16, 16, 16),
                Block.box(12, 6, 0, 13, 7, 16)
        );

        shape1_2 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 1, 4),
                Block.box(0, 1, 4, 16, 2, 7),
                Block.box(0, 2, 7, 16, 3, 9),
                Block.box(0, 3, 9, 16, 4, 10),
                Block.box(0, 4, 10, 16, 5, 11),
                Block.box(0, 5, 11, 16, 6, 12),
                Block.box(0, 7, 13, 16, 9, 14),
                Block.box(0, 9, 14, 16, 12, 15),
                Block.box(0, 12, 15, 16, 16, 16),
                Block.box(0, 6, 12, 16, 7, 13)
        );

        shape1_3 = VoxelShapes.or(
                Block.box(12, 0, 0, 16, 1, 16),
                Block.box(9, 1, 0, 12, 2, 16),
                Block.box(7, 2, 0, 9, 3, 16),
                Block.box(6, 3, 0, 7, 4, 16),
                Block.box(5, 4, 0, 6, 5, 16),
                Block.box(4, 5, 0, 5, 6, 16),
                Block.box(2, 7, 0, 3, 9, 16),
                Block.box(1, 9, 0, 2, 12, 16),
                Block.box(0, 12, 0, 1, 16, 16),
                Block.box(3, 6, 0, 4, 7, 16)
        );

        shape2_0 = VoxelShapes.or(
                Block.box(0, 0, 4, 16, 4, 16),
                Block.box(1, 4, 4, 16, 7, 16),
                Block.box(2, 7, 4, 16, 9, 16),
                Block.box(3, 9, 4, 16, 10, 16),
                Block.box(4, 10, 4, 16, 11, 16),
                Block.box(5, 11, 4, 16, 12, 16),
                Block.box(7, 13, 4, 16, 14, 16),
                Block.box(9, 14, 4, 16, 15, 16),
                Block.box(12, 15, 4, 16, 16, 16),
                Block.box(6, 12, 4, 16, 13, 16),
                Block.box(8, 0, 1, 16, 3, 2),
                Block.box(9, 3, 1, 16, 5, 2),
                Block.box(10, 5, 1, 16, 6, 2),
                Block.box(11, 6, 1, 16, 7, 2),
                Block.box(13, 7, 1, 16, 8, 2),
                Block.box(13, 0, 2, 16, 12, 4),
                Block.box(11, 0, 2, 13, 11, 4),
                Block.box(9, 0, 2, 11, 10, 4),
                Block.box(8, 0, 2, 9, 9, 4),
                Block.box(7, 0, 2, 8, 8, 4),
                Block.box(6, 0, 2, 7, 7, 4),
                Block.box(5, 0, 2, 6, 5, 4),
                Block.box(4, 0, 2, 5, 3, 4)
        );

        shape2_1 = VoxelShapes.or(
                Block.box(0, 0, 0, 12, 4, 16),
                Block.box(0, 4, 1, 12, 7, 16),
                Block.box(0, 7, 2, 12, 9, 16),
                Block.box(0, 9, 3, 12, 10, 16),
                Block.box(0, 10, 4, 12, 11, 16),
                Block.box(0, 11, 5, 12, 12, 16),
                Block.box(0, 13, 7, 12, 14, 16),
                Block.box(0, 14, 9, 12, 15, 16),
                Block.box(0, 15, 12, 12, 16, 16),
                Block.box(0, 12, 6, 12, 13, 16),
                Block.box(14, 0, 8, 15, 3, 16),
                Block.box(14, 3, 9, 15, 5, 16),
                Block.box(14, 5, 10, 15, 6, 16),
                Block.box(14, 6, 11, 15, 7, 16),
                Block.box(14, 7, 13, 15, 8, 16),
                Block.box(12, 0, 13, 14, 12, 16),
                Block.box(12, 0, 11, 14, 11, 13),
                Block.box(12, 0, 9, 14, 10, 11),
                Block.box(12, 0, 8, 14, 9, 9),
                Block.box(12, 0, 7, 14, 8, 8),
                Block.box(12, 0, 6, 14, 7, 7),
                Block.box(12, 0, 5, 14, 5, 6),
                Block.box(12, 0, 4, 14, 3, 5)
                );

        shape2_2 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 12),
                Block.box(0, 4, 0, 15, 7, 12),
                Block.box(0, 7, 0, 14, 9, 12),
                Block.box(0, 9, 0, 13, 10, 12),
                Block.box(0, 10, 0, 12, 11, 12),
                Block.box(0, 11, 0, 11, 12, 12),
                Block.box(0, 13, 0, 9, 14, 12),
                Block.box(0, 14, 0, 7, 15, 12),
                Block.box(0, 15, 0, 4, 16, 12),
                Block.box(0, 12, 0, 10, 13, 12),
                Block.box(0, 0, 14, 8, 3, 15),
                Block.box(0, 3, 14, 7, 5, 15),
                Block.box(0, 5, 14, 6, 6, 15),
                Block.box(0, 6, 14, 5, 7, 15),
                Block.box(0, 7, 14, 3, 8, 15),
                Block.box(0, 0, 12, 3, 12, 14),
                Block.box(3, 0, 12, 5, 11, 14),
                Block.box(5, 0, 12, 7, 10, 14),
                Block.box(7, 0, 12, 8, 9, 14),
                Block.box(8, 0, 12, 9, 8, 14),
                Block.box(9, 0, 12, 10, 7, 14),
                Block.box(10, 0, 12, 11, 5, 14),
                Block.box(11, 0, 12, 12, 3, 14)
        );

        shape2_3 = VoxelShapes.or(
                Block.box(4, 0, 0, 16, 4, 16),
                Block.box(4, 4, 0, 16, 7, 15),
                Block.box(4, 7, 0, 16, 9, 14),
                Block.box(4, 9, 0, 16, 10, 13),
                Block.box(4, 10, 0, 16, 11, 12),
                Block.box(4, 11, 0, 16, 12, 11),
                Block.box(4, 13, 0, 16, 14, 9),
                Block.box(4, 14, 0, 16, 15, 7),
                Block.box(4, 15, 0, 16, 16, 4),
                Block.box(4, 12, 0, 16, 13, 10),
                Block.box(1, 0, 0, 2, 3, 8),
                Block.box(1, 3, 0, 2, 5, 7),
                Block.box(1, 5, 0, 2, 6, 6),
                Block.box(1, 6, 0, 2, 7, 5),
                Block.box(1, 7, 0, 2, 8, 3),
                Block.box(2, 0, 0, 4, 12, 3),
                Block.box(2, 0, 3, 4, 11, 5),
                Block.box(2, 0, 5, 4, 10, 7),
                Block.box(2, 0, 7, 4, 9, 8),
                Block.box(2, 0, 8, 4, 8, 9),
                Block.box(2, 0, 9, 4, 7, 10),
                Block.box(2, 0, 10, 4, 5, 11),
                Block.box(2, 0, 11, 4, 3, 12)
        );

        shape3_0 = VoxelShapes.or(
                Block.box(12, 0, 4, 16, 16, 16),
                Block.box(9, 1, 4, 12, 16, 16),
                Block.box(7, 2, 4, 9, 16, 16),
                Block.box(6, 3, 4, 7, 16, 16),
                Block.box(5, 4, 4, 6, 16, 16),
                Block.box(4, 5, 4, 5, 16, 16),
                Block.box(2, 7, 4, 3, 16, 16),
                Block.box(1, 9, 4, 2, 16, 16),
                Block.box(0, 12, 4, 1, 16, 16),
                Block.box(3, 6, 4, 4, 16, 16),
                Block.box(13, 8, 1, 16, 16, 2),
                Block.box(11, 9, 1, 13, 16, 2),
                Block.box(10, 10, 1, 11, 16, 2),
                Block.box(9, 11, 1, 10, 16, 2),
                Block.box(8, 13, 1, 9, 16, 2),
                Block.box(4, 13, 2, 16, 16, 4),
                Block.box(5, 11, 2, 16, 13, 4),
                Block.box(6, 9, 2, 16, 11, 4),
                Block.box(7, 8, 2, 16, 9, 4),
                Block.box(8, 7, 2, 16, 8, 4),
                Block.box(9, 6, 2, 16, 7, 4),
                Block.box(11, 5, 2, 16, 6, 4),
                Block.box(13, 4, 2, 16, 5, 4)
                   );

        shape3_1 = VoxelShapes.or(
                Block.box(0, 0, 12, 12, 16, 16),
                Block.box(0, 1, 9, 12, 16, 12),
                Block.box(0, 2, 7, 12, 16, 9),
                Block.box(0, 3, 6, 12, 16, 7),
                Block.box(0, 4, 5, 12, 16, 6),
                Block.box(0, 5, 4, 12, 16, 5),
                Block.box(0, 7, 2, 12, 16, 3),
                Block.box(0, 9, 1, 12, 16, 2),
                Block.box(0, 12, 0, 12, 16, 1),
                Block.box(0, 6, 3, 12, 16, 4),
                Block.box(14, 8, 13, 15, 16, 16),
                Block.box(14, 9, 11, 15, 16, 13),
                Block.box(14, 10, 10, 15, 16, 11),
                Block.box(14, 11, 9, 15, 16, 10),
                Block.box(14, 13, 8, 15, 16, 9),
                Block.box(12, 13, 4, 14, 16, 16),
                Block.box(12, 11, 5, 14, 13, 16),
                Block.box(12, 9, 6, 14, 11, 16),
                Block.box(12, 8, 7, 14, 9, 16),
                Block.box(12, 7, 8, 14, 8, 16),
                Block.box(12, 6, 9, 14, 7, 16),
                Block.box(12, 5, 11, 14, 6, 16),
                Block.box(12, 4, 13, 14, 5, 16)
            );

        shape3_2 = VoxelShapes.or(
                Block.box(0, 0, 0, 4, 16, 12),
                Block.box(4, 1, 0, 7, 16, 12),
                Block.box(7, 2, 0, 9, 16, 12),
                Block.box(9, 3, 0, 10, 16, 12),
                Block.box(10, 4, 0, 11, 16, 12),
                Block.box(11, 5, 0, 12, 16, 12),
                Block.box(13, 7, 0, 14, 16, 12),
                Block.box(14, 9, 0, 15, 16, 12),
                Block.box(15, 12, 0, 16, 16, 12),
                Block.box(12, 6, 0, 13, 16, 12),
                Block.box(0, 8, 14, 3, 16, 15),
                Block.box(3, 9, 14, 5, 16, 15),
                Block.box(5, 10, 14, 6, 16, 15),
                Block.box(6, 11, 14, 7, 16, 15),
                Block.box(7, 13, 14, 8, 16, 15),
                Block.box(0, 13, 12, 12, 16, 14),
                Block.box(0, 11, 12, 11, 13, 14),
                Block.box(0, 9, 12, 10, 11, 14),
                Block.box(0, 8, 12, 9, 9, 14),
                Block.box(0, 7, 12, 8, 8, 14),
                Block.box(0, 6, 12, 7, 7, 14),
                Block.box(0, 5, 12, 5, 6, 14),
                Block.box(0, 4, 12, 3, 5, 14)
                 );

        shape3_3 = VoxelShapes.or(
                Block.box(4, 0, 0, 16, 16, 4),
                Block.box(4, 1, 4, 16, 16, 7),
                Block.box(4, 2, 7, 16, 16, 9),
                Block.box(4, 3, 9, 16, 16, 10),
                Block.box(4, 4, 10, 16, 16, 11),
                Block.box(4, 5, 11, 16, 16, 12),
                Block.box(4, 7, 13, 16, 16, 14),
                Block.box(4, 9, 14, 16, 16, 15),
                Block.box(4, 12, 15, 16, 16, 16),
                Block.box(4, 6, 12, 16, 16, 13),
                Block.box(1, 8, 0, 2, 16, 3),
                Block.box(1, 9, 3, 2, 16, 5),
                Block.box(1, 10, 5, 2, 16, 6),
                Block.box(1, 11, 6, 2, 16, 7),
                Block.box(1, 13, 7, 2, 16, 8),
                Block.box(2, 13, 0, 4, 16, 12),
                Block.box(2, 11, 0, 4, 13, 11),
                Block.box(2, 9, 0, 4, 11, 10),
                Block.box(2, 8, 0, 4, 9, 9),
                Block.box(2, 7, 0, 4, 8, 8),
                Block.box(2, 6, 0, 4, 7, 7),
                Block.box(2, 5, 0, 4, 6, 5),
                Block.box(2, 4, 0, 4, 5, 3)
             );

        shape4_0 = VoxelShapes.or(
                Block.box(0, 0, 4, 4, 16, 16),
                Block.box(4, 0, 4, 7, 15, 16),
                Block.box(7, 0, 4, 9, 14, 16),
                Block.box(9, 0, 4, 10, 13, 16),
                Block.box(10, 0, 4, 11, 12, 16),
                Block.box(11, 0, 4, 12, 11, 16),
                Block.box(13, 0, 4, 14, 9, 16),
                Block.box(14, 0, 4, 15, 7, 16),
                Block.box(15, 0, 4, 16, 4, 16),
                Block.box(12, 0, 4, 13, 10, 16),
                Block.box(0, 0, 1, 3, 8, 2),
                Block.box(3, 0, 1, 5, 7, 2),
                Block.box(5, 0, 1, 6, 6, 2),
                Block.box(6, 0, 1, 7, 5, 2),
                Block.box(7, 0, 1, 8, 3, 2),
                Block.box(0, 0, 2, 12, 3, 4),
                Block.box(0, 3, 2, 11, 5, 4),
                Block.box(0, 5, 2, 10, 7, 4),
                Block.box(0, 7, 2, 9, 8, 4),
                Block.box(0, 8, 2, 8, 9, 4),
                Block.box(0, 9, 2, 7, 10, 4),
                Block.box(0, 10, 2, 5, 11, 4),
                Block.box(0, 11, 2, 3, 12, 4)
        );


        shape4_1 = VoxelShapes.or(
                Block.box(0, 0, 0, 12, 16, 4),
                Block.box(0, 0, 4, 12, 15, 7),
                Block.box(0, 0, 7, 12, 14, 9),
                Block.box(0, 0, 9, 12, 13, 10),
                Block.box(0, 0, 10, 12, 12, 11),
                Block.box(0, 0, 11, 12, 11, 12),
                Block.box(0, 0, 13, 12, 9, 14),
                Block.box(0, 0, 14, 12, 7, 15),
                Block.box(0, 0, 15, 12, 4, 16),
                Block.box(0, 0, 12, 12, 10, 13),
                Block.box(14, 0, 0, 15, 8, 3),
                Block.box(14, 0, 3, 15, 7, 5),
                Block.box(14, 0, 5, 15, 6, 6),
                Block.box(14, 0, 6, 15, 5, 7),
                Block.box(14, 0, 7, 15, 3, 8),
                Block.box(12, 0, 0, 14, 3, 12),
                Block.box(12, 3, 0, 14, 5, 11),
                Block.box(12, 5, 0, 14, 7, 10),
                Block.box(12, 7, 0, 14, 8, 9),
                Block.box(12, 8, 0, 14, 9, 8),
                Block.box(12, 9, 0, 14, 10, 7),
                Block.box(12, 10, 0, 14, 11, 5),
                Block.box(12, 11, 0, 14, 12, 3)
        );

        shape4_2 = VoxelShapes.or(
                Block.box(12, 0, 0, 16, 16, 12),
                Block.box(9, 0, 0, 12, 15, 12),
                Block.box(7, 0, 0, 9, 14, 12),
                Block.box(6, 0, 0, 7, 13, 12),
                Block.box(5, 0, 0, 6, 12, 12),
                Block.box(4, 0, 0, 5, 11, 12),
                Block.box(2, 0, 0, 3, 9, 12),
                Block.box(1, 0, 0, 2, 7, 12),
                Block.box(0, 0, 0, 1, 4, 12),
                Block.box(3, 0, 0, 4, 10, 12),
                Block.box(13, 0, 14, 16, 8, 15),
                Block.box(11, 0, 14, 13, 7, 15),
                Block.box(10, 0, 14, 11, 6, 15),
                Block.box(9, 0, 14, 10, 5, 15),
                Block.box(8, 0, 14, 9, 3, 15),
                Block.box(4, 0, 12, 16, 3, 14),
                Block.box(5, 3, 12, 16, 5, 14),
                Block.box(6, 5, 12, 16, 7, 14),
                Block.box(7, 7, 12, 16, 8, 14),
                Block.box(8, 8, 12, 16, 9, 14),
                Block.box(9, 9, 12, 16, 10, 14),
                Block.box(11, 10, 12, 16, 11, 14),
                Block.box(13, 11, 12, 16, 12, 14)
        );

        shape4_3 = VoxelShapes.or(
                Block.box(4, 0, 12, 16, 16, 16),
                Block.box(4, 0, 9, 16, 15, 12),
                Block.box(4, 0, 7, 16, 14, 9),
                Block.box(4, 0, 6, 16, 13, 7),
                Block.box(4, 0, 5, 16, 12, 6),
                Block.box(4, 0, 4, 16, 11, 5),
                Block.box(4, 0, 2, 16, 9, 3),
                Block.box(4, 0, 1, 16, 7, 2),
                Block.box(4, 0, 0, 16, 4, 1),
                Block.box(4, 0, 3, 16, 10, 4),
                Block.box(1, 0, 13, 2, 8, 16),
                Block.box(1, 0, 11, 2, 7, 13),
                Block.box(1, 0, 10, 2, 6, 11),
                Block.box(1, 0, 9, 2, 5, 10),
                Block.box(1, 0, 8, 2, 3, 9),
                Block.box(2, 0, 4, 4, 3, 16),
                Block.box(2, 3, 5, 4, 5, 16),
                Block.box(2, 5, 6, 4, 7, 16),
                Block.box(2, 7, 7, 4, 8, 16),
                Block.box(2, 8, 8, 4, 9, 16),
                Block.box(2, 9, 9, 4, 10, 16),
                Block.box(2, 10, 11, 4, 11, 16),
                Block.box(2, 11, 13, 4, 12, 16)
        );

        shape5_0 = VoxelShapes.or(
                Block.box(0, 12, 4, 16, 16, 16),
                Block.box(0, 9, 4, 15, 12, 16),
                Block.box(0, 7, 4, 14, 9, 16),
                Block.box(0, 6, 4, 13, 7, 16),
                Block.box(0, 5, 4, 12, 6, 16),
                Block.box(0, 4, 4, 11, 5, 16),
                Block.box(0, 2, 4, 9, 3, 16),
                Block.box(0, 1, 4, 7, 2, 16),
                Block.box(0, 0, 4, 4, 1, 16),
                Block.box(0, 3, 4, 10, 4, 16),
                Block.box(0, 13, 1, 8, 16, 2),
                Block.box(0, 11, 1, 7, 13, 2),
                Block.box(0, 10, 1, 6, 11, 2),
                Block.box(0, 9, 1, 5, 10, 2),
                Block.box(0, 8, 1, 3, 9, 2),
                Block.box(0, 4, 2, 3, 16, 4),
                Block.box(3, 5, 2, 5, 16, 4),
                Block.box(5, 6, 2, 7, 16, 4),
                Block.box(7, 7, 2, 8, 16, 4),
                Block.box(8, 8, 2, 9, 16, 4),
                Block.box(9, 9, 2, 10, 16, 4),
                Block.box(10, 11, 2, 11, 16, 4),
                Block.box(11, 13, 2, 12, 16, 4)
        );

        shape5_1 = VoxelShapes.or(
                Block.box(0, 12, 0, 12, 16, 16),
                Block.box(0, 9, 0, 12, 12, 15),
                Block.box(0, 7, 0, 12, 9, 14),
                Block.box(0, 6, 0, 12, 7, 13),
                Block.box(0, 5, 0, 12, 6, 12),
                Block.box(0, 4, 0, 12, 5, 11),
                Block.box(0, 2, 0, 12, 3, 9),
                Block.box(0, 1, 0, 12, 2, 7),
                Block.box(0, 0, 0, 12, 1, 4),
                Block.box(0, 3, 0, 12, 4, 10),
                Block.box(14, 13, 0, 15, 16, 8),
                Block.box(14, 11, 0, 15, 13, 7),
                Block.box(14, 10, 0, 15, 11, 6),
                Block.box(14, 9, 0, 15, 10, 5),
                Block.box(14, 8, 0, 15, 9, 3),
                Block.box(12, 4, 0, 14, 16, 3),
                Block.box(12, 5, 3, 14, 16, 5),
                Block.box(12, 6, 5, 14, 16, 7),
                Block.box(12, 7, 7, 14, 16, 8),
                Block.box(12, 8, 8, 14, 16, 9),
                Block.box(12, 9, 9, 14, 16, 10),
                Block.box(12, 11, 10, 14, 16, 11),
                Block.box(12, 13, 11, 14, 16, 12)
        );

        shape5_2 = VoxelShapes.or(
                Block.box(0, 12, 0, 16, 16, 12),
                Block.box(1, 9, 0, 16, 12, 12),
                Block.box(2, 7, 0, 16, 9, 12),
                Block.box(3, 6, 0, 16, 7, 12),
                Block.box(4, 5, 0, 16, 6, 12),
                Block.box(5, 4, 0, 16, 5, 12),
                Block.box(7, 2, 0, 16, 3, 12),
                Block.box(9, 1, 0, 16, 2, 12),
                Block.box(12, 0, 0, 16, 1, 12),
                Block.box(6, 3, 0, 16, 4, 12),
                Block.box(8, 13, 14, 16, 16, 15),
                Block.box(9, 11, 14, 16, 13, 15),
                Block.box(10, 10, 14, 16, 11, 15),
                Block.box(11, 9, 14, 16, 10, 15),
                Block.box(13, 8, 14, 16, 9, 15),
                Block.box(13, 4, 12, 16, 16, 14),
                Block.box(11, 5, 12, 13, 16, 14),
                Block.box(9, 6, 12, 11, 16, 14),
                Block.box(8, 7, 12, 9, 16, 14),
                Block.box(7, 8, 12, 8, 16, 14),
                Block.box(6, 9, 12, 7, 16, 14),
                Block.box(5, 11, 12, 6, 16, 14),
                Block.box(4, 13, 12, 5, 16, 14)
        );

        shape5_3 = VoxelShapes.or(
                Block.box(4, 12, 0, 16, 16, 16),
                Block.box(4, 9, 1, 16, 12, 16),
                Block.box(4, 7, 2, 16, 9, 16),
                Block.box(4, 6, 3, 16, 7, 16),
                Block.box(4, 5, 4, 16, 6, 16),
                Block.box(4, 4, 5, 16, 5, 16),
                Block.box(4, 2, 7, 16, 3, 16),
                Block.box(4, 1, 9, 16, 2, 16),
                Block.box(4, 0, 12, 16, 1, 16),
                Block.box(4, 3, 6, 16, 4, 16),
                Block.box(1, 13, 8, 2, 16, 16),
                Block.box(1, 11, 9, 2, 13, 16),
                Block.box(1, 10, 10, 2, 11, 16),
                Block.box(1, 9, 11, 2, 10, 16),
                Block.box(1, 8, 13, 2, 9, 16),
                Block.box(2, 4, 13, 4, 16, 16),
                Block.box(2, 5, 11, 4, 16, 13),
                Block.box(2, 6, 9, 4, 16, 11),
                Block.box(2, 7, 8, 4, 16, 9),
                Block.box(2, 8, 7, 4, 16, 8),
                Block.box(2, 9, 6, 4, 16, 7),
                Block.box(2, 11, 5, 4, 16, 6),
                Block.box(2, 13, 4, 4, 16, 5)
        );

        shape6_0 = VoxelShapes.or(
                Block.box(0, 0, 0, 4, 16, 16),
                Block.box(4, 0, 0, 7, 15, 16),
                Block.box(7, 0, 0, 9, 14, 16),
                Block.box(9, 0, 0, 10, 13, 16),
                Block.box(10, 0, 0, 11, 12, 16),
                Block.box(11, 0, 0, 12, 11, 16),
                Block.box(13, 0, 0, 14, 9, 16),
                Block.box(14, 0, 0, 15, 7, 16),
                Block.box(15, 0, 0, 16, 4, 16),
                Block.box(12, 0, 0, 13, 10, 16)
        );

        shape6_1 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 16, 4),
                Block.box(0, 0, 4, 16, 15, 7),
                Block.box(0, 0, 7, 16, 14, 9),
                Block.box(0, 0, 9, 16, 13, 10),
                Block.box(0, 0, 10, 16, 12, 11),
                Block.box(0, 0, 11, 16, 11, 12),
                Block.box(0, 0, 13, 16, 9, 14),
                Block.box(0, 0, 14, 16, 7, 15),
                Block.box(0, 0, 15, 16, 4, 16),
                Block.box(0, 0, 12, 16, 10, 13)
        );

        shape6_2 = VoxelShapes.or(
                Block.box(12, 0, 0, 16, 16, 16),
                Block.box(9, 0, 0, 12, 15, 16),
                Block.box(7, 0, 0, 9, 14, 16),
                Block.box(6, 0, 0, 7, 13, 16),
                Block.box(5, 0, 0, 6, 12, 16),
                Block.box(4, 0, 0, 5, 11, 16),
                Block.box(2, 0, 0, 3, 9, 16),
                Block.box(1, 0, 0, 2, 7, 16),
                Block.box(0, 0, 0, 1, 4, 16),
                Block.box(3, 0, 0, 4, 10, 16)
        );

        shape6_3 = VoxelShapes.or(
                Block.box(0, 0, 12, 16, 16, 16),
                Block.box(0, 0, 9, 16, 15, 12),
                Block.box(0, 0, 7, 16, 14, 9),
                Block.box(0, 0, 6, 16, 13, 7),
                Block.box(0, 0, 5, 16, 12, 6),
                Block.box(0, 0, 4, 16, 11, 5),
                Block.box(0, 0, 2, 16, 9, 3),
                Block.box(0, 0, 1, 16, 7, 2),
                Block.box(0, 0, 0, 16, 4, 1),
                Block.box(0, 0, 3, 16, 10, 4)
        );

        shape7_0 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(1, 4, 0, 16, 7, 16),
                Block.box(2, 7, 0, 16, 9, 16),
                Block.box(3, 9, 0, 16, 10, 16),
                Block.box(4, 10, 0, 16, 11, 16),
                Block.box(5, 11, 0, 16, 12, 16),
                Block.box(7, 13, 0, 16, 14, 16),
                Block.box(9, 14, 0, 16, 15, 16),
                Block.box(12, 15, 0, 16, 16, 16),
                Block.box(6, 12, 0, 16, 13, 16)
        );

        shape7_1 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(0, 4, 1, 16, 7, 16),
                Block.box(0, 7, 2, 16, 9, 16),
                Block.box(0, 9, 3, 16, 10, 16),
                Block.box(0, 10, 4, 16, 11, 16),
                Block.box(0, 11, 5, 16, 12, 16),
                Block.box(0, 13, 7, 16, 14, 16),
                Block.box(0, 14, 9, 16, 15, 16),
                Block.box(0, 15, 12, 16, 16, 16),
                Block.box(0, 12, 6, 16, 13, 16)
        );

        shape7_2 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(0, 4, 0, 15, 7, 16),
                Block.box(0, 7, 0, 14, 9, 16),
                Block.box(0, 9, 0, 13, 10, 16),
                Block.box(0, 10, 0, 12, 11, 16),
                Block.box(0, 11, 0, 11, 12, 16),
                Block.box(0, 13, 0, 9, 14, 16),
                Block.box(0, 14, 0, 7, 15, 16),
                Block.box(0, 15, 0, 4, 16, 16),
                Block.box(0, 12, 0, 10, 13, 16)
        );

        shape7_3 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(0, 4, 0, 16, 7, 15),
                Block.box(0, 7, 0, 16, 9, 14),
                Block.box(0, 9, 0, 16, 10, 13),
                Block.box(0, 10, 0, 16, 11, 12),
                Block.box(0, 11, 0, 16, 12, 11),
                Block.box(0, 13, 0, 16, 14, 9),
                Block.box(0, 14, 0, 16, 15, 7),
                Block.box(0, 15, 0, 16, 16, 4),
                Block.box(0, 12, 0, 16, 13, 10)
        );

        shape8_0 = VoxelShapes.or(
                Block.box(12, 0, 0, 16, 16, 16),
                Block.box(9, 1, 0, 12, 16, 16),
                Block.box(7, 2, 0, 9, 16, 16),
                Block.box(6, 3, 0, 7, 16, 16),
                Block.box(5, 4, 0, 6, 16, 16),
                Block.box(4, 5, 0, 5, 16, 16),
                Block.box(2, 7, 0, 3, 16, 16),
                Block.box(1, 9, 0, 2, 16, 16),
                Block.box(0, 12, 0, 1, 16, 16),
                Block.box(3, 6, 0, 4, 16, 16)
        );

        shape8_1 = VoxelShapes.or(
                Block.box(0, 0, 12, 16, 16, 16),
                Block.box(0, 1, 9, 16, 16, 12),
                Block.box(0, 2, 7, 16, 16, 9),
                Block.box(0, 3, 6, 16, 16, 7),
                Block.box(0, 4, 5, 16, 16, 6),
                Block.box(0, 5, 4, 16, 16, 5),
                Block.box(0, 7, 2, 16, 16, 3),
                Block.box(0, 9, 1, 16, 16, 2),
                Block.box(0, 12, 0, 16, 16, 1),
                Block.box(0, 6, 3, 16, 16, 4)
        );

        shape8_2 = VoxelShapes.or(
                Block.box(0, 0, 0, 4, 16, 16),
                Block.box(4, 1, 0, 7, 16, 16),
                Block.box(7, 2, 0, 9, 16, 16),
                Block.box(9, 3, 0, 10, 16, 16),
                Block.box(10, 4, 0, 11, 16, 16),
                Block.box(11, 5, 0, 12, 16, 16),
                Block.box(13, 7, 0, 14, 16, 16),
                Block.box(14, 9, 0, 15, 16, 16),
                Block.box(15, 12, 0, 16, 16, 16),
                Block.box(12, 6, 0, 13, 16, 16)
        );

        shape8_3 = VoxelShapes.or(
                Block.box(0, 0, 0, 16, 16, 4),
                Block.box(0, 1, 4, 16, 16, 7),
                Block.box(0, 2, 7, 16, 16, 9),
                Block.box(0, 3, 9, 16, 16, 10),
                Block.box(0, 4, 10, 16, 16, 11),
                Block.box(0, 5, 11, 16, 16, 12),
                Block.box(0, 7, 13, 16, 16, 14),
                Block.box(0, 9, 14, 16, 16, 15),
                Block.box(0, 12, 15, 16, 16, 16),
                Block.box(0, 6, 12, 16, 16, 13)
        );

        shape9_0 = VoxelShapes.or(
                Block.box(0, 12, 0, 16, 16, 16),
                Block.box(0, 9, 0, 15, 12, 16),
                Block.box(0, 7, 0, 14, 9, 16),
                Block.box(0, 6, 0, 13, 7, 16),
                Block.box(0, 5, 0, 12, 6, 16),
                Block.box(0, 4, 0, 11, 5, 16),
                Block.box(0, 2, 0, 9, 3, 16),
                Block.box(0, 1, 0, 7, 2, 16),
                Block.box(0, 0, 0, 4, 1, 16),
                Block.box(0, 3, 0, 10, 4, 16)
        );

        shape9_1 = VoxelShapes.or(
                Block.box(0, 12, 0, 16, 16, 16),
                Block.box(0, 9, 0, 16, 12, 15),
                Block.box(0, 7, 0, 16, 9, 14),
                Block.box(0, 6, 0, 16, 7, 13),
                Block.box(0, 5, 0, 16, 6, 12),
                Block.box(0, 4, 0, 16, 5, 11),
                Block.box(0, 2, 0, 16, 3, 9),
                Block.box(0, 1, 0, 16, 2, 7),
                Block.box(0, 0, 0, 16, 1, 4),
                Block.box(0, 3, 0, 16, 4, 10)
        );

        shape9_2 = VoxelShapes.or(
                Block.box(0, 12, 0, 16, 16, 16),
                Block.box(1, 9, 0, 16, 12, 16),
                Block.box(2, 7, 0, 16, 9, 16),
                Block.box(3, 6, 0, 16, 7, 16),
                Block.box(4, 5, 0, 16, 6, 16),
                Block.box(5, 4, 0, 16, 5, 16),
                Block.box(7, 2, 0, 16, 3, 16),
                Block.box(9, 1, 0, 16, 2, 16),
                Block.box(12, 0, 0, 16, 1, 16),
                Block.box(6, 3, 0, 16, 4, 16)
        );

        shape9_3 = VoxelShapes.or(
                Block.box(0, 12, 0, 16, 16, 16),
                Block.box(0, 9, 1, 16, 12, 16),
                Block.box(0, 7, 2, 16, 9, 16),
                Block.box(0, 6, 3, 16, 7, 16),
                Block.box(0, 5, 4, 16, 6, 16),
                Block.box(0, 4, 5, 16, 5, 16),
                Block.box(0, 2, 7, 16, 3, 16),
                Block.box(0, 1, 9, 16, 2, 16),
                Block.box(0, 0, 12, 16, 1, 16),
                Block.box(0, 3, 6, 16, 4, 16)
        );
    }

    public BoilersBaseMultiBlocks() {
        super(AbstractBlock.Properties.of(Material.METAL).strength(-1.0F).sound(SoundType.METAL).noDrops().noOcclusion());
        this.registerDefaultState(this.getStateDefinition().any().setValue(BBMultiBlocks,0).setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BBMultiBlocks).add(FACING);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.getValue(FACING);
        Integer integer = state.getValue(BBMultiBlocks);
        if(direction == Direction.NORTH){
            switch (integer){
                default:
                case 0:return shape0_0;
                case 1:return shape1_0;
                case 2:return shape2_0;
                case 3:return shape3_0;
                case 4:return shape4_0;
                case 5:return shape5_0;
                case 6:return shape6_0;
                case 7:return shape7_0;
                case 8:return shape8_0;
                case 9:return shape9_0;
            }
        }else if(direction == Direction.EAST){
            switch (integer){
                default:
                case 0:return shape0_1;
                case 1:return shape1_1;
                case 2:return shape2_1;
                case 3:return shape3_1;
                case 4:return shape4_1;
                case 5:return shape5_1;
                case 6:return shape6_1;
                case 7:return shape7_1;
                case 8:return shape8_1;
                case 9:return shape9_1;
            }
        }else if(direction == Direction.SOUTH){
            switch (integer){
                default:
                case 0:return shape0_2;
                case 1:return shape1_2;
                case 2:return shape2_2;
                case 3:return shape3_2;
                case 4:return shape4_2;
                case 5:return shape5_2;
                case 6:return shape6_2;
                case 7:return shape7_2;
                case 8:return shape8_2;
                case 9:return shape9_2;
            }
        }else {
            switch (integer){
                default:
                case 0:return shape0_3;
                case 1:return shape1_3;
                case 2:return shape2_3;
                case 3:return shape3_3;
                case 4:return shape4_3;
                case 5:return shape5_3;
                case 6:return shape6_3;
                case 7:return shape7_3;
                case 8:return shape8_3;
                case 9:return shape9_3;
            }
        }
    }
}
