package net.mcreator.ismeargavno.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class SpawnTaxManProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
