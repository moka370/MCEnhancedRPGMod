package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ApprenticeLevelMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ApprenticeLevelScreen extends AbstractContainerScreen<ApprenticeLevelMenu> {
	private final static HashMap<String, Object> guistate = ApprenticeLevelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ApprenticeLevelScreen(ApprenticeLevelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/apprentice_level.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.apprentice_level.label_congrats_your_gift_leveled"), 15, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.apprentice_level.label_up_your_relationship_with_the_vi"), 15, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.apprentice_level.label_villager_to_apprentice"), 15, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.apprentice_level.label_unlocked_new_items"), 15, 79, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
