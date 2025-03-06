package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;
import net.mcreator.ismeargavno.init.IsmeargavnoModItems;
import net.mcreator.ismeargavno.init.IsmeargavnoModEntities;

public class TaxCollecterProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime() == 12000) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = IsmeargavnoModEntities.TAX_COLLECTOR.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			entity.getPersistentData().putDouble("TaxRando", (Mth.nextInt(RandomSource.create(), 1, 6)));
			if (entity.getPersistentData().getDouble("TaxRando") == 1) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(IsmeargavnoModItems.GOLD_COIN.get()).copy();
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getPersistentData().getDouble("TaxRando") == 2) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Items.DIAMOND).copy();
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getPersistentData().getDouble("TaxRando") == 3) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Items.IRON_INGOT).copy();
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getPersistentData().getDouble("TaxRando") == 4) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Items.EMERALD).copy();
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getPersistentData().getDouble("TaxRando") == 5) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Blocks.POLISHED_DIORITE).copy();
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getPersistentData().getDouble("TaxRando") == 6) {
				{
					IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
					_vars.TAXCOLLECTORITEM = new ItemStack(Blocks.DIRT).copy();
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
