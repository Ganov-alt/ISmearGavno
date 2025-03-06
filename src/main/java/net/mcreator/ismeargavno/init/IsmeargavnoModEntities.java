
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.entity.TaxCollectorEntity;
import net.mcreator.ismeargavno.entity.RedditorEntity;
import net.mcreator.ismeargavno.entity.JewligerEntity;
import net.mcreator.ismeargavno.entity.IlluminatiBeamEntity;
import net.mcreator.ismeargavno.entity.HomelessEntityProjectile;
import net.mcreator.ismeargavno.entity.HomelessEntity;
import net.mcreator.ismeargavno.entity.GopnikVarTwoEntity;
import net.mcreator.ismeargavno.entity.GopnikVarOneEntity;
import net.mcreator.ismeargavno.entity.BabyEntity;
import net.mcreator.ismeargavno.IsmeargavnoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class IsmeargavnoModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, IsmeargavnoMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<JewligerEntity>> JEWLIGER = register("jewliger",
			EntityType.Builder.<JewligerEntity>of(JewligerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));
	public static final DeferredHolder<EntityType<?>, EntityType<BabyEntity>> BABY = register("baby",
			EntityType.Builder.<BabyEntity>of(BabyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HomelessEntity>> HOMELESS = register("homeless",
			EntityType.Builder.<HomelessEntity>of(HomelessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HomelessEntityProjectile>> HOMELESS_PROJECTILE = register("projectile_homeless",
			EntityType.Builder.<HomelessEntityProjectile>of(HomelessEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<RedditorEntity>> REDDITOR = register("redditor",
			EntityType.Builder.<RedditorEntity>of(RedditorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IlluminatiBeamEntity>> ILLUMINATI_BEAM = register("illuminati_beam",
			EntityType.Builder.<IlluminatiBeamEntity>of(IlluminatiBeamEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GopnikVarOneEntity>> GOPNIK_VAR_ONE = register("gopnik_var_one",
			EntityType.Builder.<GopnikVarOneEntity>of(GopnikVarOneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GopnikVarTwoEntity>> GOPNIK_VAR_TWO = register("gopnik_var_two",
			EntityType.Builder.<GopnikVarTwoEntity>of(GopnikVarTwoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TaxCollectorEntity>> TAX_COLLECTOR = register("tax_collector",
			EntityType.Builder.<TaxCollectorEntity>of(TaxCollectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.95f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, HOMELESS.get(), (living, context) -> living.getCombinedInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, REDDITOR.get(), (living, context) -> living.getCombinedInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		JewligerEntity.init(event);
		BabyEntity.init(event);
		HomelessEntity.init(event);
		RedditorEntity.init(event);
		GopnikVarOneEntity.init(event);
		GopnikVarTwoEntity.init(event);
		TaxCollectorEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JEWLIGER.get(), JewligerEntity.createAttributes().build());
		event.put(BABY.get(), BabyEntity.createAttributes().build());
		event.put(HOMELESS.get(), HomelessEntity.createAttributes().build());
		event.put(REDDITOR.get(), RedditorEntity.createAttributes().build());
		event.put(GOPNIK_VAR_ONE.get(), GopnikVarOneEntity.createAttributes().build());
		event.put(GOPNIK_VAR_TWO.get(), GopnikVarTwoEntity.createAttributes().build());
		event.put(TAX_COLLECTOR.get(), TaxCollectorEntity.createAttributes().build());
	}
}
