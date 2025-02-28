
package net.mcreator.ismeargavno.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.ismeargavno.procedures.EyeScoopLivingEntityIsHitWithItemProcedure;

public class EyeScoopItem extends Item {
	public EyeScoopItem() {
		super(new Item.Properties().durability(3).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return -1;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EyeScoopLivingEntityIsHitWithItemProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), itemstack);
		return retval;
	}
}
