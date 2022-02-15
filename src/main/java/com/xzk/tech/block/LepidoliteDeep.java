package com.xzk.tech.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;

public class LepidoliteDeep extends OreBlock {
     public LepidoliteDeep(){
          super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(6).sound(SoundType.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE));
     }

     public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
          List<ItemStack> dropsOriginal = super.getDrops(state, builder);
          if (!dropsOriginal.isEmpty())
               return dropsOriginal;
          return Collections.singletonList(new ItemStack(this, 1));
     }
}
