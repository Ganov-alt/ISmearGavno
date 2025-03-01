
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.IsmeargavnoMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class IsmeargavnoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IsmeargavnoMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> I_SMEAR_GAVNO = REGISTRY.register("i_smear_gavno",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ismeargavno.i_smear_gavno")).icon(() -> new ItemStack(IsmeargavnoModBlocks.FORGINATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(IsmeargavnoModBlocks.FORGINATOR.get().asItem());
				tabData.accept(IsmeargavnoModItems.MYSTERIOUS_CRUST.get());
				tabData.accept(IsmeargavnoModItems.SILVER_FISH_SCALES.get());
				tabData.accept(IsmeargavnoModItems.UNDER_GROUND_AMALGAM_ITEM.get());
				tabData.accept(IsmeargavnoModItems.DEEP_DARK_TECHNIC_BOARD.get());
				tabData.accept(IsmeargavnoModBlocks.HOT_DOG_ROLLER.get().asItem());
				tabData.accept(IsmeargavnoModItems.PAYOT.get());
				tabData.accept(IsmeargavnoModItems.GOLD_COIN.get());
				tabData.accept(IsmeargavnoModItems.SUSPICIOUS_SAUSAGE_CASING.get());
				tabData.accept(IsmeargavnoModItems.SLOP.get());
				tabData.accept(IsmeargavnoModItems.ODD_SAUSAGE.get());
				tabData.accept(IsmeargavnoModItems.VEGAN_SAUSAGE.get());
				tabData.accept(IsmeargavnoModItems.MONEY_HUNGRY_SAUSAGE.get());
				tabData.accept(IsmeargavnoModItems.GUILDED_SAUSAGE.get());
				tabData.accept(IsmeargavnoModItems.MOLTEN_IRON_CHUNK.get());
				tabData.accept(IsmeargavnoModItems.MOLTEN_SHEET.get());
				tabData.accept(IsmeargavnoModItems.METAL_SHEET.get());
				tabData.accept(IsmeargavnoModBlocks.DEEP_DARK_TERMINAL_MAIN_BLOCK.get().asItem());
				tabData.accept(IsmeargavnoModItems.DEEP_DARK_CHIP.get());
				tabData.accept(IsmeargavnoModBlocks.DEEP_DARK_STORAGE_UNIT.get().asItem());
				tabData.accept(IsmeargavnoModBlocks.PORTAL_TO_BIRTH_CANAL.get().asItem());
				tabData.accept(IsmeargavnoModBlocks.CANAL_WALL.get().asItem());
				tabData.accept(IsmeargavnoModItems.BLOOD_CRYSTAL.get());
				tabData.accept(IsmeargavnoModBlocks.CRYSTALIZED_BLOOD.get().asItem());
				tabData.accept(IsmeargavnoModItems.BABY_SPAWN_EGG.get());
				tabData.accept(IsmeargavnoModItems.FORSAKEN_HEART.get());
				tabData.accept(IsmeargavnoModItems.BEATING_HEART.get());
				tabData.accept(IsmeargavnoModBlocks.ENHANCED_STORAGE_UNIT.get().asItem());
				tabData.accept(IsmeargavnoModItems.BIONIC_TOES_BOOTS.get());
				tabData.accept(IsmeargavnoModBlocks.CURDLED_MILK.get().asItem());
				tabData.accept(IsmeargavnoModBlocks.BONE_SPIKE.get().asItem());
				tabData.accept(IsmeargavnoModBlocks.CALCIUM_RECOMBOBULATION_MODULE.get().asItem());
				tabData.accept(IsmeargavnoModItems.BLOCK_HARVESTER.get());
				tabData.accept(IsmeargavnoModBlocks.AGINATOR_BLOCK.get().asItem());
				tabData.accept(IsmeargavnoModItems.DUST.get());
				tabData.accept(IsmeargavnoModItems.MALLEABLE_MILK_CURDLES.get());
				tabData.accept(IsmeargavnoModBlocks.ACCEL_BIO_DOME_BLOCK.get().asItem());
				tabData.accept(IsmeargavnoModItems.TIME_FRAGMENT.get());
				tabData.accept(IsmeargavnoModItems.HOMELESS_SPAWN_EGG.get());
				tabData.accept(IsmeargavnoModItems.FAECES.get());
				tabData.accept(IsmeargavnoModItems.UNREFINED_WHIPPET.get());
				tabData.accept(IsmeargavnoModItems.COLOURED_WRAPPER.get());
				tabData.accept(IsmeargavnoModItems.STAR_GAS_WRAPPER.get());
				tabData.accept(IsmeargavnoModItems.STAR_GAS.get());
				tabData.accept(IsmeargavnoModItems.LIT_BOOFINGTON.get());
				tabData.accept(IsmeargavnoModItems.THAT_BOOFINGTON.get());
				tabData.accept(IsmeargavnoModItems.GRINDER.get());
				tabData.accept(IsmeargavnoModItems.CREDIT_CARD.get());
				tabData.accept(IsmeargavnoModBlocks.ATM.get().asItem());
				tabData.accept(IsmeargavnoModItems.PHONE.get());
				tabData.accept(IsmeargavnoModItems.MOUNTAIN_DEW.get());
				tabData.accept(IsmeargavnoModItems.UPVOTE.get());
				tabData.accept(IsmeargavnoModItems.DOWNVOTE.get());
				tabData.accept(IsmeargavnoModBlocks.PHONE_SCROLLING_RIG.get().asItem());
				tabData.accept(IsmeargavnoModItems.PYRAMID_FRAGMENT.get());
				tabData.accept(IsmeargavnoModItems.REDDITOR_SPAWN_EGG.get());
				tabData.accept(IsmeargavnoModItems.EYE_SCOOP.get());
				tabData.accept(IsmeargavnoModItems.EYE.get());
				tabData.accept(IsmeargavnoModItems.ILLUMINATI.get());
				tabData.accept(IsmeargavnoModItems.PROTALGUN.get());
				tabData.accept(IsmeargavnoModBlocks.PORTAL_BLOCK_1.get().asItem());
				tabData.accept(IsmeargavnoModBlocks.PORTAL_BLOCK_2.get().asItem());
				tabData.accept(IsmeargavnoModItems.PINGLE_CAN.get());
				tabData.accept(IsmeargavnoModItems.CHIP.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(IsmeargavnoModItems.JEWLIGER_SPAWN_EGG.get());
			tabData.accept(IsmeargavnoModItems.BABY_SPAWN_EGG.get());
			tabData.accept(IsmeargavnoModItems.HOMELESS_SPAWN_EGG.get());
			tabData.accept(IsmeargavnoModItems.REDDITOR_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(IsmeargavnoModItems.BIONIC_TOES_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(IsmeargavnoModBlocks.CURDLED_MILK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(IsmeargavnoModBlocks.BONE_SPIKE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(IsmeargavnoModItems.BLOCK_HARVESTER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(IsmeargavnoModItems.PROTALGUN.get());
			tabData.accept(IsmeargavnoModBlocks.PORTAL_BLOCK_1.get().asItem());
			tabData.accept(IsmeargavnoModBlocks.PORTAL_BLOCK_2.get().asItem());
		}
	}
}
