package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IlluminatiBeamProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BARRIER)) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
			IsmeargavnoMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		}
	}
}
