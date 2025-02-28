
package net.mcreator.ismeargavno.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class BeatingHeartItem extends Item {
	public BeatingHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}
}
