
package net.enhancedrpg.item.inventory;

import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.enhancedrpg.init.EnhancedrpgModItems;
import net.enhancedrpg.client.gui.BackpackGUIScreen;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

//Mod.EventBusSubscriber annotation indicates that this class subscribes to events on the Mod Event Bus
@Mod.EventBusSubscriber(Dist.CLIENT)
public class BackpackInventoryCapability implements ICapabilitySerializable<CompoundTag> {
    // SubscribeEvent annotation indicates that the method will be called when the specified event occurs
	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onItemDropped(ItemTossEvent event) {
        // check if the tossed item is a Backpack
		if (event.getEntity().getItem().getItem() == EnhancedrpgModItems.BACKPACK.get()) {
            // close the container if the player has the Backpack GUI open
			if (Minecraft.getInstance().screen instanceof BackpackGUIScreen) {
				Minecraft.getInstance().player.closeContainer();
			}
		}
	}

    // LazyOptional to handle the capability
	private final LazyOptional<ItemStackHandler> inventory = LazyOptional.of(this::createItemHandler);

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		return capability == ForgeCapabilities.ITEM_HANDLER ? this.inventory.cast() : LazyOptional.empty();
	}

	@Override
	public CompoundTag serializeNBT() {
		return getItemHandler().serializeNBT();
	}

	@Override
	public void deserializeNBT(CompoundTag nbt) {
		getItemHandler().deserializeNBT(nbt);
	}

    // method to create the ItemStackHandler for the Backpack Inventory
	private ItemStackHandler createItemHandler() {
		return new ItemStackHandler(18) {
			@Override
			public int getSlotLimit(int slot) {
				return 64;
			}

			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                // prevent putting Backpacks inside the Backpack Inventory
				return stack.getItem() != EnhancedrpgModItems.BACKPACK.get();
			}

			@Override
			public void setSize(int size) {
                // Override method to control the size of the inventory
			}
		};
	}

    // method to get the ItemStackHandler from the LazyOptional
	private ItemStackHandler getItemHandler() {
		return inventory.orElseThrow(RuntimeException::new);
	}
}
