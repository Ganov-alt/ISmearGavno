package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.init.IsmeargavnoModItems;
import net.mcreator.ismeargavno.init.IsmeargavnoModBlocks;

public class DeepDarkChipRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String coordinates = "";
		double X = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IsmeargavnoModBlocks.DEEP_DARK_STORAGE_UNIT.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IsmeargavnoModItems.DEEP_DARK_CHIP.get()) {
				if (entity.isShiftKeyDown()) {
					{
						final String _tagName = "xcoord";
						final double _tagValue = x;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "ycoord";
						final double _tagValue = y;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "zcoord";
						final double _tagValue = z;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("x= " + x + " y= " + y + " z= " + z)));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IsmeargavnoModBlocks.ENHANCED_STORAGE_UNIT.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IsmeargavnoModItems.DEEP_DARK_CHIP.get()) {
				if (entity.isShiftKeyDown()) {
					{
						final String _tagName = "xcoord";
						final double _tagValue = x;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "ycoord";
						final double _tagValue = y;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "zcoord";
						final double _tagValue = z;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
					itemstack.set(DataComponents.CUSTOM_NAME, Component.literal(("x= " + x + " y= " + y + " z= " + z)));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.shear")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.beehive.shear")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
