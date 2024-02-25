
/*
 *	This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.enhancedrpg.client.gui.BackpackGUIScreen;

// class annotated as a Mod Event Bus Subscriber for client-side events
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnhancedrpgModScreens {
    // SubscribeEvent annotation indicates that the method will be called when the specified event occurs
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
        // enqueue work on the client thread during client setup
		event.enqueueWork(() -> {
            // register the Backpack GUI screen with the MenuScreens class
			MenuScreens.register(EnhancedrpgModMenus.BACKPACK_GUI.get(), BackpackGUIScreen::new);
		});
	}
}
