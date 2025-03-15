
package net.mcreator.ismeargavno.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ismeargavno.init.IsmeargavnoModFluids;

public class PotatoWaterItem extends BucketItem {
	public PotatoWaterItem() {
		super(IsmeargavnoModFluids.POTATO_WATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
