package com.xzk.tech.fluid;

import com.xzk.tech.Utils;
import com.xzk.tech.group.ModGroup;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static RegistryObject<Item> MercuryBucket = ITEMS.register("mercury_bucket", () -> new BucketItem(FluidRegistry.Mercury, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> HydrogenBucket = ITEMS.register("hydrogen_bucket", () -> new BucketItem(FluidRegistry.Hydrogen, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> HeliumBucket = ITEMS.register("helium_bucket", () -> new BucketItem(FluidRegistry.Helium, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> NitrogenBucket = ITEMS.register("nitrogen_bucket", () -> new BucketItem(FluidRegistry.Nitrogen, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> OxygenBucket = ITEMS.register("oxygen_bucket", () -> new BucketItem(FluidRegistry.Oxygen, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> FluorineBucket = ITEMS.register("fluorine_bucket", () -> new BucketItem(FluidRegistry.Fluorine, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> NeonBucket = ITEMS.register("neon_bucket", () -> new BucketItem(FluidRegistry.Neon, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> ChlorineBucket = ITEMS.register("chlorine_bucket", () -> new BucketItem(FluidRegistry.Chlorine, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> ArgonBucket = ITEMS.register("argon_bucket", () -> new BucketItem(FluidRegistry.Argon, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> KryptonBucket = ITEMS.register("krypton_bucket", () -> new BucketItem(FluidRegistry.Krypton, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> XenonBucket = ITEMS.register("xenon_bucket", () -> new BucketItem(FluidRegistry.Xenon, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> RadonBucket = ITEMS.register("radon_bucket", () -> new BucketItem(FluidRegistry.Radon, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> BromineBucket = ITEMS.register("bromine_bucket", () -> new BucketItem(FluidRegistry.Bromine, new Item.Properties().tab(ModGroup.BasicElements).stacksTo(1)));
    public static RegistryObject<Item> DistilledWaterBucket = ITEMS.register("distilled_water_bucket", () -> new BucketItem(FluidRegistry.DistilledWater, new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));
}
