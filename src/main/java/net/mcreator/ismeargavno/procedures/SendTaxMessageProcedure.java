package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class SendTaxMessageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
			_vars.TaxTimer = 1200;
			_vars.syncPlayerVariables(entity);
		}
		{
			IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
			_vars.taxdue = true;
			_vars.syncPlayerVariables(entity);
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
					("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds remaining...")),
					false);
	}
}
