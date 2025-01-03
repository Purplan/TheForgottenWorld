package net.mcreator.minecrafttheforgottenworld.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.minecrafttheforgottenworld.world.inventory.TimeMachineGUIMenu;
import net.mcreator.minecrafttheforgottenworld.network.TimeMachineGUIButtonMessage;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TimeMachineGUIScreen extends AbstractContainerScreen<TimeMachineGUIMenu> {
	private final static HashMap<String, Object> guistate = TimeMachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_the_american_war_2039;
	Button button_self_destruct;
	Button button_source_time;

	public TimeMachineGUIScreen(TimeMachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft_the_forgotten_world:textures/screens/time_machine_gui.png");

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
		button_the_american_war_2039 = Button.builder(Component.translatable("gui.minecraft_the_forgotten_world.time_machine_gui.button_the_american_war_2039"), e -> {
			if (true) {
				MinecraftTheForgottenWorldMod.PACKET_HANDLER.sendToServer(new TimeMachineGUIButtonMessage(0, x, y, z));
				TimeMachineGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 16, 144, 20).build();
		guistate.put("button:button_the_american_war_2039", button_the_american_war_2039);
		this.addRenderableWidget(button_the_american_war_2039);
		button_self_destruct = Button.builder(Component.translatable("gui.minecraft_the_forgotten_world.time_machine_gui.button_self_destruct"), e -> {
			if (true) {
				MinecraftTheForgottenWorldMod.PACKET_HANDLER.sendToServer(new TimeMachineGUIButtonMessage(1, x, y, z));
				TimeMachineGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 138, 93, 20).build();
		guistate.put("button:button_self_destruct", button_self_destruct);
		this.addRenderableWidget(button_self_destruct);
		button_source_time = Button.builder(Component.translatable("gui.minecraft_the_forgotten_world.time_machine_gui.button_source_time"), e -> {
			if (true) {
				MinecraftTheForgottenWorldMod.PACKET_HANDLER.sendToServer(new TimeMachineGUIButtonMessage(2, x, y, z));
				TimeMachineGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 46, this.topPos + 115, 82, 20).build();
		guistate.put("button:button_source_time", button_source_time);
		this.addRenderableWidget(button_source_time);
	}
}
