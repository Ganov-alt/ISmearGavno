
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ismeargavno.item.inventory.PhoneInventoryCapability;
import net.mcreator.ismeargavno.item.VodkaItem;
import net.mcreator.ismeargavno.item.VeganSausageItem;
import net.mcreator.ismeargavno.item.UpvoteItem;
import net.mcreator.ismeargavno.item.UnrefinedWhippetItem;
import net.mcreator.ismeargavno.item.UnderGroundAmalgamItemItem;
import net.mcreator.ismeargavno.item.TimeFragmentItem;
import net.mcreator.ismeargavno.item.ThatBoofingtonItem;
import net.mcreator.ismeargavno.item.SuspiciousSausageCasingItem;
import net.mcreator.ismeargavno.item.StarGasWrapperItem;
import net.mcreator.ismeargavno.item.StarGasItem;
import net.mcreator.ismeargavno.item.SlopItem;
import net.mcreator.ismeargavno.item.SilverFishScalesItem;
import net.mcreator.ismeargavno.item.ScalpelItem;
import net.mcreator.ismeargavno.item.PyramidFragmentItem;
import net.mcreator.ismeargavno.item.ProtalgunItem;
import net.mcreator.ismeargavno.item.PotatoWaterItem;
import net.mcreator.ismeargavno.item.PingleCanItem;
import net.mcreator.ismeargavno.item.PhoneItem;
import net.mcreator.ismeargavno.item.PayotItem;
import net.mcreator.ismeargavno.item.OddSausageItem;
import net.mcreator.ismeargavno.item.MysteriousCrustItem;
import net.mcreator.ismeargavno.item.MountainDewItem;
import net.mcreator.ismeargavno.item.MoneyHungrySausageItem;
import net.mcreator.ismeargavno.item.MoltenSheetItem;
import net.mcreator.ismeargavno.item.MoltenIronChunkItem;
import net.mcreator.ismeargavno.item.MetalSheetItem;
import net.mcreator.ismeargavno.item.MalleableMilkCurdlesItem;
import net.mcreator.ismeargavno.item.LitBoofingtonItem;
import net.mcreator.ismeargavno.item.IlluminatiItem;
import net.mcreator.ismeargavno.item.GuildedSausageItem;
import net.mcreator.ismeargavno.item.GroundChorusItem;
import net.mcreator.ismeargavno.item.GrinderItem;
import net.mcreator.ismeargavno.item.GoldCoinItem;
import net.mcreator.ismeargavno.item.ForsakenHeartItem;
import net.mcreator.ismeargavno.item.FaecesItem;
import net.mcreator.ismeargavno.item.EyeScoopItem;
import net.mcreator.ismeargavno.item.EyeItem;
import net.mcreator.ismeargavno.item.DustItem;
import net.mcreator.ismeargavno.item.DownvoteItem;
import net.mcreator.ismeargavno.item.DeepDarkTechnicBoardItem;
import net.mcreator.ismeargavno.item.DeepDarkChipItem;
import net.mcreator.ismeargavno.item.CreditCardItem;
import net.mcreator.ismeargavno.item.ColouredWrapperItem;
import net.mcreator.ismeargavno.item.ChipItem;
import net.mcreator.ismeargavno.item.BritishChipItem;
import net.mcreator.ismeargavno.item.BloodCrystalItem;
import net.mcreator.ismeargavno.item.BlockHarvesterItem;
import net.mcreator.ismeargavno.item.BionicToesItem;
import net.mcreator.ismeargavno.item.BeatingHeartItem;
import net.mcreator.ismeargavno.IsmeargavnoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class IsmeargavnoModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(IsmeargavnoMod.MODID);
	public static final DeferredItem<Item> FORGINATOR = block(IsmeargavnoModBlocks.FORGINATOR);
	public static final DeferredItem<Item> MYSTERIOUS_CRUST = REGISTRY.register("mysterious_crust", MysteriousCrustItem::new);
	public static final DeferredItem<Item> SILVER_FISH_SCALES = REGISTRY.register("silver_fish_scales", SilverFishScalesItem::new);
	public static final DeferredItem<Item> UNDER_GROUND_AMALGAM_ITEM = REGISTRY.register("under_ground_amalgam_item", UnderGroundAmalgamItemItem::new);
	public static final DeferredItem<Item> DEEP_DARK_TECHNIC_BOARD = REGISTRY.register("deep_dark_technic_board", DeepDarkTechnicBoardItem::new);
	public static final DeferredItem<Item> HOT_DOG_ROLLER = block(IsmeargavnoModBlocks.HOT_DOG_ROLLER);
	public static final DeferredItem<Item> PAYOT = REGISTRY.register("payot", PayotItem::new);
	public static final DeferredItem<Item> GOLD_COIN = REGISTRY.register("gold_coin", GoldCoinItem::new);
	public static final DeferredItem<Item> JEWLIGER_SPAWN_EGG = REGISTRY.register("jewliger_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.JEWLIGER, -1735805, -13492963, new Item.Properties()));
	public static final DeferredItem<Item> SUSPICIOUS_SAUSAGE_CASING = REGISTRY.register("suspicious_sausage_casing", SuspiciousSausageCasingItem::new);
	public static final DeferredItem<Item> SLOP = REGISTRY.register("slop", SlopItem::new);
	public static final DeferredItem<Item> ODD_SAUSAGE = REGISTRY.register("odd_sausage", OddSausageItem::new);
	public static final DeferredItem<Item> VEGAN_SAUSAGE = REGISTRY.register("vegan_sausage", VeganSausageItem::new);
	public static final DeferredItem<Item> MONEY_HUNGRY_SAUSAGE = REGISTRY.register("money_hungry_sausage", MoneyHungrySausageItem::new);
	public static final DeferredItem<Item> GUILDED_SAUSAGE = REGISTRY.register("guilded_sausage", GuildedSausageItem::new);
	public static final DeferredItem<Item> MOLTEN_IRON_CHUNK = REGISTRY.register("molten_iron_chunk", MoltenIronChunkItem::new);
	public static final DeferredItem<Item> MOLTEN_SHEET = REGISTRY.register("molten_sheet", MoltenSheetItem::new);
	public static final DeferredItem<Item> METAL_SHEET = REGISTRY.register("metal_sheet", MetalSheetItem::new);
	public static final DeferredItem<Item> DEEP_DARK_TERMINAL_MAIN_BLOCK = block(IsmeargavnoModBlocks.DEEP_DARK_TERMINAL_MAIN_BLOCK);
	public static final DeferredItem<Item> DEEP_DARK_CHIP = REGISTRY.register("deep_dark_chip", DeepDarkChipItem::new);
	public static final DeferredItem<Item> DEEP_DARK_STORAGE_UNIT = block(IsmeargavnoModBlocks.DEEP_DARK_STORAGE_UNIT);
	public static final DeferredItem<Item> PORTAL_TO_BIRTH_CANAL = block(IsmeargavnoModBlocks.PORTAL_TO_BIRTH_CANAL);
	public static final DeferredItem<Item> CANAL_WALL = block(IsmeargavnoModBlocks.CANAL_WALL);
	public static final DeferredItem<Item> BLOOD_CRYSTAL = REGISTRY.register("blood_crystal", BloodCrystalItem::new);
	public static final DeferredItem<Item> CRYSTALIZED_BLOOD = block(IsmeargavnoModBlocks.CRYSTALIZED_BLOOD);
	public static final DeferredItem<Item> BABY_SPAWN_EGG = REGISTRY.register("baby_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.BABY, -65536, -1, new Item.Properties()));
	public static final DeferredItem<Item> FORSAKEN_HEART = REGISTRY.register("forsaken_heart", ForsakenHeartItem::new);
	public static final DeferredItem<Item> BEATING_HEART = REGISTRY.register("beating_heart", BeatingHeartItem::new);
	public static final DeferredItem<Item> ENHANCED_STORAGE_UNIT = block(IsmeargavnoModBlocks.ENHANCED_STORAGE_UNIT);
	public static final DeferredItem<Item> BIONIC_TOES_BOOTS = REGISTRY.register("bionic_toes_boots", BionicToesItem.Boots::new);
	public static final DeferredItem<Item> CURDLED_MILK = block(IsmeargavnoModBlocks.CURDLED_MILK);
	public static final DeferredItem<Item> BONE_SPIKE = doubleBlock(IsmeargavnoModBlocks.BONE_SPIKE);
	public static final DeferredItem<Item> CALCIUM_RECOMBOBULATION_MODULE = block(IsmeargavnoModBlocks.CALCIUM_RECOMBOBULATION_MODULE);
	public static final DeferredItem<Item> BLOCK_HARVESTER = REGISTRY.register("block_harvester", BlockHarvesterItem::new);
	public static final DeferredItem<Item> AGINATOR_BLOCK = block(IsmeargavnoModBlocks.AGINATOR_BLOCK);
	public static final DeferredItem<Item> DUST = REGISTRY.register("dust", DustItem::new);
	public static final DeferredItem<Item> MALLEABLE_MILK_CURDLES = REGISTRY.register("malleable_milk_curdles", MalleableMilkCurdlesItem::new);
	public static final DeferredItem<Item> ACCEL_BIO_DOME_BLOCK = block(IsmeargavnoModBlocks.ACCEL_BIO_DOME_BLOCK);
	public static final DeferredItem<Item> TIME_FRAGMENT = REGISTRY.register("time_fragment", TimeFragmentItem::new);
	public static final DeferredItem<Item> HOMELESS_SPAWN_EGG = REGISTRY.register("homeless_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.HOMELESS, -3355444, -1, new Item.Properties()));
	public static final DeferredItem<Item> FAECES = REGISTRY.register("faeces", FaecesItem::new);
	public static final DeferredItem<Item> UNREFINED_WHIPPET = REGISTRY.register("unrefined_whippet", UnrefinedWhippetItem::new);
	public static final DeferredItem<Item> COLOURED_WRAPPER = REGISTRY.register("coloured_wrapper", ColouredWrapperItem::new);
	public static final DeferredItem<Item> STAR_GAS_WRAPPER = REGISTRY.register("star_gas_wrapper", StarGasWrapperItem::new);
	public static final DeferredItem<Item> STAR_GAS = REGISTRY.register("star_gas", StarGasItem::new);
	public static final DeferredItem<Item> LIT_BOOFINGTON = REGISTRY.register("lit_boofington", LitBoofingtonItem::new);
	public static final DeferredItem<Item> THAT_BOOFINGTON = REGISTRY.register("that_boofington", ThatBoofingtonItem::new);
	public static final DeferredItem<Item> GRINDER = REGISTRY.register("grinder", GrinderItem::new);
	public static final DeferredItem<Item> GROUND_CHORUS = REGISTRY.register("ground_chorus", GroundChorusItem::new);
	public static final DeferredItem<Item> CREDIT_CARD = REGISTRY.register("credit_card", CreditCardItem::new);
	public static final DeferredItem<Item> ATM = block(IsmeargavnoModBlocks.ATM);
	public static final DeferredItem<Item> PHONE = REGISTRY.register("phone", PhoneItem::new);
	public static final DeferredItem<Item> MOUNTAIN_DEW = REGISTRY.register("mountain_dew", MountainDewItem::new);
	public static final DeferredItem<Item> UPVOTE = REGISTRY.register("upvote", UpvoteItem::new);
	public static final DeferredItem<Item> DOWNVOTE = REGISTRY.register("downvote", DownvoteItem::new);
	public static final DeferredItem<Item> PHONE_SCROLLING_RIG = block(IsmeargavnoModBlocks.PHONE_SCROLLING_RIG);
	public static final DeferredItem<Item> PYRAMID_FRAGMENT = REGISTRY.register("pyramid_fragment", PyramidFragmentItem::new);
	public static final DeferredItem<Item> REDDITOR_SPAWN_EGG = REGISTRY.register("redditor_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.REDDITOR, -52480, -16776961, new Item.Properties()));
	public static final DeferredItem<Item> EYE_SCOOP = REGISTRY.register("eye_scoop", EyeScoopItem::new);
	public static final DeferredItem<Item> EYE = REGISTRY.register("eye", EyeItem::new);
	public static final DeferredItem<Item> ILLUMINATI = REGISTRY.register("illuminati", IlluminatiItem::new);
	public static final DeferredItem<Item> PROTALGUN = REGISTRY.register("protalgun", ProtalgunItem::new);
	public static final DeferredItem<Item> PORTAL_BLOCK_1 = block(IsmeargavnoModBlocks.PORTAL_BLOCK_1);
	public static final DeferredItem<Item> PORTAL_BLOCK_2 = block(IsmeargavnoModBlocks.PORTAL_BLOCK_2);
	public static final DeferredItem<Item> GOPNIK_VAR_ONE_SPAWN_EGG = REGISTRY.register("gopnik_var_one_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.GOPNIK_VAR_ONE, -16777216, -1, new Item.Properties()));
	public static final DeferredItem<Item> GOPNIK_VAR_TWO_SPAWN_EGG = REGISTRY.register("gopnik_var_two_spawn_egg", () -> new DeferredSpawnEggItem(IsmeargavnoModEntities.GOPNIK_VAR_TWO, -1, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> VODKA = REGISTRY.register("vodka", VodkaItem::new);
	public static final DeferredItem<Item> DISTILLATION_CONTAINER = block(IsmeargavnoModBlocks.DISTILLATION_CONTAINER);
	public static final DeferredItem<Item> CHIP = REGISTRY.register("chip", ChipItem::new);
	public static final DeferredItem<Item> BRITISH_CHIP = REGISTRY.register("british_chip", BritishChipItem::new);
	public static final DeferredItem<Item> SCALPEL = REGISTRY.register("scalpel", ScalpelItem::new);
	public static final DeferredItem<Item> PINGLE_CAN = REGISTRY.register("pingle_can", PingleCanItem::new);
	public static final DeferredItem<Item> POTATO_WATER_BUCKET = REGISTRY.register("potato_water_bucket", PotatoWaterItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new PhoneInventoryCapability(stack), PHONE.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
