package com.xzk.tech.world.TP;

import com.xzk.tech.block.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;

import java.util.function.Function;

public class TeleporterTechTwo implements ITeleporter {
    private BlockPos pos;

    public TeleporterTechTwo(BlockPos pos) {
        this.pos = pos;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        Entity e = repositionEntity.apply(false);
        if (!(e instanceof ServerPlayerEntity)) {
            return e;
        }
        ServerPlayerEntity player = (ServerPlayerEntity) e;

        BlockPos targetBlock1 = new BlockPos(
                calculateLowestBedrockPos(destWorld, pos).getX(),
                calculateLowestBedrockPos(destWorld, pos).getY() - 1,
                calculateLowestBedrockPos(destWorld, pos).getZ()
        );
        BlockPos targetBlock2 = new BlockPos(
                calculateLowestBedrockPos(destWorld, pos).getX(),
                calculateLowestBedrockPos(destWorld, pos).getY() - 2,
                calculateLowestBedrockPos(destWorld, pos).getZ()
        );
        player.teleportTo(pos.getX() + 0.5D, targetBlock2.getY(), pos.getZ() + 0.5D);

        destWorld.setBlock(calculateLowestBedrockPos(destWorld, pos), BlockRegistry.VeryDeepPortalToDeep.get().defaultBlockState(), 4);
        destWorld.setBlock(targetBlock1, Blocks.AIR.defaultBlockState(), 4);
        destWorld.setBlock(targetBlock2, Blocks.AIR.defaultBlockState(), 4);

        return e;
    }

    BlockPos calculateLowestBedrockPos(ServerWorld world, BlockPos pos){
        for(int i = 250; i <= 255; i++){
            Block block = world.getBlockState(new BlockPos(pos.getX(), i, pos.getZ())).getBlock();

            if(block == Blocks.BEDROCK || block == BlockRegistry.VeryDeepPortalToDeep.get()) return new BlockPos(pos.getX(), i, pos.getZ());
        }
        return new BlockPos(pos.getX(), 250, pos.getZ());
    }
}
