package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ismeargavno.init.IsmeargavnoModMobEffects;

public class BionicToesBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(IsmeargavnoModMobEffects.BIONIC_TOES_ANTI_FALL, 2, 1, false, false));
	}
}
