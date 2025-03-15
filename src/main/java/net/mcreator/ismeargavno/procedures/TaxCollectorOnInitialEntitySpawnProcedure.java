package net.mcreator.ismeargavno.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class TaxCollectorOnInitialEntitySpawnProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RandoTaxNumber = 0;
		if (world.dayTime() == 6000) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = IsmeargavnoModEntities.TAX_COLLECTOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			RandoTaxNumber = Math.round(Mth.nextInt(RandomSource.create(), 1, 5));
			if (Math.round(RandoTaxNumber) == 1) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(IsmeargavnoModItems.GOLD_COIN.get()).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 64));
					_vars.syncPlayerVariables(entity);
				}
				SendTaxMessageProcedure.execute(world, entity);
			} else if (Math.round(RandoTaxNumber) == 2) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Items.DIAMOND).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 16));
					_vars.syncPlayerVariables(entity);
				}
				SendTaxMessageProcedure.execute(world, entity);
			} else if (Math.round(RandoTaxNumber) == 3) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Items.EMERALD).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 8));
					_vars.syncPlayerVariables(entity);
				}
				SendTaxMessageProcedure.execute(world, entity);
			} else if (Math.round(RandoTaxNumber) == 4) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Blocks.DIRT).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 32));
					_vars.syncPlayerVariables(entity);
				}
				SendTaxMessageProcedure.execute(world, entity);
			} else if (Math.round(RandoTaxNumber) == 5) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(IsmeargavnoModItems.DOWNVOTE.get()).copy();
					_vars.syncPlayerVariables(entity);
				}
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 3));
					_vars.syncPlayerVariables(entity);
				}
				SendTaxMessageProcedure.execute(world, entity);
			}
		}
	}
}
