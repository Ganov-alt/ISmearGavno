
package net.mcreator.ismeargavno.client.screens;

@EventBusSubscriber({Dist.CLIENT})
public class TaxRateOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		if (true) {

			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.ismeargavno.tax_rate.label_taxrate"), w / 2 + -189, h / 2 + -103, -1, false);

		}

	}

}
