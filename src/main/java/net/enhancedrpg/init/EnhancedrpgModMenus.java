
/*
 *	This file will be REGENERATED on each build.
 */
package net.enhancedrpg.init;

import net.minecraftforge.registries.RegistryObject;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;
import net.enhancedrpg.world.inventory.UniqueToolGUIMenu;
import net.enhancedrpg.world.inventory.UnbreakingGUIMenu;
import net.enhancedrpg.world.inventory.TridentGUIMenu;
import net.enhancedrpg.world.inventory.ToolGUIMenu;
import net.enhancedrpg.world.inventory.ThornsGUIMenu;
import net.enhancedrpg.world.inventory.SwiftSneakGUIMenu;
import net.enhancedrpg.world.inventory.SweepingGUIMenu;
import net.enhancedrpg.world.inventory.SoulSpeedGUIMenu;
import net.enhancedrpg.world.inventory.SmiteGUIMenu;
import net.enhancedrpg.world.inventory.SilkTouchGUIMenu;
import net.enhancedrpg.world.inventory.SharpnessGUIMenu;
import net.enhancedrpg.world.inventory.RiptideGUIMenu;
import net.enhancedrpg.world.inventory.RangedGUIMenu;
import net.enhancedrpg.world.inventory.PunchGUIMenu;
import net.enhancedrpg.world.inventory.ProtectionGUIMenu;
import net.enhancedrpg.world.inventory.ProjectProcGUIMenu;
import net.enhancedrpg.world.inventory.PowerGUIMenu;
import net.enhancedrpg.world.inventory.PiercingGUIMenu;
import net.enhancedrpg.world.inventory.MultishotGUIMenu;
import net.enhancedrpg.world.inventory.MendingGUIMenu;
import net.enhancedrpg.world.inventory.MeeleeWeaponGUIMenu;
import net.enhancedrpg.world.inventory.MeeleeUnqDmgGUIMenu;
import net.enhancedrpg.world.inventory.MeeleeMobDmgGUIMenu;
import net.enhancedrpg.world.inventory.MeeleeIncDmgGUIMenu;
import net.enhancedrpg.world.inventory.LureGUIMenu;
import net.enhancedrpg.world.inventory.LuckSeaGUIMenu;
import net.enhancedrpg.world.inventory.LoyaltyGUIMenu;
import net.enhancedrpg.world.inventory.LootingGUIMenu;
import net.enhancedrpg.world.inventory.KnockbackGUIMenu;
import net.enhancedrpg.world.inventory.JourneyLevelMenu;
import net.enhancedrpg.world.inventory.InfinityGUIMenu;
import net.enhancedrpg.world.inventory.ImpalingGUIMenu;
import net.enhancedrpg.world.inventory.FrostWalkGUIMenu;
import net.enhancedrpg.world.inventory.FortuneGUIMenu;
import net.enhancedrpg.world.inventory.FlameGUIMenu;
import net.enhancedrpg.world.inventory.FishingGUIMenu;
import net.enhancedrpg.world.inventory.FireProcGUIMenu;
import net.enhancedrpg.world.inventory.FireGUIMenu;
import net.enhancedrpg.world.inventory.FeatherFallGUIMenu;
import net.enhancedrpg.world.inventory.ExpertLevelMenu;
import net.enhancedrpg.world.inventory.EnchantmentGUIMenu;
import net.enhancedrpg.world.inventory.EfficiencyGUIMenu;
import net.enhancedrpg.world.inventory.DepthGUIMenu;
import net.enhancedrpg.world.inventory.ChannelGUIMenu;
import net.enhancedrpg.world.inventory.BlastProcGUIMenu;
import net.enhancedrpg.world.inventory.BasicToolGUIMenu;
import net.enhancedrpg.world.inventory.BasicGUIMenu;
import net.enhancedrpg.world.inventory.BaneArthroGUIMenu;
import net.enhancedrpg.world.inventory.ArmorUnderwaterGUIMenu;
import net.enhancedrpg.world.inventory.ArmorProtectionGUIMenu;
import net.enhancedrpg.world.inventory.ArmorMovementGUIMenu;
import net.enhancedrpg.world.inventory.ArmorGUIMenu;
import net.enhancedrpg.world.inventory.AquaAffinityGUIMenu;
import net.enhancedrpg.world.inventory.ApprenticeLevelMenu;
import net.enhancedrpg.world.inventory.AdvancedGUIMenu;
import net.enhancedrpg.world.inventory.BackpackGUIMenu;
import net.enhancedrpg.EnhancedrpgMod;

// class responsible for registering mod menus
public class EnhancedrpgModMenus {
    // DeferredRegister for MenuType, linked to the MENU_TYPES registry from ForgeRegistries
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EnhancedrpgMod.MODID);
	
    // RegistryObject for the backpack GUI menu, registered with the DeferredRegister
	public static final RegistryObject<MenuType<BackpackGUIMenu>> BACKPACK_GUI = REGISTRY.register("backpack_gui", () -> IForgeMenuType.create(BackpackGUIMenu::new));
	public static final RegistryObject<MenuType<EnchantmentGUIMenu>> ENCHANTMENT_GUI = REGISTRY.register("enchantment_gui", () -> IForgeMenuType.create(EnchantmentGUIMenu::new));
	public static final RegistryObject<MenuType<ToolGUIMenu>> TOOL_GUI = REGISTRY.register("tool_gui", () -> IForgeMenuType.create(ToolGUIMenu::new));
	public static final RegistryObject<MenuType<ArmorGUIMenu>> ARMOR_GUI = REGISTRY.register("armor_gui", () -> IForgeMenuType.create(ArmorGUIMenu::new));
	public static final RegistryObject<MenuType<ArmorProtectionGUIMenu>> ARMOR_PROTECTION_GUI = REGISTRY.register("armor_protection_gui", () -> IForgeMenuType.create(ArmorProtectionGUIMenu::new));
	public static final RegistryObject<MenuType<ArmorMovementGUIMenu>> ARMOR_MOVEMENT_GUI = REGISTRY.register("armor_movement_gui", () -> IForgeMenuType.create(ArmorMovementGUIMenu::new));
	public static final RegistryObject<MenuType<ArmorUnderwaterGUIMenu>> ARMOR_UNDERWATER_GUI = REGISTRY.register("armor_underwater_gui", () -> IForgeMenuType.create(ArmorUnderwaterGUIMenu::new));
	public static final RegistryObject<MenuType<MeeleeWeaponGUIMenu>> MEELEE_WEAPON_GUI = REGISTRY.register("meelee_weapon_gui", () -> IForgeMenuType.create(MeeleeWeaponGUIMenu::new));
	public static final RegistryObject<MenuType<MeeleeMobDmgGUIMenu>> MEELEE_MOB_DMG_GUI = REGISTRY.register("meelee_mob_dmg_gui", () -> IForgeMenuType.create(MeeleeMobDmgGUIMenu::new));
	public static final RegistryObject<MenuType<MeeleeIncDmgGUIMenu>> MEELEE_INC_DMG_GUI = REGISTRY.register("meelee_inc_dmg_gui", () -> IForgeMenuType.create(MeeleeIncDmgGUIMenu::new));
	public static final RegistryObject<MenuType<MeeleeUnqDmgGUIMenu>> MEELEE_UNQ_DMG_GUI = REGISTRY.register("meelee_unq_dmg_gui", () -> IForgeMenuType.create(MeeleeUnqDmgGUIMenu::new));
	public static final RegistryObject<MenuType<ThornsGUIMenu>> THORNS_GUI = REGISTRY.register("thorns_gui", () -> IForgeMenuType.create(ThornsGUIMenu::new));
	public static final RegistryObject<MenuType<ProtectionGUIMenu>> PROTECTION_GUI = REGISTRY.register("protection_gui", () -> IForgeMenuType.create(ProtectionGUIMenu::new));
	public static final RegistryObject<MenuType<FireProcGUIMenu>> FIRE_PROC_GUI = REGISTRY.register("fire_proc_gui", () -> IForgeMenuType.create(FireProcGUIMenu::new));
	public static final RegistryObject<MenuType<BlastProcGUIMenu>> BLAST_PROC_GUI = REGISTRY.register("blast_proc_gui", () -> IForgeMenuType.create(BlastProcGUIMenu::new));
	public static final RegistryObject<MenuType<ProjectProcGUIMenu>> PROJECT_PROC_GUI = REGISTRY.register("project_proc_gui", () -> IForgeMenuType.create(ProjectProcGUIMenu::new));
	public static final RegistryObject<MenuType<FeatherFallGUIMenu>> FEATHER_FALL_GUI = REGISTRY.register("feather_fall_gui", () -> IForgeMenuType.create(FeatherFallGUIMenu::new));
	public static final RegistryObject<MenuType<FrostWalkGUIMenu>> FROST_WALK_GUI = REGISTRY.register("frost_walk_gui", () -> IForgeMenuType.create(FrostWalkGUIMenu::new));
	public static final RegistryObject<MenuType<SwiftSneakGUIMenu>> SWIFT_SNEAK_GUI = REGISTRY.register("swift_sneak_gui", () -> IForgeMenuType.create(SwiftSneakGUIMenu::new));
	public static final RegistryObject<MenuType<SoulSpeedGUIMenu>> SOUL_SPEED_GUI = REGISTRY.register("soul_speed_gui", () -> IForgeMenuType.create(SoulSpeedGUIMenu::new));
	public static final RegistryObject<MenuType<AquaAffinityGUIMenu>> AQUA_AFFINITY_GUI = REGISTRY.register("aqua_affinity_gui", () -> IForgeMenuType.create(AquaAffinityGUIMenu::new));
	public static final RegistryObject<MenuType<DepthGUIMenu>> DEPTH_GUI = REGISTRY.register("depth_gui", () -> IForgeMenuType.create(DepthGUIMenu::new));
	public static final RegistryObject<MenuType<BaneArthroGUIMenu>> BANE_ARTHRO_GUI = REGISTRY.register("bane_arthro_gui", () -> IForgeMenuType.create(BaneArthroGUIMenu::new));
	public static final RegistryObject<MenuType<ImpalingGUIMenu>> IMPALING_GUI = REGISTRY.register("impaling_gui", () -> IForgeMenuType.create(ImpalingGUIMenu::new));
	public static final RegistryObject<MenuType<SmiteGUIMenu>> SMITE_GUI = REGISTRY.register("smite_gui", () -> IForgeMenuType.create(SmiteGUIMenu::new));
	public static final RegistryObject<MenuType<SweepingGUIMenu>> SWEEPING_GUI = REGISTRY.register("sweeping_gui", () -> IForgeMenuType.create(SweepingGUIMenu::new));
	public static final RegistryObject<MenuType<EfficiencyGUIMenu>> EFFICIENCY_GUI = REGISTRY.register("efficiency_gui", () -> IForgeMenuType.create(EfficiencyGUIMenu::new));
	public static final RegistryObject<MenuType<SharpnessGUIMenu>> SHARPNESS_GUI = REGISTRY.register("sharpness_gui", () -> IForgeMenuType.create(SharpnessGUIMenu::new));
	public static final RegistryObject<MenuType<FireGUIMenu>> FIRE_GUI = REGISTRY.register("fire_gui", () -> IForgeMenuType.create(FireGUIMenu::new));
	public static final RegistryObject<MenuType<KnockbackGUIMenu>> KNOCKBACK_GUI = REGISTRY.register("knockback_gui", () -> IForgeMenuType.create(KnockbackGUIMenu::new));
	public static final RegistryObject<MenuType<LootingGUIMenu>> LOOTING_GUI = REGISTRY.register("looting_gui", () -> IForgeMenuType.create(LootingGUIMenu::new));
	public static final RegistryObject<MenuType<RangedGUIMenu>> RANGED_GUI = REGISTRY.register("ranged_gui", () -> IForgeMenuType.create(RangedGUIMenu::new));
	public static final RegistryObject<MenuType<BasicGUIMenu>> BASIC_GUI = REGISTRY.register("basic_gui", () -> IForgeMenuType.create(BasicGUIMenu::new));
	public static final RegistryObject<MenuType<PiercingGUIMenu>> PIERCING_GUI = REGISTRY.register("piercing_gui", () -> IForgeMenuType.create(PiercingGUIMenu::new));
	public static final RegistryObject<MenuType<PowerGUIMenu>> POWER_GUI = REGISTRY.register("power_gui", () -> IForgeMenuType.create(PowerGUIMenu::new));
	public static final RegistryObject<MenuType<PunchGUIMenu>> PUNCH_GUI = REGISTRY.register("punch_gui", () -> IForgeMenuType.create(PunchGUIMenu::new));
	public static final RegistryObject<MenuType<AdvancedGUIMenu>> ADVANCED_GUI = REGISTRY.register("advanced_gui", () -> IForgeMenuType.create(AdvancedGUIMenu::new));
	public static final RegistryObject<MenuType<MultishotGUIMenu>> MULTISHOT_GUI = REGISTRY.register("multishot_gui", () -> IForgeMenuType.create(MultishotGUIMenu::new));
	public static final RegistryObject<MenuType<InfinityGUIMenu>> INFINITY_GUI = REGISTRY.register("infinity_gui", () -> IForgeMenuType.create(InfinityGUIMenu::new));
	public static final RegistryObject<MenuType<FlameGUIMenu>> FLAME_GUI = REGISTRY.register("flame_gui", () -> IForgeMenuType.create(FlameGUIMenu::new));
	public static final RegistryObject<MenuType<TridentGUIMenu>> TRIDENT_GUI = REGISTRY.register("trident_gui", () -> IForgeMenuType.create(TridentGUIMenu::new));
	public static final RegistryObject<MenuType<ChannelGUIMenu>> CHANNEL_GUI = REGISTRY.register("channel_gui", () -> IForgeMenuType.create(ChannelGUIMenu::new));
	public static final RegistryObject<MenuType<RiptideGUIMenu>> RIPTIDE_GUI = REGISTRY.register("riptide_gui", () -> IForgeMenuType.create(RiptideGUIMenu::new));
	public static final RegistryObject<MenuType<LoyaltyGUIMenu>> LOYALTY_GUI = REGISTRY.register("loyalty_gui", () -> IForgeMenuType.create(LoyaltyGUIMenu::new));
	public static final RegistryObject<MenuType<BasicToolGUIMenu>> BASIC_TOOL_GUI = REGISTRY.register("basic_tool_gui", () -> IForgeMenuType.create(BasicToolGUIMenu::new));
	public static final RegistryObject<MenuType<UnbreakingGUIMenu>> UNBREAKING_GUI = REGISTRY.register("unbreaking_gui", () -> IForgeMenuType.create(UnbreakingGUIMenu::new));
	public static final RegistryObject<MenuType<FortuneGUIMenu>> FORTUNE_GUI = REGISTRY.register("fortune_gui", () -> IForgeMenuType.create(FortuneGUIMenu::new));
	public static final RegistryObject<MenuType<FishingGUIMenu>> FISHING_GUI = REGISTRY.register("fishing_gui", () -> IForgeMenuType.create(FishingGUIMenu::new));
	public static final RegistryObject<MenuType<LuckSeaGUIMenu>> LUCK_SEA_GUI = REGISTRY.register("luck_sea_gui", () -> IForgeMenuType.create(LuckSeaGUIMenu::new));
	public static final RegistryObject<MenuType<LureGUIMenu>> LURE_GUI = REGISTRY.register("lure_gui", () -> IForgeMenuType.create(LureGUIMenu::new));
	public static final RegistryObject<MenuType<UniqueToolGUIMenu>> UNIQUE_TOOL_GUI = REGISTRY.register("unique_tool_gui", () -> IForgeMenuType.create(UniqueToolGUIMenu::new));
	public static final RegistryObject<MenuType<SilkTouchGUIMenu>> SILK_TOUCH_GUI = REGISTRY.register("silk_touch_gui", () -> IForgeMenuType.create(SilkTouchGUIMenu::new));
	public static final RegistryObject<MenuType<MendingGUIMenu>> MENDING_GUI = REGISTRY.register("mending_gui", () -> IForgeMenuType.create(MendingGUIMenu::new));
	public static final RegistryObject<MenuType<ApprenticeLevelMenu>> APPRENTICE_LEVEL = REGISTRY.register("apprentice_level", () -> IForgeMenuType.create(ApprenticeLevelMenu::new));
	public static final RegistryObject<MenuType<JourneyLevelMenu>> JOURNEY_LEVEL = REGISTRY.register("journey_level", () -> IForgeMenuType.create(JourneyLevelMenu::new));
	public static final RegistryObject<MenuType<ExpertLevelMenu>> EXPERT_LEVEL = REGISTRY.register("expert_level", () -> IForgeMenuType.create(ExpertLevelMenu::new));

}
