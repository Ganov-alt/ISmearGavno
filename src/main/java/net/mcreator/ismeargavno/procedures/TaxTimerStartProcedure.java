package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class TaxTimerStartProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
			_vars.TaxTimer = 1200;
			_vars.syncPlayerVariables(entity);
		}
	}
}
