package com.xzk.tech.block;

import com.xzk.tech.Utils;
import com.xzk.tech.block.SmallBoilers.BoilersBaseTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<com.xzk.tech.block.BlastFurnaceBaseMachine.BlastFurnaceBaseTileEntity>> BlastFurnaceBaseTileEntity = TILE_ENTITIES.register("blast_furnace_base_tile_entity",()->
            TileEntityType.Builder.of(com.xzk.tech.block.BlastFurnaceBaseMachine.BlastFurnaceBaseTileEntity::new, BlockRegistry.BlastFurnaceBase.get()).build(null));
    public static final RegistryObject<TileEntityType<BoilersBaseTileEntity>> BoilersBaseTileEntity = TILE_ENTITIES.register("boilers_base_tile_entity",()->
            TileEntityType.Builder.of(BoilersBaseTileEntity::new, BlockRegistry.BoilersBase.get()).build(null));
}
