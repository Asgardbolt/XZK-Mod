package com.xzk.tech;

import com.xzk.tech.block.BlockRegistry;
import com.xzk.tech.block.ContainerTypeRegistry;
import com.xzk.tech.block.ItemRegistry;
import com.xzk.tech.block.TileEntityTypeRegistry;
import com.xzk.tech.world.biome.BiomeGeneration;
import com.xzk.tech.world.gen.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Tech {
    public Tech() {
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::GenerateOres);
        com.xzk.tech.item.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.xzk.tech.Tool.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.xzk.tech.fluid.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.xzk.tech.fluid.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.xzk.tech.fluid.FluidRegistry.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomeGeneration.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomeGeneration.registerBiomes();
        TileEntityTypeRegistry.TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ContainerTypeRegistry.CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
}





