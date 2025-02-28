
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.potion.BionicToesAntiFallMobEffect;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, IsmeargavnoMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> BIONIC_TOES_ANTI_FALL = REGISTRY.register("bionic_toes_anti_fall", () -> new BionicToesAntiFallMobEffect());
}
