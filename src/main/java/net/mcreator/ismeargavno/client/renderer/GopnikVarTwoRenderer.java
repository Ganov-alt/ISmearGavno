
package net.mcreator.ismeargavno.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.ismeargavno.entity.GopnikVarTwoEntity;

public class GopnikVarTwoRenderer extends HumanoidMobRenderer<GopnikVarTwoEntity, HumanoidModel<GopnikVarTwoEntity>> {
	public GopnikVarTwoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<GopnikVarTwoEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GopnikVarTwoEntity entity) {
		return ResourceLocation.parse("ismeargavno:textures/entities/heres-boris-18551873.png");
	}
}
