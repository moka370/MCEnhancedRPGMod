package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ArmorUnderwaterGUIMenu;
import net.enhancedrpg.network.ArmorUnderwaterGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorUnderwaterGUIScreen extends AbstractContainerScreen<ArmorUnderwaterGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorUnderwaterGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;
	Button button_select2;

	public ArmorUnderwaterGUIScreen(ArmorUnderwaterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 213;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/armor_underwater_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_underwater_gui.label_armor_underwater_enchants"), 43, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_underwater_gui.label_cost_5_levels_per_enchant"), 41, 20, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_underwater_gui.label_aqua_affinity"), 16, 137, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_underwater_gui.label_depth_strider"), 16, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_underwater_gui.label_respiration"), 16, 47, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.armor_underwater_gui.button_select"), e -> {
		}).bounds(this.leftPos + 142, this.topPos + 43, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.armor_underwater_gui.button_select1"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorUnderwaterGUIButtonMessage(1, x, y, z));
				ArmorUnderwaterGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 88, 56, 20).build();
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.enhancedrpg.armor_underwater_gui.button_select2"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorUnderwaterGUIButtonMessage(2, x, y, z));
				ArmorUnderwaterGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 133, 56, 20).build();
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
	}
}
