package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.BasicToolGUIMenu;
import net.enhancedrpg.network.BasicToolGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BasicToolGUIScreen extends AbstractContainerScreen<BasicToolGUIMenu> {
	private final static HashMap<String, Object> guistate = BasicToolGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;

	public BasicToolGUIScreen(BasicToolGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/basic_tool_gui.png");

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.basic_tool_gui.label_basic_tool_upgrade_enchantments"), 6, 10, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.basic_tool_gui.label_cost_5_levels_per_enchant"), 19, 28, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.basic_tool_gui.label_unbreaking"), 15, 128, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.basic_tool_gui.label_fortune"), 15, 75, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.basic_tool_gui.button_select"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new BasicToolGUIButtonMessage(0, x, y, z));
				BasicToolGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 70, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.basic_tool_gui.button_select1"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new BasicToolGUIButtonMessage(1, x, y, z));
				BasicToolGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 124, 56, 20).build();
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
	}
}