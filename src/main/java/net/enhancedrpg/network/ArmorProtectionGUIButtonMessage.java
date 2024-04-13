
package net.enhancedrpg.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.enhancedrpg.world.inventory.ArmorProtectionGUIMenu;
import net.enhancedrpg.procedures.OpenThornsProcedure;
import net.enhancedrpg.procedures.OpenProtectionProcedure;
import net.enhancedrpg.procedures.OpenProjectProcProcedure;
import net.enhancedrpg.procedures.OpenFireProcProcedure;
import net.enhancedrpg.procedures.OpenBlastProcProcedure;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArmorProtectionGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ArmorProtectionGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ArmorProtectionGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ArmorProtectionGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ArmorProtectionGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ArmorProtectionGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenProjectProcProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenBlastProcProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenFireProcProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenProtectionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenThornsProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EnhancedrpgMod.addNetworkMessage(ArmorProtectionGUIButtonMessage.class, ArmorProtectionGUIButtonMessage::buffer, ArmorProtectionGUIButtonMessage::new, ArmorProtectionGUIButtonMessage::handler);
	}
}
