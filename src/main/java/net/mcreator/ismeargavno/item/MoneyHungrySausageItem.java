
package net.mcreator.ismeargavno.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.ismeargavno.procedures.MoneyHungrySausagePlayerFinishesUsingItemProcedure;

public class MoneyHungrySausageItem extends Item {
	public MoneyHungrySausageItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.5f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MoneyHungrySausagePlayerFinishesUsingItemProcedure.execute(world, x, y, z);
		return retval;
	}
}
