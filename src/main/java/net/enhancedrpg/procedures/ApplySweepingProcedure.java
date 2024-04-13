package net.enhancedrpg.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ApplySweepingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).enchant(Enchantments.SWEEPING_EDGE, 1);
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(-(5));
	}
}
