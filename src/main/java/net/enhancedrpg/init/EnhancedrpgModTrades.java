
/*
*	This file will be REGENERATED on each build.
*/
package net.enhancedrpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnhancedrpgModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.AMETHYST_SHARD, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT, 15),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SALMON, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.PUFFERFISH, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.PHANTOM_MEMBRANE, 15),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.INK_SAC, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.MAP, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.CLOCK),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SPIDER_EYE, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GHAST_TEAR, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.SPLASH_POTION, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.MUSHROOM_STEW, 2),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COCOA_BEANS, 15),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.GOLDEN_APPLE, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.AXOLOTL_BUCKET),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.PRISMARINE_SHARD, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NAUTILUS_SHELL, 2),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.STRING, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.RABBIT_FOOT, 2),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.TIPPED_ARROW, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_BEEF, 12),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.RABBIT_STEW, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.CAKE),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKIE, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.PAINTING, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.CANDLE, 8),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.MASON) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DEEPSLATE_BRICKS, 8),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.NETHER_BRICK, 12),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.CRYING_OBSIDIAN, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.SHEPHERD) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.LEAD, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.CARROT_ON_A_STICK),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NAME_TAG, 3),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GLOWSTONE_DUST, 9),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.HONEYCOMB, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.REDSTONE, 20),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.SLIME_BALL, 5),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_APPR.get()), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GLOW_INK_SAC, 10),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_JOURNEY.get()), 10, 60, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.BLAZE_ROD, 6),

					new ItemStack(EnhancedrpgModItems.RELATIONSHIP_LEVEL_EXPERT.get()), 10, 80, 0.05f));
		}
	}
}
