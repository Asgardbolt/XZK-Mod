package com.xzk.tech.fluid;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(FluidRegistry.Mercury.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.MercuryFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Hydrogen.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.HydrogenFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Helium.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.HeliumFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Nitrogen.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.NitrogenFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Oxygen.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.OxygenFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Fluorine.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.FluorineFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Neon.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.NeonFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Chlorine.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.ChlorineFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Argon.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.ArgonFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Krypton.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.KryptonFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Xenon.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.XenonFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Radon.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.RadonFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.Bromine.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.BromineFlowing.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.DistilledWater.get(), RenderType.translucent());
            RenderTypeLookup.setRenderLayer(FluidRegistry.DistilledWaterFlowing.get(), RenderType.translucent());
        });
    }
}
