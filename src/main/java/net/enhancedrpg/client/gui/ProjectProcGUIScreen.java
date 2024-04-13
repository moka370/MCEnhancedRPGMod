package net.enhancedrpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.enhancedrpg.world.inventory.ProjectProcGUIMenu;
import net.enhancedrpg.network.ProjectProcGUIButtonMessage;
import net.enhancedrpg.EnhancedrpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ProjectProcGUIScreen extends AbstractContainerScreen<ProjectProcGUIMenu> {
	private final static HashMap<String, Object> guistate = ProjectProcGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_apply;

	public ProjectProcGUIScreen(ProjectProcGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("enhancedrpg:textures/screens/project_proc_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.project_proc_gui.label_apply_projectile_protection_to_a"), 10, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.enhancedrpg.project_proc_gui.label_cost_5_levels"), 23, 61, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_apply = Button.builder(Component.translatable("gui.enhancedrpg.project_proc_gui.button_apply"), e -> {
			if (true) {
				EnhancedrpgMod.PACKET_HANDLER.sendToServer(new ProjectProcGUIButtonMessage(0, x, y, z));
				ProjectProcGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 34, 51, 20).build();
		guistate.put("button:button_apply", button_apply);
		this.addRenderableWidget(button_apply);
	}
}
