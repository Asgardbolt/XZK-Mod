package com.xzk.tech.block;

import com.xzk.tech.Utils;
import com.xzk.tech.block.BlastFurnaceBaseMachine.BlastFurnaceBaseContainer;
import com.xzk.tech.block.SmallBoilers.BoilersBaseContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeRegistry {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Utils.MOD_ID);
    public static final RegistryObject<ContainerType<BlastFurnaceBaseContainer>> BlastFurnaceBaseContainer = CONTAINERS.register("obsidian_first_container", () ->
            IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) ->
            new BlastFurnaceBaseContainer(windowId, inv)));
    public static final RegistryObject<ContainerType<BoilersBaseContainer>> BoilersBaseContainer = CONTAINERS.register("boilers_base_container", () ->
            IForgeContainerType.create((int windowId, PlayerInventory inv, PacketBuffer data) ->
                    new BoilersBaseContainer(windowId, inv)));
}