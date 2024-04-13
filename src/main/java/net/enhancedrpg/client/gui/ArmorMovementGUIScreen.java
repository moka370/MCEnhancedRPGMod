package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ArmorMovementGUIMenu;
import net.enhancedrpg.network.ArmorMovementGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorMovementGUIScreen extends AbstractContainerScreen<ArmorMovementGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorMovementGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;
	Button button_select2;
	Button button_select3;

	public ArmorMovementGUIScreen(ArmorMovementGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 213;
		this.imageHeight = 174;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/armor_movement_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_armor_movement_enchants"), 43, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_cost_5_levels_per_enchant"), 41, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_soul_speed"), 16, 60, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_swift_sneak"), 16, 85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_frost_walker"), 16, 112, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_movement_gui.label_feather_falling"), 16, 139, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.armor_movement_gui.button_select"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorMovementGUIButtonMessage(0, x, y, z));
				ArmorMovementGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 56, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.armor_movement_gui.button_select1"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorMovementGUIButtonMessage(1, x, y, z));
				ArmorMovementGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 83, 56, 20).build();
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.enhancedrpg.armor_movement_gui.button_select2"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorMovementGUIButtonMessage(2, x, y, z));
				ArmorMovementGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 137, 56, 20).build();
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
		button_select3 = Button.builder(Component.translatable("gui.enhancedrpg.armor_movement_gui.button_select3"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorMovementGUIButtonMessage(3, x, y, z));
				ArmorMovementGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 110, 56, 20).build();
		guistate.put("button:button_select3", button_select3);
		this.addRenderableWidget(button_select3);
	}
}
