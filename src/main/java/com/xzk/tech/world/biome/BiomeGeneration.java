package com.xzk.tech.world.biome;

import com.xzk.tech.Utils;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BiomeGeneration {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Utils.MOD_ID);

    static {
        createBiome("deep_biome", BiomeMaker::theVoidBiome);
        createBiome("very_deep_biome", BiomeMaker::theVoidBiome);
    }

    public static RegistryKey<Biome> DeepBiome = registerBiome("deep_biome");
    public static RegistryKey<Biome> VeryDeepBiome = registerBiome("very_deep_biome");

    public static RegistryKey<Biome> registerBiome(String biomeName) {
        return RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Utils.MOD_ID, biomeName));
    }

    public static RegistryObject<Biome> createBiome(String biomeName, Supplier<Biome> biome) {
        return BIOMES.register(biomeName, biome);
    }

    public static void registerBiomes() {

        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(DeepBiome, 0));
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(VeryDeepBiome, 0));
    }
}
