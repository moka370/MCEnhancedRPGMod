
package net.enhancedrpg;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.enhancedrpg.init.EnhancedrpgModTabs;
import net.enhancedrpg.init.EnhancedrpgModMenus;
import net.enhancedrpg.init.EnhancedrpgModItems;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

//Main mod class annotated with @Mod
@Mod("enhancedrpg")
public class EnhancedrpgMod {
	// Logger instance
	public static final Logger LOGGER = LogManager.getLogger(EnhancedrpgMod.class);
	// Mod ID
	public static final String MODID = "enhancedrpg";

	// Constructor for the mod class
	public EnhancedrpgMod() {
		// Register mod events with MinecraftForge
		MinecraftForge.EVENT_BUS.register(this);
		// Get the mod event bus
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register items, tabs, and menus with the event bus
		EnhancedrpgModItems.REGISTRY.register(bus);

		EnhancedrpgModTabs.REGISTRY.register(bus);

		EnhancedrpgModMenus.REGISTRY.register(bus);
	}

	// Protocol version for network communication
	private static final String PROTOCOL_VERSION = "1";
	// SimpleChannel for packet handling
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	// Unique message ID for each network message
	private static int messageID = 0;

	// Method to add a network message with encoder, decoder, and message consumer
	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	// Collection to store delayed server tasks
	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	// Method to queue server work with a specified tick delay
	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	// Event handler for server tick
	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
