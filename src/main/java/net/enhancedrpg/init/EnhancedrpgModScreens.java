
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

import net.enhancedrpg.client.gui.UniqueToolGUIScreen;
import net.enhancedrpg.client.gui.UnbreakingGUIScreen;
import net.enhancedrpg.client.gui.TridentGUIScreen;
import net.enhancedrpg.client.gui.ToolGUIScreen;
import net.enhancedrpg.client.gui.ThornsGUIScreen;
import net.enhancedrpg.client.gui.SwiftSneakGUIScreen;
import net.enhancedrpg.client.gui.SweepingGUIScreen;
import net.enhancedrpg.client.gui.SoulSpeedGUIScreen;
import net.enhancedrpg.client.gui.SmiteGUIScreen;
import net.enhancedrpg.client.gui.SilkTouchGUIScreen;
import net.enhancedrpg.client.gui.SharpnessGUIScreen;
import net.enhancedrpg.client.gui.RiptideGUIScreen;
import net.enhancedrpg.client.gui.RangedGUIScreen;
import net.enhancedrpg.client.gui.PunchGUIScreen;
import net.enhancedrpg.client.gui.ProtectionGUIScreen;
import net.enhancedrpg.client.gui.ProjectProcGUIScreen;
import net.enhancedrpg.client.gui.PowerGUIScreen;
import net.enhancedrpg.client.gui.PiercingGUIScreen;
import net.enhancedrpg.client.gui.MultishotGUIScreen;
import net.enhancedrpg.client.gui.MendingGUIScreen;
import net.enhancedrpg.client.gui.MeeleeWeaponGUIScreen;
import net.enhancedrpg.client.gui.MeeleeUnqDmgGUIScreen;
import net.enhancedrpg.client.gui.MeeleeMobDmgGUIScreen;
import net.enhancedrpg.client.gui.MeeleeIncDmgGUIScreen;
import net.enhancedrpg.client.gui.LureGUIScreen;
import net.enhancedrpg.client.gui.LuckSeaGUIScreen;
import net.enhancedrpg.client.gui.LoyaltyGUIScreen;
import net.enhancedrpg.client.gui.LootingGUIScreen;
import net.enhancedrpg.client.gui.KnockbackGUIScreen;
import net.enhancedrpg.client.gui.JourneyLevelScreen;
import net.enhancedrpg.client.gui.InfinityGUIScreen;
import net.enhancedrpg.client.gui.ImpalingGUIScreen;
import net.enhancedrpg.client.gui.FrostWalkGUIScreen;
import net.enhancedrpg.client.gui.FortuneGUIScreen;
import net.enhancedrpg.client.gui.FlameGUIScreen;
import net.enhancedrpg.client.gui.FishingGUIScreen;
import net.enhancedrpg.client.gui.FireProcGUIScreen;
import net.enhancedrpg.client.gui.FireGUIScreen;
import net.enhancedrpg.client.gui.FeatherFallGUIScreen;
import net.enhancedrpg.client.gui.ExpertLevelScreen;
import net.enhancedrpg.client.gui.EnchantmentGUIScreen;
import net.enhancedrpg.client.gui.EfficiencyGUIScreen;
import net.enhancedrpg.client.gui.DepthGUIScreen;
import net.enhancedrpg.client.gui.ChannelGUIScreen;
import net.enhancedrpg.client.gui.BlastProcGUIScreen;
import net.enhancedrpg.client.gui.BasicToolGUIScreen;
import net.enhancedrpg.client.gui.BasicGUIScreen;
import net.enhancedrpg.client.gui.BaneArthroGUIScreen;
import net.enhancedrpg.client.gui.ArmorUnderwaterGUIScreen;
import net.enhancedrpg.client.gui.ArmorProtectionGUIScreen;
import net.enhancedrpg.client.gui.ArmorMovementGUIScreen;
import net.enhancedrpg.client.gui.ArmorGUIScreen;
import net.enhancedrpg.client.gui.AquaAffinityGUIScreen;
import net.enhancedrpg.client.gui.ApprenticeLevelScreen;
import net.enhancedrpg.client.gui.AdvancedGUIScreen;


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
			MenuScreens.register(EnhancedrpgModMenus.ENCHANTMENT_GUI.get(), EnchantmentGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.TOOL_GUI.get(), ToolGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.ARMOR_GUI.get(), ArmorGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.ARMOR_PROTECTION_GUI.get(), ArmorProtectionGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.ARMOR_MOVEMENT_GUI.get(), ArmorMovementGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.ARMOR_UNDERWATER_GUI.get(), ArmorUnderwaterGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MEELEE_WEAPON_GUI.get(), MeeleeWeaponGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MEELEE_MOB_DMG_GUI.get(), MeeleeMobDmgGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MEELEE_INC_DMG_GUI.get(), MeeleeIncDmgGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MEELEE_UNQ_DMG_GUI.get(), MeeleeUnqDmgGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.THORNS_GUI.get(), ThornsGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.PROTECTION_GUI.get(), ProtectionGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FIRE_PROC_GUI.get(), FireProcGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.BLAST_PROC_GUI.get(), BlastProcGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.PROJECT_PROC_GUI.get(), ProjectProcGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FEATHER_FALL_GUI.get(), FeatherFallGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FROST_WALK_GUI.get(), FrostWalkGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SWIFT_SNEAK_GUI.get(), SwiftSneakGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SOUL_SPEED_GUI.get(), SoulSpeedGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.AQUA_AFFINITY_GUI.get(), AquaAffinityGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.DEPTH_GUI.get(), DepthGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.BANE_ARTHRO_GUI.get(), BaneArthroGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.IMPALING_GUI.get(), ImpalingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SMITE_GUI.get(), SmiteGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SWEEPING_GUI.get(), SweepingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.EFFICIENCY_GUI.get(), EfficiencyGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SHARPNESS_GUI.get(), SharpnessGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FIRE_GUI.get(), FireGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.KNOCKBACK_GUI.get(), KnockbackGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.LOOTING_GUI.get(), LootingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.RANGED_GUI.get(), RangedGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.BASIC_GUI.get(), BasicGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.PIERCING_GUI.get(), PiercingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.POWER_GUI.get(), PowerGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.PUNCH_GUI.get(), PunchGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.ADVANCED_GUI.get(), AdvancedGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MULTISHOT_GUI.get(), MultishotGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.INFINITY_GUI.get(), InfinityGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FLAME_GUI.get(), FlameGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.TRIDENT_GUI.get(), TridentGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.CHANNEL_GUI.get(), ChannelGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.RIPTIDE_GUI.get(), RiptideGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.LOYALTY_GUI.get(), LoyaltyGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.BASIC_TOOL_GUI.get(), BasicToolGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.UNBREAKING_GUI.get(), UnbreakingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FORTUNE_GUI.get(), FortuneGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.FISHING_GUI.get(), FishingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.LUCK_SEA_GUI.get(), LuckSeaGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.LURE_GUI.get(), LureGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.UNIQUE_TOOL_GUI.get(), UniqueToolGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.SILK_TOUCH_GUI.get(), SilkTouchGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.MENDING_GUI.get(), MendingGUIScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.APPRENTICE_LEVEL.get(), ApprenticeLevelScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.JOURNEY_LEVEL.get(), JourneyLevelScreen::new);
			MenuScreens.register(EnhancedrpgModMenus.EXPERT_LEVEL.get(), ExpertLevelScreen::new);
		});
	}
}
