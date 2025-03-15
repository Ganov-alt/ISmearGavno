
package net.mcreator.ismeargavno.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class IsmeargavnoModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("ismeargavno:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.SUSPICIOUS_SAUSAGE_CASING.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.sausage_casing_tooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.PAYOT.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.payot_tooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.GUILDED_SAUSAGE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.guildedsausagetooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.ODD_SAUSAGE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.oddsausagetooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.MONEY_HUNGRY_SAUSAGE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.money_hungrty_sausagetooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.VEGAN_SAUSAGE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.vegan_sausagetooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.SILVER_FISH_SCALES.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.silverfishscaletooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.MYSTERIOUS_CRUST.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.mysterious_crust_tooltip"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.BLOCK_HARVESTER.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.block_harvester_info"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModBlocks.CALCIUM_RECOMBOBULATION_MODULE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.calcium_recomb_info"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.FORSAKEN_HEART.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.forsaken_heart_info"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModBlocks.PORTAL_TO_BIRTH_CANAL.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.birth_canal_portal"));
		registration.addIngredientInfo(List.of(new ItemStack(IsmeargavnoModItems.PORCELAIN_SHARD.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ismeargavno.porcelain_make"));
	}
}
