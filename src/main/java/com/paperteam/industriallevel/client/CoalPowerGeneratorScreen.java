package com.paperteam.industriallevel.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.paperteam.industriallevel.IndustrialLevel;
import com.paperteam.industriallevel.block.CoalPowerGeneratorBlockEntity;
import com.paperteam.industriallevel.block.CoalPowerGeneratorContainer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nullable;
import java.util.List;

public class CoalPowerGeneratorScreen extends AbstractContainerScreen<CoalPowerGeneratorContainer> {

    private final ResourceLocation GUI = new ResourceLocation(IndustrialLevel.ModId, "textures/gui/coal_power_generator_gui.png");
    public static final String CONTAINER_INDUSTRIALLEVEL_COAL_POWER_GENERATOR = "container.industriallevel.coal_power_generator";

    public CoalPowerGeneratorScreen(CoalPowerGeneratorContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }

    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }

    public void appendHoverText(ItemStack stack, @Nullable BlockGetter reader, List<Component> list, TooltipFlag flags) {
        list.add(new TranslatableComponent(CONTAINER_INDUSTRIALLEVEL_COAL_POWER_GENERATOR + menu.getEnergy() + "IL", Integer.toString(CoalPowerGeneratorBlockEntity.COAL_POWER_GENERATOR_GENERATE))
                .withStyle(ChatFormatting.BLUE));
    }

    @Override
    protected void renderLabels(PoseStack matrixStack, int mouseX, int mouseY) {
        drawString(matrixStack, Minecraft.getInstance().font, CONTAINER_INDUSTRIALLEVEL_COAL_POWER_GENERATOR + menu.getEnergy(), 10, 10, 0xffffff);
    }

    @Override
    protected void renderBg(PoseStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, GUI);
        int relX = (this.width - this.imageWidth) / 2;
        int relY = (this.height - this.imageHeight) / 2;
        this.blit(matrixStack, relX, relY, 0, 0, this.imageWidth, this.imageHeight);
    }
}
