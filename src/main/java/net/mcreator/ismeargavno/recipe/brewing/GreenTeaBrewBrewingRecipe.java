
package net.mcreator.ismeargavno.recipe.brewing;

@EventBusSubscriber
public class GreenTeaBrewBrewingRecipe implements IBrewingRecipe {

	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new GreenTeaBrewBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		Optional<Holder<Potion>> optionalPotion = input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).potion();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && optionalPotion.isPresent() && optionalPotion.get().is(Potions.WATER);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(IsmeargavnoModItems.GREEN_TEA_BAG.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(IsmeargavnoModItems.GREEN_TEA.get());
		}
		return ItemStack.EMPTY;
	}

}