
/*
 *	This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.registries.RegistryObject;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.enhancedrpg.world.inventory.BackpackGUIMenu;
import net.enhancedrpg.EnhancedrpgMod;

// class responsible for registering mod menus
public class EnhancedrpgModMenus {
    // DeferredRegister for MenuType, linked to the MENU_TYPES registry from ForgeRegistries
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EnhancedrpgMod.MODID);
	
    // RegistryObject for the backpack GUI menu, registered with the DeferredRegister
	public static final RegistryObject<MenuType<BackpackGUIMenu>> BACKPACK_GUI = REGISTRY.register("backpack_gui", () -> IForgeMenuType.create(BackpackGUIMenu::new));
}
