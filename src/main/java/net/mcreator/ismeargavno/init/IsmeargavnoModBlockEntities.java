
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.ismeargavno.block.entity.PhoneScrollingRigBlockEntity;
import net.mcreator.ismeargavno.block.entity.HotDogRollerBlockEntity;
import net.mcreator.ismeargavno.block.entity.ForginatorBlockEntity;
import net.mcreator.ismeargavno.block.entity.EnhancedStorageUnitBlockEntity;
import net.mcreator.ismeargavno.block.entity.DeepDarkTerminalMainBlockBlockEntity;
import net.mcreator.ismeargavno.block.entity.DeepDarkStorageUnitBlockEntity;
import net.mcreator.ismeargavno.block.entity.CalciumRecombobulationModuleBlockEntity;
import net.mcreator.ismeargavno.block.entity.AginatorBlockBlockEntity;
import net.mcreator.ismeargavno.block.entity.ATMBlockEntity;
import net.mcreator.ismeargavno.IsmeargavnoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class IsmeargavnoModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, IsmeargavnoMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FORGINATOR = register("forginator", IsmeargavnoModBlocks.FORGINATOR, ForginatorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> HOT_DOG_ROLLER = register("hot_dog_roller", IsmeargavnoModBlocks.HOT_DOG_ROLLER, HotDogRollerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> DEEP_DARK_TERMINAL_MAIN_BLOCK = register("deep_dark_terminal_main_block", IsmeargavnoModBlocks.DEEP_DARK_TERMINAL_MAIN_BLOCK, DeepDarkTerminalMainBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> DEEP_DARK_STORAGE_UNIT = register("deep_dark_storage_unit", IsmeargavnoModBlocks.DEEP_DARK_STORAGE_UNIT, DeepDarkStorageUnitBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ENHANCED_STORAGE_UNIT = register("enhanced_storage_unit", IsmeargavnoModBlocks.ENHANCED_STORAGE_UNIT, EnhancedStorageUnitBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CALCIUM_RECOMBOBULATION_MODULE = register("calcium_recombobulation_module", IsmeargavnoModBlocks.CALCIUM_RECOMBOBULATION_MODULE,
			CalciumRecombobulationModuleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> AGINATOR_BLOCK = register("aginator_block", IsmeargavnoModBlocks.AGINATOR_BLOCK, AginatorBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ATM = register("atm", IsmeargavnoModBlocks.ATM, ATMBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PHONE_SCROLLING_RIG = register("phone_scrolling_rig", IsmeargavnoModBlocks.PHONE_SCROLLING_RIG, PhoneScrollingRigBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FORGINATOR.get(), (blockEntity, side) -> ((ForginatorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HOT_DOG_ROLLER.get(), (blockEntity, side) -> ((HotDogRollerBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DEEP_DARK_TERMINAL_MAIN_BLOCK.get(), (blockEntity, side) -> ((DeepDarkTerminalMainBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DEEP_DARK_STORAGE_UNIT.get(), (blockEntity, side) -> ((DeepDarkStorageUnitBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENHANCED_STORAGE_UNIT.get(), (blockEntity, side) -> ((EnhancedStorageUnitBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CALCIUM_RECOMBOBULATION_MODULE.get(), (blockEntity, side) -> ((CalciumRecombobulationModuleBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, AGINATOR_BLOCK.get(), (blockEntity, side) -> ((AginatorBlockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ATM.get(), (blockEntity, side) -> ((ATMBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PHONE_SCROLLING_RIG.get(), (blockEntity, side) -> ((PhoneScrollingRigBlockEntity) blockEntity).getItemHandler());
	}
}
