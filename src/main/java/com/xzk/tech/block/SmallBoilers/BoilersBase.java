package com.xzk.tech.block.SmallBoilers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.network.PacketBuffer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class BoilersBase extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    private static final VoxelShape shape0;
    private static final VoxelShape shape1;
    private static final VoxelShape shape2;
    private static final VoxelShape shape3;

    static {
      shape0 = VoxelShapes.or(
              Block.box(0, 10, 4, 16, 11, 5),
              Block.box(0, 9, 3, 16, 10, 4),
              Block.box(0, 15, 12, 16, 16, 16),
              Block.box(0, 14, 9, 16, 15, 12),
              Block.box(0, 13, 7, 16, 14, 9),
              Block.box(0, 11, 5, 16, 12, 6),
              Block.box(0, 12, 6, 16, 13, 7),
              Block.box(0, 7, 2, 16, 9, 3),
              Block.box(0, 4, 1, 16, 7, 2),
              Block.box(0, 0, 0, 16, 4, 1),
              Block.box(5, 15, 9, 11, 16, 10),
              Block.box(5, 12, 5, 6, 16, 6),
              Block.box(10, 12, 5, 11, 16, 6),
              Block.box(10, 13, 6, 11, 16, 7),
              Block.box(5, 14, 7, 6, 16, 9),
              Block.box(10, 14, 7, 11, 16, 9),
              Block.box(5, 13, 6, 6, 16, 7),
              Block.box(5, 11, 4, 11, 16, 5),
              Block.box(6, 14, 5, 10, 15, 9)
               );

      shape1 = VoxelShapes.or(
              Block.box(11, 10, 0, 12, 11, 16),
              Block.box(12, 9, 0, 13, 10, 16),
              Block.box(0, 15, 0, 4, 16, 16),
              Block.box(4, 14, 0, 7, 15, 16),
              Block.box(7, 13, 0, 9, 14, 16),
              Block.box(10, 11, 0, 11, 12, 16),
              Block.box(9, 12, 0, 10, 13, 16),
              Block.box(13, 7, 0, 14, 9, 16),
              Block.box(14, 4, 0, 15, 7, 16),
              Block.box(15, 0, 0, 16, 4, 16),
              Block.box(6, 15, 5, 7, 16, 11),
              Block.box(10, 12, 5, 11, 16, 6),
              Block.box(10, 12, 10, 11, 16, 11),
              Block.box(9, 13, 10, 10, 16, 11),
              Block.box(7, 14, 5, 9, 16, 6),
              Block.box(7, 14, 10, 9, 16, 11),
              Block.box(9, 13, 5, 10, 16, 6),
              Block.box(11, 11, 5, 12, 16, 11),
              Block.box(7, 14, 6, 11, 15, 10)
      );

      shape2 = VoxelShapes.or(
              Block.box(0, 10, 11, 16, 11, 12),
              Block.box(0, 9, 12, 16, 10, 13),
              Block.box(0, 15, 0, 16, 16, 4),
              Block.box(0, 14, 4, 16, 15, 7),
              Block.box(0, 13, 7, 16, 14, 9),
              Block.box(0, 11, 10, 16, 12, 11),
              Block.box(0, 12, 9, 16, 13, 10),
              Block.box(0, 7, 13, 16, 9, 14),
              Block.box(0, 4, 14, 16, 7, 15),
              Block.box(0, 0, 15, 16, 4, 16),
              Block.box(5, 15, 6, 11, 16, 7),
              Block.box(10, 12, 10, 11, 16, 11),
              Block.box(5, 12, 10, 6, 16, 11),
              Block.box(5, 13, 9, 6, 16, 10),
              Block.box(10, 14, 7, 11, 16, 9),
              Block.box(5, 14, 7, 6, 16, 9),
              Block.box(10, 13, 9, 11, 16, 10),
              Block.box(5, 11, 11, 11, 16, 12),
              Block.box(6, 14, 7, 10, 15, 11)
      );

      shape3 = VoxelShapes.or(
              Block.box(4, 10, 0, 5, 11, 16),
              Block.box(3, 9, 0, 4, 10, 16),
              Block.box(12, 15, 0, 16, 16, 16),
              Block.box(9, 14, 0, 12, 15, 16),
              Block.box(7, 13, 0, 9, 14, 16),
              Block.box(5, 11, 0, 6, 12, 16),
              Block.box(6, 12, 0, 7, 13, 16),
              Block.box(2, 7, 0, 3, 9, 16),
              Block.box(1, 4, 0, 2, 7, 16),
              Block.box(0, 0, 0, 1, 4, 16),
              Block.box(9, 15, 5, 10, 16, 11),
              Block.box(5, 12, 10, 6, 16, 11),
              Block.box(5, 12, 5, 6, 16, 6),
              Block.box(6, 13, 5, 7, 16, 6),
              Block.box(7, 14, 10, 9, 16, 11),
              Block.box(7, 14, 5, 9, 16, 6),
              Block.box(6, 13, 10, 7, 16, 11),
              Block.box(4, 11, 5, 5, 16, 11),
              Block.box(5, 14, 6, 9, 15, 10)
      );
    }

    public BoilersBase(){
        super(Properties.of(Material.METAL).noOcclusion().strength(-1.0F).sound(SoundType.METAL).lightLevel((state)->{return 15;}));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        return this.defaultBlockState().setValue(FACING, p_196258_1_.getHorizontalDirection().getOpposite());
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BoilersBaseTileEntity();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction direction = state.getValue(FACING);
        if(direction == Direction.NORTH){
            return shape0;
        }else if(direction == Direction.EAST){
            return shape1;
        }else if(direction == Direction.SOUTH){
            return shape2;
        }else return shape3;
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isClientSide && handIn == Hand.MAIN_HAND) {
            BoilersBaseTileEntity smallBoilersTileEntity =(BoilersBaseTileEntity) worldIn.getBlockEntity(pos);
            NetworkHooks.openGui((ServerPlayerEntity)player,smallBoilersTileEntity,(PacketBuffer packerBuffer)->{
                packerBuffer.writeBlockPos(smallBoilersTileEntity.getBlockPos());
            });
        }
        return ActionResultType.SUCCESS;
    }

    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation(p_185471_1_.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING);
    }
}
