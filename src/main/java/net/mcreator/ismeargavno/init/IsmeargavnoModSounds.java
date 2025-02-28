
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, IsmeargavnoMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> DANKYMERME = REGISTRY.register("dankymerme", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("ismeargavno", "dankymerme")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOMGETTHECAMERA = REGISTRY.register("momgetthecamera", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("ismeargavno", "momgetthecamera")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPONGEBOBSTANK = REGISTRY.register("spongebobstank", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("ismeargavno", "spongebobstank")));
}
