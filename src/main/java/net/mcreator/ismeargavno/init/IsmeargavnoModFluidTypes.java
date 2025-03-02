
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.ismeargavno.fluid.types.PotatoWaterFluidType;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, IsmeargavnoMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> POTATO_WATER_TYPE = REGISTRY.register("potato_water", () -> new PotatoWaterFluidType());
}
