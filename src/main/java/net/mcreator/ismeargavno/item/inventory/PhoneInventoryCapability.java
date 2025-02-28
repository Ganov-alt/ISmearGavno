package net.mcreator.ismeargavno.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.Minecraft;

import net.mcreator.ismeargavno.init.IsmeargavnoModItems;
import net.mcreator.ismeargavno.client.gui.DankGuiScreen;

import javax.annotation.Nonnull;

@EventBusSubscriber(Dist.CLIENT)
public class PhoneInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == IsmeargavnoModItems.PHONE.get()) {
			if (Minecraft.getInstance().screen instanceof DankGuiScreen) {
				Minecraft.getInstance().player.closeContainer();
			}
		}
	}

	public PhoneInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 0);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != IsmeargavnoModItems.PHONE.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}
