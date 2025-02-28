
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.ismeargavno.block.PortalToBirthCanalBlock;
import net.mcreator.ismeargavno.block.PhoneScrollingRigBlock;
import net.mcreator.ismeargavno.block.HotDogRollerBlock;
import net.mcreator.ismeargavno.block.ForginatorBlock;
import net.mcreator.ismeargavno.block.EnhancedStorageUnitBlock;
import net.mcreator.ismeargavno.block.DeepDarkTerminalMainBlockBlock;
import net.mcreator.ismeargavno.block.DeepDarkStorageUnitBlock;
import net.mcreator.ismeargavno.block.CurdledMilkBlock;
import net.mcreator.ismeargavno.block.CrystalizedBloodBlock;
import net.mcreator.ismeargavno.block.CanalWallBlock;
import net.mcreator.ismeargavno.block.CalciumRecombobulationModuleBlock;
import net.mcreator.ismeargavno.block.BoneSpikeBlock;
import net.mcreator.ismeargavno.block.AginatorBlockBlock;
import net.mcreator.ismeargavno.block.AccelBioDomeBlockBlock;
import net.mcreator.ismeargavno.block.ATMBlock;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(IsmeargavnoMod.MODID);
	public static final DeferredBlock<Block> FORGINATOR = REGISTRY.register("forginator", ForginatorBlock::new);
	public static final DeferredBlock<Block> HOT_DOG_ROLLER = REGISTRY.register("hot_dog_roller", HotDogRollerBlock::new);
	public static final DeferredBlock<Block> DEEP_DARK_TERMINAL_MAIN_BLOCK = REGISTRY.register("deep_dark_terminal_main_block", DeepDarkTerminalMainBlockBlock::new);
	public static final DeferredBlock<Block> DEEP_DARK_STORAGE_UNIT = REGISTRY.register("deep_dark_storage_unit", DeepDarkStorageUnitBlock::new);
	public static final DeferredBlock<Block> PORTAL_TO_BIRTH_CANAL = REGISTRY.register("portal_to_birth_canal", PortalToBirthCanalBlock::new);
	public static final DeferredBlock<Block> CANAL_WALL = REGISTRY.register("canal_wall", CanalWallBlock::new);
	public static final DeferredBlock<Block> CRYSTALIZED_BLOOD = REGISTRY.register("crystalized_blood", CrystalizedBloodBlock::new);
	public static final DeferredBlock<Block> ENHANCED_STORAGE_UNIT = REGISTRY.register("enhanced_storage_unit", EnhancedStorageUnitBlock::new);
	public static final DeferredBlock<Block> CURDLED_MILK = REGISTRY.register("curdled_milk", CurdledMilkBlock::new);
	public static final DeferredBlock<Block> BONE_SPIKE = REGISTRY.register("bone_spike", BoneSpikeBlock::new);
	public static final DeferredBlock<Block> CALCIUM_RECOMBOBULATION_MODULE = REGISTRY.register("calcium_recombobulation_module", CalciumRecombobulationModuleBlock::new);
	public static final DeferredBlock<Block> AGINATOR_BLOCK = REGISTRY.register("aginator_block", AginatorBlockBlock::new);
	public static final DeferredBlock<Block> ACCEL_BIO_DOME_BLOCK = REGISTRY.register("accel_bio_dome_block", AccelBioDomeBlockBlock::new);
	public static final DeferredBlock<Block> ATM = REGISTRY.register("atm", ATMBlock::new);
	public static final DeferredBlock<Block> PHONE_SCROLLING_RIG = REGISTRY.register("phone_scrolling_rig", PhoneScrollingRigBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
