
package net.mcreator.ismeargavno.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiAnvilRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class IsmeargavnoModAnvilRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("ismeargavno:anvil_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiAnvilRecipe> anvilRecipes = new ArrayList<>();
		ItemStack rightItem = ItemStack.EMPTY;
		rightItem = new ItemStack(IsmeargavnoModItems.MOLTEN_IRON_CHUNK.get());
		rightItem.setCount(1);
		anvilRecipes.add(factory.createAnvilRecipe(new ItemStack(IsmeargavnoModItems.MOLTEN_IRON_CHUNK.get()), List.of(rightItem.copy()), List.of(new ItemStack(IsmeargavnoModItems.MOLTEN_SHEET.get()))));
		registration.addRecipes(RecipeTypes.ANVIL, anvilRecipes);
	}
}
