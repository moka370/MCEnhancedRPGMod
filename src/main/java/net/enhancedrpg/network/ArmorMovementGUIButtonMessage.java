
package net.enhancedrpg.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.enhancedrpg.world.inventory.ArmorMovementGUIMenu;
import net.enhancedrpg.procedures.OpenSwiftSneakProcedure;
import net.enhancedrpg.procedures.OpenSoulSpeedProcedure;
import net.enhancedrpg.procedures.OpenFrostWalkProcedure;
import net.enhancedrpg.procedures.OpenFeatherFallProcedure;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArmorMovementGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ArmorMovementGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ArmorMovementGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ArmorMovementGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ArmorMovementGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ArmorMovementGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenSoulSpeedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenSwiftSneakProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenFeatherFallProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenFrostWalkProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EnhancedrpgMod.addNetworkMessage(ArmorMovementGUIButtonMessage.class, ArmorMovementGUIButtonMessage::buffer, ArmorMovementGUIButtonMessage::new, ArmorMovementGUIButtonMessage::handler);
	}
}
