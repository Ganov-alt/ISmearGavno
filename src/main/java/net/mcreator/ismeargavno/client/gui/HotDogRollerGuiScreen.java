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

import net.mcreator.ismeargavno.world.inventory.HotDogRollerGuiMenu;
import net.mcreator.ismeargavno.network.HotDogRollerGuiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HotDogRollerGuiScreen extends AbstractContainerScreen<HotDogRollerGuiMenu> {
	private final static HashMap<String, Object> guistate = HotDogRollerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_cook;

	public HotDogRollerGuiScreen(HotDogRollerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ismeargavno:textures/screens/hot_dog_roller_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 31 && mouseX < leftPos + 55 && mouseY > topPos + 49 && mouseY < topPos + 73)
			guiGraphics.renderTooltip(font, Component.translatable("gui.ismeargavno.hot_dog_roller_gui.tooltip_flavour_enhancments_optional"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("ismeargavno:textures/screens/arrowpointleft.png"), this.leftPos + 20, this.topPos + -26, 0, 0, 176, 167, 176, 167);

		guiGraphics.blit(ResourceLocation.parse("ismeargavno:textures/screens/sausageicon.png"), this.leftPos + 142, this.topPos + 17, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("ismeargavno:textures/screens/sausagecasingicon.png"), this.leftPos + 16, this.topPos + 17, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.ismeargavno.hot_dog_roller_gui.label_hotdog_roller"), 101, 71, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_cook = Button.builder(Component.translatable("gui.ismeargavno.hot_dog_roller_gui.button_cook"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new HotDogRollerGuiButtonMessage(0, x, y, z));
				HotDogRollerGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 81, this.topPos + 42, 46, 20).build();
		guistate.put("button:button_cook", button_cook);
		this.addRenderableWidget(button_cook);
	}
}
