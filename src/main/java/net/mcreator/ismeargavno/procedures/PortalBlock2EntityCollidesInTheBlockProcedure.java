package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock2EntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(IsmeargavnoModVariables.WorldVariables.get(world).Por1x, IsmeargavnoModVariables.WorldVariables.get(world).Por1y, IsmeargavnoModVariables.WorldVariables.get(world).Por1z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(IsmeargavnoModVariables.WorldVariables.get(world).Por1x, IsmeargavnoModVariables.WorldVariables.get(world).Por1y, IsmeargavnoModVariables.WorldVariables.get(world).Por1z, _ent.getYRot(),
						_ent.getXRot());
		}
	}
}
