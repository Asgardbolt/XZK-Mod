package com.xzk.tech.fluid;

import com.xzk.tech.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static RegistryObject<FlowingFluidBlock> MercuryRubikCube = BLOCKS.register("mercury", () -> new FlowingFluidBlock(FluidRegistry.Mercury, Block.Properties.of(Material.LAVA).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> HydrogenRubikCube = BLOCKS.register("hydrogen", () -> new FlowingFluidBlock(FluidRegistry.Hydrogen, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> HeliumRubikCube = BLOCKS.register("helium", () -> new FlowingFluidBlock(FluidRegistry.Helium, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> NitrogenRubikCube = BLOCKS.register("nitrogen", () -> new FlowingFluidBlock(FluidRegistry.Nitrogen, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> OxygenRubikCube = BLOCKS.register("oxygen", () -> new FlowingFluidBlock(FluidRegistry.Oxygen, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> FluorineRubikCube = BLOCKS.register("fluorine", () -> new FlowingFluidBlock(FluidRegistry.Fluorine, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> NeonRubikCube = BLOCKS.register("neon", () -> new FlowingFluidBlock(FluidRegistry.Neon, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> ChlorineRubikCube = BLOCKS.register("chlorine", () -> new FlowingFluidBlock(FluidRegistry.Chlorine, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> ArgonRubikCube = BLOCKS.register("argon", () -> new FlowingFluidBlock(FluidRegistry.Argon, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> KryptonRubikCube = BLOCKS.register("krypton", () -> new FlowingFluidBlock(FluidRegistry.Krypton, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> XenonRubikCube = BLOCKS.register("xenon", () -> new FlowingFluidBlock(FluidRegistry.Xenon, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> RadonRubikCube = BLOCKS.register("radon", () -> new FlowingFluidBlock(FluidRegistry.Radon, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> BromineRubikCube = BLOCKS.register("bromine", () -> new FlowingFluidBlock(FluidRegistry.Bromine, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
    public static RegistryObject<FlowingFluidBlock> DistilledWaterRubikCube = BLOCKS.register("distilled_water",()-> new FlowingFluidBlock(FluidRegistry.DistilledWater, Block.Properties.of(Material.WATER).dynamicShape().strength(100.0F).noDrops()));
}
