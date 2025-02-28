
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ismeargavno.client.renderer.RedditorRenderer;
import net.mcreator.ismeargavno.client.renderer.JewligerRenderer;
import net.mcreator.ismeargavno.client.renderer.HomelessRenderer;
import net.mcreator.ismeargavno.client.renderer.BabyRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IsmeargavnoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(IsmeargavnoModEntities.JEWLIGER.get(), JewligerRenderer::new);
		event.registerEntityRenderer(IsmeargavnoModEntities.BABY.get(), BabyRenderer::new);
		event.registerEntityRenderer(IsmeargavnoModEntities.HOMELESS.get(), HomelessRenderer::new);
		event.registerEntityRenderer(IsmeargavnoModEntities.HOMELESS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IsmeargavnoModEntities.REDDITOR.get(), RedditorRenderer::new);
		event.registerEntityRenderer(IsmeargavnoModEntities.ILLUMINATI_BEAM.get(), ThrownItemRenderer::new);
	}
}
