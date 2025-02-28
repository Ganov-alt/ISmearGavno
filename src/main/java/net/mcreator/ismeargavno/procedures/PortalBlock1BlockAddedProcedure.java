package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock1BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		IsmeargavnoModVariables.WorldVariables.get(world).Por1x = x;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por1y = y;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por1z = z;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
