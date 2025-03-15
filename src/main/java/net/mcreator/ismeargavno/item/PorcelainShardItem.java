
package net.mcreator.ismeargavno.item;

public class PorcelainShardItem extends Item {
	public PorcelainShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}
}