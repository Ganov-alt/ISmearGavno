
package net.mcreator.ismeargavno.item;

public class GreenTeaBagItem extends Item {
	public GreenTeaBagItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}
}