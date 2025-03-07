package net.mcreator.ismeargavno.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TaxTimerPlayerTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxTimer > 0 && entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).taxdue == true) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxTimer - 1;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Seconds Left : " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxTimer / 20)), true);
		} else if (entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxTimer == 0 && entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).taxdue == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 60, 4, false, false));
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
