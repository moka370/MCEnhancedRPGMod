package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.EnchantmentGUIMenu;
import net.enhancedrpg.network.EnchantmentGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EnchantmentGUIScreen extends AbstractContainerScreen<EnchantmentGUIMenu> {
	private final static HashMap<String, Object> guistate = EnchantmentGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_lower;
	Button button_ranged_weapons;
	Button button_melee_weapons;
	Button button_armor;

	public EnchantmentGUIScreen(EnchantmentGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/enchantment_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("Enchantment Skill Tree"), 33, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("Select a category:"), 15, 27, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_lower = Button.builder(Component.translatable("gui.enhancedrpg.enchantment_gui.button_lower"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new EnchantmentGUIButtonMessage(0, x, y, z));
				EnchantmentGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 133, 51, 20).build();
		guistate.put("button:button_lower", button_lower);
		this.addRenderableWidget(button_lower);
		button_ranged_weapons = Button.builder(Component.translatable("gui.enhancedrpg.enchantment_gui.button_ranged_weapons"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new EnchantmentGUIButtonMessage(1, x, y, z));
				EnchantmentGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 52, 98, 20).build();
		guistate.put("button:button_ranged_weapons", button_ranged_weapons);
		this.addRenderableWidget(button_ranged_weapons);
		button_melee_weapons = Button.builder(Component.translatable("gui.enhancedrpg.enchantment_gui.button_melee_weapons"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new EnchantmentGUIButtonMessage(2, x, y, z));
				EnchantmentGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 79, 93, 20).build();
		guistate.put("button:button_melee_weapons", button_melee_weapons);
		this.addRenderableWidget(button_melee_weapons);
		button_armor = Button.builder(Component.translatable("gui.enhancedrpg.enchantment_gui.button_armor"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new EnchantmentGUIButtonMessage(3, x, y, z));
				EnchantmentGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 106, 51, 20).build();
		guistate.put("button:button_armor", button_armor);
		this.addRenderableWidget(button_armor);
	}
}
