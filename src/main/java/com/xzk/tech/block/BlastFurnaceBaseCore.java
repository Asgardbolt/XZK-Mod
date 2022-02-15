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

public class BlastFurnaceBaseCore extends Block {
	private static VoxelShape shape;

	static {
		shape = VoxelShapes.or(
				Block.box(1, 6, 3, 2, 9, 7),
				Block.box(0, 9, 3, 1, 13, 7),
				Block.box(7, 9, 3, 8, 13, 7),
				Block.box(6, 6, 3, 7, 9, 7),
				Block.box(2, 6, 2, 6, 9, 3),
				Block.box(2, 9, 1, 6, 13, 2),
				Block.box(2, 9, 8, 6, 13, 9),
				Block.box(2, 6, 7, 6, 9, 8),
				Block.box(2, 5, 3, 6, 6, 7),
				Block.box(1, 9, 2, 2, 13, 3),
				Block.box(6, 9, 2, 7, 13, 3),
				Block.box(1, 9, 7, 2, 13, 8),
				Block.box(6, 9, 7, 7, 13, 8),
				Block.box(2, 11, 2, 6, 12, 8),
				Block.box(6, 11, 3, 7, 12, 7),
				Block.box(1, 11, 3, 2, 12, 7),
				Block.box(0, 4, 0, 16, 5, 16),
				Block.box(10, 5, 1, 11, 6, 13),
				Block.box(10, 7, 1, 11, 8, 13),
				Block.box(15, 6, 1, 16, 7, 13),
				Block.box(14, 5, 1, 15, 6, 13),
				Block.box(13, 6, 1, 14, 7, 13),
				Block.box(14, 7, 1, 15, 8, 13),
				Block.box(9, 9, 12, 16, 10, 13),
				Block.box(9, 8, 11, 16, 9, 12),
				Block.box(9, 9, 10, 16, 10, 11),
				Block.box(9, 10, 11, 16, 11, 12),
				Block.box(8, 9, 8, 16, 10, 9),
				Block.box(8, 8, 7, 16, 9, 8),
				Block.box(8, 9, 6, 16, 10, 7),
				Block.box(8, 10, 7, 16, 11, 8),
				Block.box(11, 6, 1, 12, 7, 13),
				Block.box(9, 6, 1, 10, 7, 13),
				Block.box(0, 10, 9, 8, 11, 10),
				Block.box(0, 6, 10, 1, 8, 11),
				Block.box(2, 6, 10, 3, 8, 11),
				Block.box(5, 6, 10, 6, 8, 11),
				Block.box(7, 6, 10, 8, 8, 11),
				Block.box(1, 5, 14, 3, 6, 15),
				Block.box(4, 5, 14, 5, 7, 15),
				Block.box(6, 5, 14, 7, 7, 15),
				Block.box(8, 5, 14, 9, 7, 15),
				Block.box(0, 8, 9, 1, 10, 10),
				Block.box(2, 8, 9, 3, 10, 10),
				Block.box(5, 8, 9, 6, 10, 10),
				Block.box(7, 8, 9, 8, 10, 10),
				Block.box(0, 0, 14, 2, 4, 16),
				Block.box(14, 0, 0, 16, 4, 2),
				Block.box(0, 0, 0, 2, 4, 2),
				Block.box(14, 0, 14, 16, 4, 16),
				Block.box(0, 5, 10, 8, 6, 11)
		 );
	}

	public BlastFurnaceBaseCore() {
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
