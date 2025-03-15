
package net.mcreator.ismeargavno.item;

public class BlackTeaBagItem extends Item {
	public BlackTeaBagItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}
}