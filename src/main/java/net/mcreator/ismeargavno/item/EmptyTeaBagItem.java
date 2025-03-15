
package net.mcreator.ismeargavno.item;

public class EmptyTeaBagItem extends Item {
	public EmptyTeaBagItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}
}