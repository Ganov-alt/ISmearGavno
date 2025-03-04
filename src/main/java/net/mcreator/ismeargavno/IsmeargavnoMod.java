package net.mcreator.ismeargavno;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.util.Tuple;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;
import net.mcreator.ismeargavno.init.IsmeargavnoModVillagerProfessions;
import net.mcreator.ismeargavno.init.IsmeargavnoModTabs;
import net.mcreator.ismeargavno.init.IsmeargavnoModSounds;
import net.mcreator.ismeargavno.init.IsmeargavnoModMobEffects;
import net.mcreator.ismeargavno.init.IsmeargavnoModMenus;
import net.mcreator.ismeargavno.init.IsmeargavnoModItems;
import net.mcreator.ismeargavno.init.IsmeargavnoModFluids;
import net.mcreator.ismeargavno.init.IsmeargavnoModFluidTypes;
import net.mcreator.ismeargavno.init.IsmeargavnoModEntities;
import net.mcreator.ismeargavno.init.IsmeargavnoModBlocks;
import net.mcreator.ismeargavno.init.IsmeargavnoModBlockEntities;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

@Mod("ismeargavno")
public class IsmeargavnoMod {
	public static final Logger LOGGER = LogManager.getLogger(IsmeargavnoMod.class);
	public static final String MODID = "ismeargavno";

	public IsmeargavnoMod(IEventBus modEventBus) {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::registerNetworking);
		IsmeargavnoModSounds.REGISTRY.register(modEventBus);
		IsmeargavnoModBlocks.REGISTRY.register(modEventBus);
		IsmeargavnoModBlockEntities.REGISTRY.register(modEventBus);
		IsmeargavnoModItems.REGISTRY.register(modEventBus);
		IsmeargavnoModEntities.REGISTRY.register(modEventBus);
		IsmeargavnoModTabs.REGISTRY.register(modEventBus);
		IsmeargavnoModVariables.ATTACHMENT_TYPES.register(modEventBus);

		IsmeargavnoModMobEffects.REGISTRY.register(modEventBus);
		IsmeargavnoModMenus.REGISTRY.register(modEventBus);

		IsmeargavnoModVillagerProfessions.PROFESSIONS.register(modEventBus);
		IsmeargavnoModFluids.REGISTRY.register(modEventBus);
		IsmeargavnoModFluidTypes.REGISTRY.register(modEventBus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static boolean networkingRegistered = false;
	private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();

	private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
	}

	public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
		if (networkingRegistered)
			throw new IllegalStateException("Cannot register new network messages after networking has been registered");
		MESSAGES.put(id, new NetworkMessage<>(reader, handler));
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	private void registerNetworking(final RegisterPayloadHandlersEvent event) {
		final PayloadRegistrar registrar = event.registrar(MODID);
		MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
		networkingRegistered = true;
	}

	private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new Tuple<>(action, tick));
	}

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
		workQueue.forEach(work -> {
			work.setB(work.getB() - 1);
			if (work.getB() == 0)
				actions.add(work);
		});
		actions.forEach(e -> e.getA().run());
		workQueue.removeAll(actions);
	}
}
