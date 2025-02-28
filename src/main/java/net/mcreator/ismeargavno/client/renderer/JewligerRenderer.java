
package net.mcreator.ismeargavno.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.ismeargavno.entity.JewligerEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class JewligerRenderer extends MobRenderer<JewligerEntity, VillagerModel<JewligerEntity>> {
	public JewligerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel<JewligerEntity>(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(JewligerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(JewligerEntity entity) {
		return ResourceLocation.parse("ismeargavno:textures/entities/orthodox-jew-villager-on-planetminecraft-com.png");
	}
}
