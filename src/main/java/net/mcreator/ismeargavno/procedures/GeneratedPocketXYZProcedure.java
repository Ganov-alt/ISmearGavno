package net.mcreator.ismeargavno.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GeneratedPocketXYZProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Generated_pocket_xyz) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.Pocketx = Mth.nextInt(RandomSource.create(), -10000, 10000);
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.Pocketx = Mth.nextInt(RandomSource.create(), -64, 64);
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.Pocketx = Mth.nextInt(RandomSource.create(), -10000, 10000);
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.Generated_pocket_xyz = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
