package net.mcreator.minecrafttheforgottenworld.client.gui;

public class SleepingPodGUIScreen extends AbstractContainerScreen<SleepingPodGUIMenu> {

	private final static HashMap<String, Object> guistate = SleepingPodGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Checkbox SleepingPodRadioactiveProtection;

	public SleepingPodGUIScreen(SleepingPodGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 50;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_the_forgotten_world:textures/screens/sleeping_pod_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

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

		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();

		SleepingPodRadioactiveProtection = new Checkbox(this.leftPos + 22, this.topPos + 15, 20, 20, Component.translatable("gui.minecraft_the_forgotten_world.sleeping_pod_gui.SleepingPodRadioactiveProtection"), false);

		guistate.put("checkbox:SleepingPodRadioactiveProtection", SleepingPodRadioactiveProtection);
		this.addRenderableWidget(SleepingPodRadioactiveProtection);
	}

}
