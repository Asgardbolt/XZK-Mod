package com.xzk.tech.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;

public class BoilersBaseCore extends Block {
    private static VoxelShape shape;

    static {
        shape = VoxelShapes.or(
                Block.box(0, 4, 0, 16, 5, 16),
                Block.box(14, 0, 14, 16, 4, 16),
                Block.box(14, 0, 0, 16, 4, 2),
                Block.box(0, 0, 14, 2, 4, 16),
                Block.box(0, 0, 0, 2, 4, 2),
                Block.box(3, 5, 1, 10, 6, 2),
                Block.box(3, 5, 4, 10, 6, 5),
                Block.box(13, 5, 10, 15, 6, 11),
                Block.box(15, 5, 3, 16, 6, 10),
                Block.box(13, 5, 2, 15, 6, 3),
                Block.box(12, 5, 3, 13, 6, 10),
                Block.box(2, 5, 2, 3, 6, 4),
                Block.box(10, 5, 2, 11, 6, 4),
                Block.box(2, 5, 7, 3, 7, 8),
                Block.box(4, 5, 7, 5, 7, 8),
                Block.box(6, 5, 7, 7, 7, 8),
                Block.box(8, 5, 7, 10, 6, 8),
                Block.box(4, 6, 14, 10, 7, 15),
                Block.box(1, 7, 10, 9, 8, 11),
                Block.box(1, 6, 9, 9, 7, 10),
                Block.box(1, 5, 10, 9, 6, 11),
                Block.box(1, 6, 11, 9, 7, 12),
                Block.box(12, 5, 11, 13, 13, 12),
                Block.box(11, 5, 10, 12, 13, 11),
                Block.box(10, 5, 11, 11, 13, 12),
                Block.box(10, 5, 7, 11, 9, 8),
                Block.box(11, 5, 6, 12, 9, 7),
                Block.box(10, 5, 5, 11, 9, 6),
                Block.box(9, 5, 6, 10, 9, 7),
                Block.box(11, 5, 12, 12, 13, 13),
                Block.box(4, 5, 13, 10, 6, 14),
                Block.box(4, 7, 13, 10, 8, 14),
                Block.box(4, 6, 12, 10, 7, 13)
        );
    }

    public BoilersBaseCore() {
        super(Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(6).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE));
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return shape;
    }
}
