
/*
 *    This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.enhancedrpg.item.RelationshipLevelJourneyItem;
import net.enhancedrpg.item.RelationshipLevelExpertItem;
import net.enhancedrpg.item.RelationshipLevelApprItem;
import net.enhancedrpg.item.EntitemItem;

import net.enhancedrpg.item.BackpackItem;
import net.enhancedrpg.EnhancedrpgMod;

// class responsible for registering mod items
public class EnhancedrpgModItems {
    // DeferredRegister for Item type, linked to the ITEMS registry from ForgeRegistries
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedrpgMod.MODID);
	
    // RegistryObject for the backpack item, registered with the DeferredRegister
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> ENTITEM = REGISTRY.register("entitem", () -> new EntitemItem());
	public static final RegistryObject<Item> RELATIONSHIP_LEVEL_APPR = REGISTRY.register("relationship_level_appr", () -> new RelationshipLevelApprItem());
	public static final RegistryObject<Item> RELATIONSHIP_LEVEL_JOURNEY = REGISTRY.register("relationship_level_journey", () -> new RelationshipLevelJourneyItem());
	public static final RegistryObject<Item> RELATIONSHIP_LEVEL_EXPERT = REGISTRY.register("relationship_level_expert", () -> new RelationshipLevelExpertItem());

}
