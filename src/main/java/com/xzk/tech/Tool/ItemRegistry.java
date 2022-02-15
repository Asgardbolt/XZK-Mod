package com.xzk.tech.Tool;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "tech");
    public static RegistryObject<Item> BasicBuildingTools = ITEMS.register("basic_building_tools", BasicBuildingTools::new);
    public static RegistryObject<Item> DamagedBasicBuildingTools = ITEMS.register("damaged_basic_building_tools", DamagedBasicBuildingTools::new);
    public static RegistryObject<Item> BrokenBasicBuildingTools = ITEMS.register("broken_basic_building_tools", BrokenBasicBuildingTools::new);
}
