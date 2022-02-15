package com.xzk.tech.world.gen;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.IChunk;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber()
public class OreCancel {
    @SubscribeEvent(priority = EventPriority.NORMAL,receiveCanceled = true)
    public static void Canceler(ChunkEvent.Load event) {
        IChunk theChunk = event.getChunk();

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = 2; y <= 256; y++) {
                    BlockPos pos = new BlockPos(x, y, z);
                    if (theChunk.getBlockState(pos).getBlock() == Blocks.GOLD_ORE || theChunk.getBlockState(pos).getBlock() == Blocks.DIAMOND_ORE || theChunk.getBlockState(pos).getBlock() == Blocks.EMERALD_ORE
                    ) {
                        theChunk.setBlockState(pos, Blocks.STONE.defaultBlockState(), false);
                    }
                }
            }
        }
    }
}
