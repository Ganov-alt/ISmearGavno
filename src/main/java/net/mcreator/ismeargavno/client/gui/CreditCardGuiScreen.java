package net.mcreator.ismeargavno.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.ismeargavno.world.inventory.CreditCardGuiMenu;
import net.mcreator.ismeargavno.network.CreditCardGuiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CreditCardGuiScreen extends AbstractContainerScreen<CreditCardGuiMenu> {
	private final static HashMap<String, Object> guistate = CreditCardGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Balance;
	Button button_transfer;

	public CreditCardGuiScreen(CreditCardGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ismeargavno:textures/screens/credit_card_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Balance.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Balance.isFocused())
			return Balance.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String BalanceValue = Balance.getValue();
		super.resize(minecraft, width, height);
		Balance.setValue(BalanceValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		Balance = new EditBox(this.font, this.leftPos + 29, this.topPos + 8, 118, 18, Component.translatable("gui.ismeargavno.credit_card_gui.Balance")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ismeargavno.credit_card_gui.Balance").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ismeargavno.credit_card_gui.Balance").getString());
				else
					setSuggestion(null);
			}
		};
		Balance.setMaxLength(32767);
		Balance.setSuggestion(Component.translatable("gui.ismeargavno.credit_card_gui.Balance").getString());
		guistate.put("text:Balance", Balance);
		this.addWidget(this.Balance);
		button_transfer = Button.builder(Component.translatable("gui.ismeargavno.credit_card_gui.button_transfer"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new CreditCardGuiButtonMessage(0, x, y, z));
				CreditCardGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 58, 67, 20).build();
		guistate.put("button:button_transfer", button_transfer);
		this.addRenderableWidget(button_transfer);
	}
}
