
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.ismeargavno.fluid.PotatoWaterFluid;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, IsmeargavnoMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> POTATO_WATER = REGISTRY.register("potato_water", () -> new PotatoWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_POTATO_WATER = REGISTRY.register("flowing_potato_water", () -> new PotatoWaterFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(POTATO_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POTATO_WATER.get(), RenderType.translucent());
		}
	}
}
