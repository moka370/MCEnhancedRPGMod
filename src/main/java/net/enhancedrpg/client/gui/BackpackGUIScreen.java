package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.BackpackGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BackpackGUIScreen extends AbstractContainerScreen<BackpackGUIMenu> {
	private final static HashMap<String, Object> guistate = BackpackGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	// Constructor for the backpack GUI
	public BackpackGUIScreen(BackpackGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 194;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	// location for the texture resource for the backpack GUI
	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/backpack_gui.png");

	// render the backpack and GUI components
	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	// render the background texture
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
		// closes backpack GUI if escape key is pressed
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

	// renders the labels for the backpack GUI
	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.backpack_gui.label_backpack"), 8, 7, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.backpack_gui.label_inventory"), 7, 84, -10066330, false);
	}
	
	// handles actions when GUI is closes
	@Override
	public void onClose() {
		super.onClose();
	}

	// initializes GUI components
	@Override
	public void init() {
		super.init();
	}
}
