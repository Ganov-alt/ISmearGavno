package net.mcreator.ismeargavno.client.gui;

public class TaxRate2Screen extends AbstractContainerScreen<TaxRate2Menu> {

	private final static HashMap<String, Object> guistate = TaxRate2Menu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox TaxRate;

	public TaxRate2Screen(TaxRate2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("ismeargavno:textures/screens/tax_rate_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		TaxRate.render(guiGraphics, mouseX, mouseY, partialTicks);

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

		if (TaxRate.isFocused())
			return TaxRate.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String TaxRateValue = TaxRate.getValue();
		super.resize(minecraft, width, height);
		TaxRate.setValue(TaxRateValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ismeargavno.tax_rate_2.label_empty"), -88, -13, -12829636, false);
	}

	@Override
	public void init() {
		super.init();

		TaxRate = new EditBox(this.font, this.leftPos + 21, this.topPos + -27, 118, 18, Component.translatable("gui.ismeargavno.tax_rate_2.TaxRate"));
		TaxRate.setMaxLength(32767);

		guistate.put("text:TaxRate", TaxRate);
		this.addWidget(this.TaxRate);

	}

}
