package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.init.IsmeargavnoModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CalciumRecombButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BONE_BLOCK.asItem()) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(0) > 1) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(2);
					_player.containerMenu.broadcastChanges();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(IsmeargavnoModItems.MYSTERIOUS_CRUST.get()));
					entityToSpawn.setPickUpDelay(15);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(IsmeargavnoModItems.MYSTERIOUS_CRUST.get()));
					entityToSpawn.setPickUpDelay(15);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(IsmeargavnoModItems.MYSTERIOUS_CRUST.get()));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.GOLD_INGOT));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.RAW_GOLD));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.RAW_GOLD_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.RAW_GOLD));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 24) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.DIAMOND_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.DIAMOND_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.DIAMOND_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.IRON_INGOT));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 128) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.NETHERITE_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 32) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.IRON_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.IRON_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.IRON_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.IRON_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Blocks.EMERALD_BLOCK));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + Mth.nextInt(RandomSource.create(), 2, 6)), z, new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(15);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
