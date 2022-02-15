package com.xzk.tech.block.BlastFurnaceBaseMachine;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class BlastFurnaceBase extends Block {

    public BlastFurnaceBase(){
        super(Properties.of(Material.METAL).strength(-1.0F).sound(SoundType.METAL).lightLevel((state)->{return 15;}));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new BlastFurnaceBaseTileEntity();
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isClientSide && handIn == Hand.MAIN_HAND) {
            BlastFurnaceBaseTileEntity blastFurnaceBaseTileEntity =(BlastFurnaceBaseTileEntity) worldIn.getBlockEntity(pos);
            NetworkHooks.openGui((ServerPlayerEntity)player,blastFurnaceBaseTileEntity,(PacketBuffer packerBuffer)->{
                packerBuffer.writeBlockPos(blastFurnaceBaseTileEntity.getBlockPos());
            });
        }
        return ActionResultType.SUCCESS;
    }
}
