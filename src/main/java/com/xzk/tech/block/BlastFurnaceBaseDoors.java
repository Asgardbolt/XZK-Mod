package com.xzk.tech.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlastFurnaceBaseDoors extends Block {
    private static final VoxelShape shape0;
    private static final VoxelShape shape0_1;
    private static final VoxelShape shape1;
    private static final VoxelShape shape1_1;
    private static final VoxelShape shape2;
    private static final VoxelShape shape2_1;
    private static final VoxelShape shape3;
    private static final VoxelShape shape3_1;
    public static final BooleanProperty OPEN = BooleanProperty.create("open");
    public static final IntegerProperty SIDE_4 = IntegerProperty.create("side_4",0,3);

    static {
        VoxelShape base1_1 = Block.box(2, 14, 0, 14, 16, 16);
        VoxelShape base1_2 = Block.box(2, 0, 0, 14, 2, 16);
        VoxelShape base1_3 = Block.box(0, 0, 0, 2, 16, 16);
        VoxelShape base1_4 = Block.box(14, 0, 0, 16, 16, 16);
        VoxelShape base1_5 = Block.box(2, 2, 1, 14, 14, 2);
        VoxelShape base1_6 = Block.box(12, 6, 0, 13, 10, 1);
        shape0 = VoxelShapes.or(base1_1,base1_2,base1_3,base1_4,base1_5,base1_6);

        VoxelShape base1_1_1 = Block.box(2, 14, 0, 14, 16, 16);
        VoxelShape base1_1_2 = Block.box(2, 0, 0, 14, 2, 16);
        VoxelShape base1_1_3 = Block.box(0, 0, 0, 2, 16, 16);
        VoxelShape base1_1_4 = Block.box(14, 0, 0, 16, 16, 16);
        VoxelShape base1_1_5 = Block.box(2, 2, 1, 3, 14, 13);
        VoxelShape base1_1_6 = Block.box(3, 6, 11, 4, 10, 12);
        shape0_1 = VoxelShapes.or(base1_1_1,base1_1_2,base1_1_3,base1_1_4,base1_1_5,base1_1_6);

        VoxelShape base2_1 = Block.box(0, 14, 2, 16, 16, 14);
        VoxelShape base2_2 = Block.box(0, 0, 2, 16, 2, 14);
        VoxelShape base2_3 = Block.box(0, 0, 0, 16, 16, 2);
        VoxelShape base2_4 = Block.box(0, 0, 14, 16, 16, 16);
        VoxelShape base2_5 = Block.box(14, 2, 2, 15, 14, 14);
        VoxelShape base2_6 = Block.box(15, 6, 12, 16, 10, 13);
        shape1 = VoxelShapes.or(base2_1,base2_2,base2_3,base2_4,base2_5,base2_6);

        VoxelShape base2_1_1 = Block.box(0, 14, 2, 16, 16, 14);
        VoxelShape base2_1_2 = Block.box(0, 0, 2, 16, 2, 14);
        VoxelShape base2_1_3 = Block.box(0, 0, 0, 16, 16, 2);
        VoxelShape base2_1_4 = Block.box(0, 0, 14, 16, 16, 16);
        VoxelShape base2_1_5 = Block.box(3, 2, 2, 15, 14, 3);
        VoxelShape base2_1_6 = Block.box(4, 6, 3, 5, 10, 4);
        shape1_1 = VoxelShapes.or(base2_1_1,base2_1_2,base2_1_3,base2_1_4,base2_1_5,base2_1_6);

        VoxelShape base3_1 = Block.box(2, 14, 0, 14, 16, 16);
        VoxelShape base3_2 = Block.box(2, 0, 0, 14, 2, 16);
        VoxelShape base3_3 = Block.box(0, 0, 0, 2, 16, 16);
        VoxelShape base3_4 = Block.box(14, 0, 0, 16, 16, 16);
        VoxelShape base3_5 = Block.box(2, 2, 1, 14, 14, 2);
        VoxelShape base3_6 = Block.box(12, 6, 0, 13, 10, 1);
        shape2 = VoxelShapes.or(base3_1,base3_2,base3_3,base3_4,base3_5,base3_6);

        VoxelShape base3_1_1 = Block.box(2, 14, 0, 14, 16, 16);
        VoxelShape base3_1_2 = Block.box(2, 0, 0, 14, 2, 16);
        VoxelShape base3_1_3 = Block.box(0, 0, 0, 2, 16, 16);
        VoxelShape base3_1_4 = Block.box(14, 0, 0, 16, 16, 16);
        VoxelShape base3_1_5 = Block.box(2, 2, 1, 3, 14, 13);
        VoxelShape base3_1_6 = Block.box(3, 6, 11, 4, 10, 12);
        shape2_1 = VoxelShapes.or(base3_1_1,base3_1_2,base3_1_3,base3_1_4,base3_1_5,base3_1_6);

        VoxelShape base4_1 = Block.box(0, 14, 2, 16, 16, 14);
        VoxelShape base4_2 = Block.box(0, 0, 2, 16, 2, 14);
        VoxelShape base4_3 = Block.box(0, 0, 14, 16, 16, 16);
        VoxelShape base4_4 =  Block.box(0, 0, 0, 16, 16, 2);
        VoxelShape base4_5 =  Block.box(1, 2, 2, 2, 14, 14);
        VoxelShape base4_6 = Block.box(0, 6, 3, 1, 10, 4);
        shape3 = VoxelShapes.or(base4_1,base4_2,base4_3,base4_4,base4_5,base4_6);

        VoxelShape base7 = Block.box(0, 14, 2, 16, 16, 14);
        VoxelShape base8 = Block.box(0, 0, 2, 16, 2, 14);
        VoxelShape base9 = Block.box(0, 0, 14, 16, 16, 16);
        VoxelShape base10 = Block.box(0, 0, 0, 16, 16, 2);
        VoxelShape base11 = Block.box(1, 2, 13, 13, 14, 14);
        VoxelShape base12 = Block.box(11, 6, 12, 12, 10, 13);
        shape3_1 = VoxelShapes.or(base7,base8,base9,base10,base11,base12);
    }

    public BlastFurnaceBaseDoors(){
        super(Properties.of(Material.METAL).strength(-1.0F).sound(SoundType.METAL).noDrops().noOcclusion());
        this.registerDefaultState(this.getStateDefinition().any().setValue(OPEN, Boolean.FALSE).setValue(SIDE_4,0));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(SIDE_4)){
            case 0:
                return state.getValue(OPEN) ? shape0_1 : shape0;
            case 1:
                return state.getValue(OPEN) ? shape1_1 : shape1;
            case 2:
                return state.getValue(OPEN) ? shape2_1 : shape2;
            case 3:
                return state.getValue(OPEN) ? shape3_1 : shape3;
            default:
                return shape0;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(OPEN).add(SIDE_4);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public ActionResultType use(BlockState blockState, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        if (!world.isClientSide() && hand == Hand.MAIN_HAND) {
            if(!blockState.getValue(OPEN)){
                world.setBlock(pos, this.getStateDefinition().any().setValue(OPEN,Boolean.TRUE).setValue(SIDE_4,blockState.getValue(SIDE_4)),2);
            }else{
                world.setBlock(pos, this.getStateDefinition().any().setValue(OPEN,Boolean.FALSE).setValue(SIDE_4,blockState.getValue(SIDE_4)),2);
            }
        }
        return ActionResultType.SUCCESS;
    }
}
