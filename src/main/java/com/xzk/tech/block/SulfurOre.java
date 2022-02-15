package com.xzk.tech.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SulfurOre extends OreBlock {
     public SulfurOre(){
          super(Properties.of(Material.SAND).strength(0.5f).sound(SoundType.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL));
     }

     public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
          List<ItemStack> dropsOriginal = super.getDrops(state, builder);
          if (!dropsOriginal.isEmpty())
               return dropsOriginal;
          return Collections.singletonList(new ItemStack(this, 1));
     }

     @Override
     protected int xpOnDrop(Random random) {
          return MathHelper.nextInt(random, 0, 2);
     }
}
