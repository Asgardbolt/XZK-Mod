package com.xzk.tech.world.dimension;

import com.xzk.tech.Utils;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class DimensionGeneration {
    public static final RegistryKey<World> DEEP = RegistryKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Utils.MOD_ID,"deep"));
    public static final RegistryKey<World> VeryDeep = RegistryKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Utils.MOD_ID,"very_deep"));
}
