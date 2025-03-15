package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class VodkaPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1200, 1, false, false));
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.HARM) || entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.LEVITATION)
				|| entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.BLINDNESS) || entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.DIG_SLOWDOWN)
				|| entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.OOZING) || entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.POISON)
				|| entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.RAID_OMEN) || entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
				|| entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.BAD_OMEN) || entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(MobEffects.DARKNESS)
				|| entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(MobEffects.HUNGER) || entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.INFESTED)
				|| entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(MobEffects.WITHER) || entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(MobEffects.WEAVING)
				|| entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(MobEffects.UNLUCK) || entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(MobEffects.WEAKNESS)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DARKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAVING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INFESTED);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HARM);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.LEVITATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.OOZING);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.RAID_OMEN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.TRIAL_OMEN);
		}
	}
}
