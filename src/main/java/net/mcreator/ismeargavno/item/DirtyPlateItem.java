
package net.mcreator.ismeargavno.item;

public class DirtyPlateItem extends Item {
	public DirtyPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DirtyPlateRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}