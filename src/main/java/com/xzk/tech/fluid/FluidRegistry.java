package com.xzk.tech.fluid;

import com.xzk.tech.Utils;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidRegistry {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Utils.MOD_ID);

    public static RegistryObject<FlowingFluid> Mercury = FLUIDS.register("mercury", () -> new ForgeFlowingFluid.Source(FluidRegistry.MercuryPROPERTIES));
    public static RegistryObject<FlowingFluid> MercuryFlowing = FLUIDS.register("mercury_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.MercuryPROPERTIES));
    public static ForgeFlowingFluid.Properties MercuryPROPERTIES = new ForgeFlowingFluid.Properties(Mercury, MercuryFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/mercury"),new ResourceLocation("tech:fluid/mercury_flowing")).color(0xFFFFFFFF).density(4000).viscosity(10000)).bucket(ItemRegistry.MercuryBucket).block(BlockRegistry.MercuryRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Hydrogen = FLUIDS.register("hydrogen", () -> new ForgeFlowingFluid.Source(FluidRegistry.HydrogenPROPERTIES));
    public static RegistryObject<FlowingFluid> HydrogenFlowing = FLUIDS.register("hydrogen_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.HydrogenPROPERTIES));
    public static ForgeFlowingFluid.Properties HydrogenPROPERTIES = new ForgeFlowingFluid.Properties(Hydrogen, HydrogenFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.HydrogenBucket).block(BlockRegistry.HydrogenRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Helium = FLUIDS.register("helium", () -> new ForgeFlowingFluid.Source(FluidRegistry.HeliumPROPERTIES));
    public static RegistryObject<FlowingFluid> HeliumFlowing = FLUIDS.register("helium_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.HeliumPROPERTIES));
    public static ForgeFlowingFluid.Properties HeliumPROPERTIES = new ForgeFlowingFluid.Properties(Helium, HeliumFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.HeliumBucket).block(BlockRegistry.HeliumRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Nitrogen = FLUIDS.register("nitrogen", () -> new ForgeFlowingFluid.Source(FluidRegistry.NitrogenPROPERTIES));
    public static RegistryObject<FlowingFluid> NitrogenFlowing = FLUIDS.register("nitrogen_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.NitrogenPROPERTIES));
    public static ForgeFlowingFluid.Properties NitrogenPROPERTIES = new ForgeFlowingFluid.Properties(Nitrogen, NitrogenFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.NitrogenBucket).block(BlockRegistry.NitrogenRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Oxygen = FLUIDS.register("oxygen", () -> new ForgeFlowingFluid.Source(FluidRegistry.OxygenPROPERTIES));
    public static RegistryObject<FlowingFluid> OxygenFlowing = FLUIDS.register("oxygen_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.OxygenPROPERTIES));
    public static ForgeFlowingFluid.Properties OxygenPROPERTIES = new ForgeFlowingFluid.Properties(Oxygen, OxygenFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFF66FFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.OxygenBucket).block(BlockRegistry.OxygenRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Fluorine = FLUIDS.register("fluorine", () -> new ForgeFlowingFluid.Source(FluidRegistry.FluorinePROPERTIES));
    public static RegistryObject<FlowingFluid> FluorineFlowing = FLUIDS.register("fluorine_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.FluorinePROPERTIES));
    public static ForgeFlowingFluid.Properties FluorinePROPERTIES = new ForgeFlowingFluid.Properties(Fluorine, FluorineFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFE6E633).density(-10).viscosity(10000)).bucket(ItemRegistry.FluorineBucket).block(BlockRegistry.FluorineRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Neon = FLUIDS.register("neon", () -> new ForgeFlowingFluid.Source(FluidRegistry.NeonPROPERTIES));
    public static RegistryObject<FlowingFluid> NeonFlowing = FLUIDS.register("neon_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.NeonPROPERTIES));
    public static ForgeFlowingFluid.Properties NeonPROPERTIES = new ForgeFlowingFluid.Properties(Neon, NeonFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.NeonBucket).block(BlockRegistry.NeonRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Chlorine = FLUIDS.register("chlorine", () -> new ForgeFlowingFluid.Source(FluidRegistry.ChlorinePROPERTIES));
    public static RegistryObject<FlowingFluid> ChlorineFlowing = FLUIDS.register("chlorine_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.ChlorinePROPERTIES));
    public static ForgeFlowingFluid.Properties ChlorinePROPERTIES = new ForgeFlowingFluid.Properties(Chlorine, ChlorineFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFD7FF33).density(-10).viscosity(10000)).bucket(ItemRegistry.ChlorineBucket).block(BlockRegistry.ChlorineRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Argon = FLUIDS.register("argon", () -> new ForgeFlowingFluid.Source(FluidRegistry.ArgonPROPERTIES));
    public static RegistryObject<FlowingFluid> ArgonFlowing = FLUIDS.register("argon_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.ArgonPROPERTIES));
    public static ForgeFlowingFluid.Properties ArgonPROPERTIES = new ForgeFlowingFluid.Properties(Argon, ArgonFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.ArgonBucket).block(BlockRegistry.ArgonRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Krypton = FLUIDS.register("krypton", () -> new ForgeFlowingFluid.Source(FluidRegistry.KryptonPROPERTIES));
    public static RegistryObject<FlowingFluid> KryptonFlowing = FLUIDS.register("krypton_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.KryptonPROPERTIES));
    public static ForgeFlowingFluid.Properties KryptonPROPERTIES = new ForgeFlowingFluid.Properties(Krypton, KryptonFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.KryptonBucket).block(BlockRegistry.KryptonRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Xenon = FLUIDS.register("xenon", () -> new ForgeFlowingFluid.Source(FluidRegistry.XenonPROPERTIES));
    public static RegistryObject<FlowingFluid> XenonFlowing = FLUIDS.register("xenon_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.XenonPROPERTIES));
    public static ForgeFlowingFluid.Properties XenonPROPERTIES = new ForgeFlowingFluid.Properties(Xenon, XenonFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/hydrogen"),new ResourceLocation("tech:fluid/hydrogen_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.XenonBucket).block(BlockRegistry.XenonRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Radon = FLUIDS.register("radon", () -> new ForgeFlowingFluid.Source(FluidRegistry.RadonPROPERTIES));
    public static RegistryObject<FlowingFluid> RadonFlowing = FLUIDS.register("radon_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.RadonPROPERTIES));
    public static ForgeFlowingFluid.Properties RadonPROPERTIES = new ForgeFlowingFluid.Properties(Radon, RadonFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/radon"),new ResourceLocation("tech:fluid/radon_flowing")).color(0xFFFFFFFF).density(-10).viscosity(10000)).bucket(ItemRegistry.RadonBucket).block(BlockRegistry.RadonRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> Bromine = FLUIDS.register("bromine", () -> new ForgeFlowingFluid.Source(FluidRegistry.BrominePROPERTIES));
    public static RegistryObject<FlowingFluid> BromineFlowing = FLUIDS.register("bromine_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.BrominePROPERTIES));
    public static ForgeFlowingFluid.Properties BrominePROPERTIES = new ForgeFlowingFluid.Properties(Bromine, BromineFlowing, FluidAttributes.builder(new ResourceLocation("tech:fluid/bromine"),new ResourceLocation("tech:fluid/bromine_flowing")).color(0xFF660000).density(-10).viscosity(10000)).bucket(ItemRegistry.BromineBucket).block(BlockRegistry.BromineRubikCube).slopeFindDistance(2).explosionResistance(100F);

    public static RegistryObject<FlowingFluid> DistilledWater = FLUIDS.register("distilled_water", () -> new ForgeFlowingFluid.Source(FluidRegistry.DistilledWaterPROPERTIES));
    public static RegistryObject<FlowingFluid> DistilledWaterFlowing = FLUIDS.register("distilled_water_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegistry.DistilledWaterPROPERTIES));
    public static ForgeFlowingFluid.Properties DistilledWaterPROPERTIES = new ForgeFlowingFluid.Properties(DistilledWater, DistilledWaterFlowing, FluidAttributes.builder(new ResourceLocation("minecraft:block/water_still"),new ResourceLocation("minecraft:block/water_flow")).color(0xFF87CEEB).density(-10).viscosity(10000)).bucket(ItemRegistry.DistilledWaterBucket).block(BlockRegistry.DistilledWaterRubikCube).slopeFindDistance(2).explosionResistance(100F);

}
