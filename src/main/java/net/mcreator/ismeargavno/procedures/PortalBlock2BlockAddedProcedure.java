package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock2BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		IsmeargavnoModVariables.WorldVariables.get(world).Por2x = x + 0;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por2y = y + 0;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por2z = z + 0;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
	}
}
