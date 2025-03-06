
package net.mcreator.ismeargavno.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.ismeargavno.entity.TaxCollectorEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TaxCollectorRenderer extends MobRenderer<TaxCollectorEntity, VillagerModel<TaxCollectorEntity>> {
	public TaxCollectorRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<TaxCollectorEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(TaxCollectorEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(TaxCollectorEntity entity) {
		return ResourceLocation.parse("ismeargavno:textures/entities/villager-planetminecraft-com-13395829.png");
	}
}
