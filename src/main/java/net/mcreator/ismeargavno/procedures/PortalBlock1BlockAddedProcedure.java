package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PortalBlock1BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.UP) {
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetX = 0.5;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetY = 0.5;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.DOWN) {
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetX = 0.5;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetZ = 0.5;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				else if (_bs.hasProperty(BlockStateProperties.AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
				else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
					return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetX = 0.8;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
			IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetZ = 0.5;
			IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.end_portal_frame.fill")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		IsmeargavnoModVariables.WorldVariables.get(world).Por1x = x + IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetX;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por1y = y + IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetY;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
		IsmeargavnoModVariables.WorldVariables.get(world).Por1z = z + IsmeargavnoModVariables.WorldVariables.get(world).Portal1LocationOffsetZ;
		IsmeargavnoModVariables.WorldVariables.get(world).syncData(world);
	}
}
