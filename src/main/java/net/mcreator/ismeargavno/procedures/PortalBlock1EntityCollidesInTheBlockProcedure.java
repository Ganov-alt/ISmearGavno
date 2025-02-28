package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock1EntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(IsmeargavnoModVariables.WorldVariables.get(world).Por2x, IsmeargavnoModVariables.WorldVariables.get(world).Por2y, IsmeargavnoModVariables.WorldVariables.get(world).Por2z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(IsmeargavnoModVariables.WorldVariables.get(world).Por2x, IsmeargavnoModVariables.WorldVariables.get(world).Por2y, IsmeargavnoModVariables.WorldVariables.get(world).Por2z, _ent.getYRot(),
						_ent.getXRot());
		}
	}
}
