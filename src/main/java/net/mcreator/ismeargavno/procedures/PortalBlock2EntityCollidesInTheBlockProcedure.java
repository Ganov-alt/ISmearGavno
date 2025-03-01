package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock2EntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo((IsmeargavnoModVariables.WorldVariables.get(world).Por1x + entity.getDeltaMovement().x() * 2), (IsmeargavnoModVariables.WorldVariables.get(world).Por1y + entity.getDeltaMovement().y() * 2),
					(IsmeargavnoModVariables.WorldVariables.get(world).Por1z + entity.getDeltaMovement().z() * 2));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((IsmeargavnoModVariables.WorldVariables.get(world).Por1x + entity.getDeltaMovement().x() * 2), (IsmeargavnoModVariables.WorldVariables.get(world).Por1y + entity.getDeltaMovement().y() * 2),
						(IsmeargavnoModVariables.WorldVariables.get(world).Por1z + entity.getDeltaMovement().z() * 2), _ent.getYRot(), _ent.getXRot());
		}
	}
}
