
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class IsmeargavnoModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == IsmeargavnoModVillagerProfessions.SAUSAGE_SELLER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(IsmeargavnoModItems.SUSPICIOUS_SAUSAGE_CASING.get(), 2), new ItemStack(IsmeargavnoModItems.GOLD_COIN.get(), 16), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(IsmeargavnoModItems.GOLD_COIN.get(), 48), new ItemStack(IsmeargavnoModItems.SLOP.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(IsmeargavnoModItems.SUSPICIOUS_SAUSAGE_CASING.get(), 6), new ItemStack(IsmeargavnoModItems.SLOP.get(), 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(IsmeargavnoModItems.SLOP.get(), 2), new ItemStack(IsmeargavnoModItems.GOLD_COIN.get(), 32), 10, 5, 0.05f));
		}
	}
}
