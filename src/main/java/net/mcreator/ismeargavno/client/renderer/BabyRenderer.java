
package net.mcreator.ismeargavno.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.ismeargavno.entity.BabyEntity;

public class BabyRenderer extends HumanoidMobRenderer<BabyEntity, HumanoidModel<BabyEntity>> {
	public BabyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<BabyEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(BabyEntity entity) {
		return ResourceLocation.parse("ismeargavno:textures/entities/50b11a97b6d7ad82.png");
	}

	@Override
	protected boolean isShaking(BabyEntity entity) {
		return true;
	}
}
