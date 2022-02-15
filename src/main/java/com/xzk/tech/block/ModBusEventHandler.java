package com.xzk.tech.block;

import com.xzk.tech.block.BlastFurnaceBaseMachine.BlastFurnaceBaseScreen;
import com.xzk.tech.block.SmallBoilers.BoilersBaseScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEventHandler {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ScreenManager.register(ContainerTypeRegistry.BlastFurnaceBaseContainer.get(), BlastFurnaceBaseScreen::new);
        });

        event.enqueueWork(() -> {
            ScreenManager.register(ContainerTypeRegistry.BoilersBaseContainer.get(), BoilersBaseScreen::new);
        });
    }
}
