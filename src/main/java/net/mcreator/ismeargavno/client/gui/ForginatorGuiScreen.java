package net.mcreator.ismeargavno.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ismeargavno.world.inventory.ForginatorGuiMenu;
import net.mcreator.ismeargavno.network.ForginatorGuiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ForginatorGuiScreen extends AbstractContainerScreen<ForginatorGuiMenu> {
	private final static HashMap<String, Object> guistate = ForginatorGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_smelt;

	public ForginatorGuiScreen(ForginatorGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ismeargavno:textures/screens/forginator_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 12 && mouseX < leftPos + 36 && mouseY > topPos + 48 && mouseY < topPos + 72)
			guiGraphics.renderTooltip(font, Component.translatable("gui.ismeargavno.forginator_gui.tooltip_logs"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("ismeargavno:textures/screens/loggui.png"), this.leftPos + 16, this.topPos + 55, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("ismeargavno:textures/screens/splitarrowgraphic.png"), this.leftPos + 35, this.topPos + 19, 0, 0, 64, 64, 64, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ismeargavno.forginator_gui.label_forginator"), 62, 71, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_smelt = Button.builder(Component.translatable("gui.ismeargavno.forginator_gui.button_smelt"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ForginatorGuiButtonMessage(0, x, y, z));
				ForginatorGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 118, this.topPos + 33, 51, 20).build();
		guistate.put("button:button_smelt", button_smelt);
		this.addRenderableWidget(button_smelt);
	}
}
