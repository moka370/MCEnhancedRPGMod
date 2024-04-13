package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ArmorGUIMenu;
import net.enhancedrpg.procedures.VerifyLevel30Procedure;
import net.enhancedrpg.procedures.VerifyLevel20Procedure;
import net.enhancedrpg.procedures.VerifyLevel15Procedure;
import net.enhancedrpg.network.ArmorGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorGUIScreen extends AbstractContainerScreen<ArmorGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;
	Button button_select2;

	public ArmorGUIScreen(ArmorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 218;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/armor_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_gui.label_armor_enchants"), 63, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_gui.label_protection"), 27, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_gui.label_movement"), 27, 94, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_gui.label_underwater"), 27, 128, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_gui.label_you_must_be_at_the_correct_level"), 13, 24, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.armor_gui.button_select"), e -> {
			if (VerifyLevel30Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorGUIButtonMessage(0, x, y, z));
				ArmorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 144, this.topPos + 52, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel30Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.armor_gui.button_select1"), e -> {
			if (VerifyLevel20Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorGUIButtonMessage(1, x, y, z));
				ArmorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 144, this.topPos + 88, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel20Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.enhancedrpg.armor_gui.button_select2"), e -> {
			if (VerifyLevel15Procedure.execute(entity)) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorGUIButtonMessage(2, x, y, z));
				ArmorGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 144, this.topPos + 124, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (VerifyLevel15Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
	}
}
