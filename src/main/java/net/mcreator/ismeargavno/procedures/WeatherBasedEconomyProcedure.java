package net.mcreator.ismeargavno.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerWakeUpEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WeatherBasedEconomyProcedure {
	@SubscribeEvent
	public static void onEntityEndSleep(PlayerWakeUpEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double GlobalTaxRate = 0;
		if (world.getLevelData().isRaining()) {
			if (GlobalTaxRate >= 1) {
				GlobalTaxRate = GlobalTaxRate - 1;
			}
		}
	}
}
