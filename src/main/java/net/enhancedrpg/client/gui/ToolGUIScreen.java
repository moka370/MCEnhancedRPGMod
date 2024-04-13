package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ToolGUIMenu;
import net.enhancedrpg.procedures.VerifyLevel30Procedure;
import net.enhancedrpg.procedures.VerifyLevel20Procedure;
import net.enhancedrpg.procedures.VerifyLevel15Procedure;
import net.enhancedrpg.network.ToolGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ToolGUIScreen extends AbstractContainerScreen<ToolGUIMenu> {
	private final static HashMap<String, Object> guistate = ToolGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;
	Button button_select2;

	public ToolGUIScreen(ToolGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 216;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/tool_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.tool_gui.label_tool_enchantments"), 64, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.tool_gui.label_level_10"), 8, 137, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.tool_gui.label_level_20"), 8, 103, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.tool_gui.label_level_30"), 8, 65, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.tool_gui.label_must_be_at_level_for_enchant_cat"), 10, 25, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.tool_gui.button_select"), e -> {
			if (VerifyLevel15Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ToolGUIButtonMessage(0, x, y, z));
				ToolGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 133, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel15Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.tool_gui.button_select1"), e -> {
			if (VerifyLevel20Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ToolGUIButtonMessage(1, x, y, z));
				ToolGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 97, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel20Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.enhancedrpg.tool_gui.button_select2"), e -> {
			if (VerifyLevel30Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ToolGUIButtonMessage(2, x, y, z));
				ToolGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 61, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel30Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
	}
}
