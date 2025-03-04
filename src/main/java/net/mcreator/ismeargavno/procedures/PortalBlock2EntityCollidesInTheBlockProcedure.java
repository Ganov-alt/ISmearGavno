package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock2EntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal == 0) {
			{
				Entity _ent = entity;
				_ent.teleportTo(IsmeargavnoModVariables.WorldVariables.get(world).Por1x, IsmeargavnoModVariables.WorldVariables.get(world).Por1y, IsmeargavnoModVariables.WorldVariables.get(world).Por1z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(IsmeargavnoModVariables.WorldVariables.get(world).Por1x, IsmeargavnoModVariables.WorldVariables.get(world).Por1y, IsmeargavnoModVariables.WorldVariables.get(world).Por1z, _ent.getYRot(),
							_ent.getXRot());
			}
			IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 1;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		} else {
			while (IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal != 0) {
				if (entity.getX() > x + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetX + 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
				if (entity.getX() < x + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetX - 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
				if (entity.getY() > y + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetY + 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
				if (entity.getY() < y + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetY - 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
				if (entity.getY() > z + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetZ + 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
				if (entity.getY() < z + IsmeargavnoModVariables.WorldVariables.get(world).Portal2LocationOffsetZ - 0.5) {
					IsmeargavnoModVariables.WorldVariables.get(world).JustEnteredPortal = 0;
					IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
				} else {
					break;
				}
			}
		}
	}
}
