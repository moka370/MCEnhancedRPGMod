
/*
 *	This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.enhancedrpg.world.inventory.BackpackGUIMenu;
import net.mcreator.enhancedrpg.EnhancedrpgMod;

public class EnhancedrpgModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EnhancedrpgMod.MODID);
	public static final RegistryObject<MenuType<BackpackGUIMenu>> BACKPACK_GUI = REGISTRY.register("backpack_gui", () -> IForgeMenuType.create(BackpackGUIMenu::new));
}
