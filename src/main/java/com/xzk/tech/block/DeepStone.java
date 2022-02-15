package com.xzk.tech.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;

public class DeepStone extends OreBlock {
     public DeepStone() {
          super(AbstractBlock.Properties.of(Material.STONE).strength(3).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
     }

     public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
          List<ItemStack> dropsOriginal = super.getDrops(state, builder);
          if (!dropsOriginal.isEmpty())
               return dropsOriginal;
          return Collections.singletonList(new ItemStack(this, 1));
     }
}


