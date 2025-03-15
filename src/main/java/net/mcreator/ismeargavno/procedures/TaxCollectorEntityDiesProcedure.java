package net.mcreator.ismeargavno.procedures;

import net.neoforged.bus.api.Event;

public class TaxCollectorEntityDiesProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			IsmeargavnoModVariables.PlayerVariables _vars = sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
			_vars.taxdue = false;
			_vars.syncPlayerVariables(sourceentity);
		}
		{
			IsmeargavnoModVariables.PlayerVariables _vars = sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
			_vars.TaxTimer = 0;
			_vars.syncPlayerVariables(sourceentity);
		}
		if (!entity.level().isClientSide())
			entity.discard();
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 12000, 2, false, false));
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 12000, 0, false, false));
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 20, 0, false, false));
	}
}
