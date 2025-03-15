package net.mcreator.ismeargavno.procedures;

import net.neoforged.bus.api.Event;

public class TaxCollectorRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM) : false) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded, _player.inventoryMenu.getCraftSlots());
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Tax Colletor: You get to live, for now..."), false);
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
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 10, 3, 3, 3, 0.5);
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(
								("Tax Collector: I asked for " + sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + sourceentity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + "...")),
								false);
		}
	}
}
