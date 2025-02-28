
package net.mcreator.ismeargavno.anvilrecipes;

import net.neoforged.neoforge.event.AnvilUpdateEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.ismeargavno.init.IsmeargavnoModItems;

@EventBusSubscriber
public class MoltenChunkToSheetAnvilRecipe {
	@SubscribeEvent
	public static void execute(AnvilUpdateEvent event) {
		if ((event.getLeft().getItem() == IsmeargavnoModItems.MOLTEN_IRON_CHUNK.get()) && (event.getRight().getItem() == IsmeargavnoModItems.MOLTEN_IRON_CHUNK.get())) {
			if ((event.getLeft().getCount() == 1) && (event.getRight().getCount() >= 1)) {
				event.setMaterialCost(1);
				event.setCost(1);
				event.setOutput(new ItemStack(IsmeargavnoModItems.MOLTEN_SHEET.get()));
			}
		}
	}
}
