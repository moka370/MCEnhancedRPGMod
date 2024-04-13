
/*
 *    This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.enhancedrpg.EnhancedrpgMod;

// class annotated as a Mod Event Bus Subscriber
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnhancedrpgModTabs {
    // DeferredRegister for CreativeModeTab type, linked to the CREATIVE_MODE_TAB registry from Registries
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnhancedrpgMod.MODID);

    // SubscribeEvent annotation indicates that the method will be called when the specified event occurs
	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		
        // check if the creative mode tab being built is TOOLS_AND_UTILITIES
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            // accept the Backpack item into the creative mode tab
			tabData.accept(EnhancedrpgModItems.BACKPACK.get());
			//new
			tabData.accept(EnhancedrpgModItems.ENTITEM.get());
			tabData.accept(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get());
			tabData.accept(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get());
			tabData.accept(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get());

		}
	}
}
