package com.xzk.tech.block;

import com.xzk.tech.world.TP.TeleporterTechTwo;
import com.xzk.tech.world.dimension.DimensionGeneration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class VeryDeepPortalToVeryDeep extends Block {
     public VeryDeepPortalToVeryDeep(){
          super(AbstractBlock.Properties.of(Material.PORTAL).randomTicks().strength(-1.0F).sound(SoundType.GLASS).air());
     }

     @Override
     public ActionResultType use(BlockState blockState, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
          if (!world.isClientSide() && hand == Hand.MAIN_HAND){
               if(!(player.isPassenger())) {
                    if (world instanceof ServerWorld && world.getServer() != null) {
                         ServerWorld world1 = world.getServer().getLevel(DimensionGeneration.VeryDeep);
                         if (!(world1 == null)) {
                              BlockPos target =new BlockPos(player.position().x,250,player.position().z);
                              player.changeDimension(world1,new TeleporterTechTwo(target));
                         }
                    }
               }
          }
          return ActionResultType.SUCCESS;
     }
}


