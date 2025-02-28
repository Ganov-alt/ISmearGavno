package net.mcreator.ismeargavno.procedures;

import net.neoforged.neoforge.event.entity.EntityTravelToDimensionEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.IsmeargavnoMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HealAndLuckProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		IsmeargavnoMod.queueServerWork(20, () -> {
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("ismeargavno:pocket_dimension"))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 99999, 3, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 1, false, false));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LUCK);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.REGENERATION);
			}
		});
	}
}
