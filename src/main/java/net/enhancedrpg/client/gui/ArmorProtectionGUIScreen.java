package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ArmorProtectionGUIMenu;
import net.enhancedrpg.network.ArmorProtectionGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorProtectionGUIScreen extends AbstractContainerScreen<ArmorProtectionGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorProtectionGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_select;
	Button button_select1;
	Button button_select2;
	Button button_select3;
	Button button_select4;

	public ArmorProtectionGUIScreen(ArmorProtectionGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 213;
		this.imageHeight = 174;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/armor_protection_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_armor_protection_enchants"), 44, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_blast_protection"), 14, 69, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_fire_protection"), 13, 97, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_projectile_protection"), 14, 42, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_protection"), 13, 123, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_thorns"), 13, 149, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.armor_protection_gui.label_each_enchant_costs_5_levels"), 41, 17, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_select = Button.builder(Component.translatable("gui.enhancedrpg.armor_protection_gui.button_select"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorProtectionGUIButtonMessage(0, x, y, z));
				ArmorProtectionGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 38, 56, 20).build();
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.enhancedrpg.armor_protection_gui.button_select1"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorProtectionGUIButtonMessage(1, x, y, z));
				ArmorProtectionGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 65, 56, 20).build();
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.enhancedrpg.armor_protection_gui.button_select2"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorProtectionGUIButtonMessage(2, x, y, z));
				ArmorProtectionGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 92, 56, 20).build();
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
		button_select3 = Button.builder(Component.translatable("gui.enhancedrpg.armor_protection_gui.button_select3"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorProtectionGUIButtonMessage(3, x, y, z));
				ArmorProtectionGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 119, 56, 20).build();
		guistate.put("button:button_select3", button_select3);
		this.addRenderableWidget(button_select3);
		button_select4 = Button.builder(Component.translatable("gui.enhancedrpg.armor_protection_gui.button_select4"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ArmorProtectionGUIButtonMessage(4, x, y, z));
				ArmorProtectionGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 142, this.topPos + 146, 56, 20).build();
		guistate.put("button:button_select4", button_select4);
		this.addRenderableWidget(button_select4);
	}
}
