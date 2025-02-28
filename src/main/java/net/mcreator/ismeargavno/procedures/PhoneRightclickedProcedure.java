package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.world.inventory.DankGuiMenu;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class PhoneRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof DankGuiMenu) {
			if (entity.getPersistentData().getDouble("danked") == 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ismeargavno:dankymerme")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ismeargavno:dankymerme")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.getPersistentData().putDouble("danked", 1);
				IsmeargavnoMod.queueServerWork(3500, () -> {
					entity.getPersistentData().putDouble("danked", 0);
				});
			}
		}
	}
}
