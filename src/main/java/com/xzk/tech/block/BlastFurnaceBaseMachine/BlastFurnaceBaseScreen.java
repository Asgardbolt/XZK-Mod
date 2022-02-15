package com.xzk.tech.block.BlastFurnaceBaseMachine;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.xzk.tech.Utils;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BlastFurnaceBaseScreen extends ContainerScreen<BlastFurnaceBaseContainer> {

    private final ResourceLocation resourceLocation = new ResourceLocation(Utils.MOD_ID, "textures/gui/blast_furnace_base_container_gui.png");

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        renderTooltip(matrixStack, mouseX, mouseY);
    }

    public BlastFurnaceBaseScreen(BlastFurnaceBaseContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderLabels(MatrixStack matrixStack, int x, int y) {
        TranslationTextComponent fuel = new TranslationTextComponent("message.fuel");
        TranslationTextComponent heat = new TranslationTextComponent("message.heat");
        TranslationTextComponent source = new TranslationTextComponent("message.source");
        drawCenteredString(matrixStack, this.font, (fuel.getString() + ":" + this.getMenu().getblastbasefuel()), 115, 66, 0xeb0505);
        drawCenteredString(matrixStack, this.font, (heat.getString() + ":" + this.getMenu().getblastbaseheat()), 115, 56, 0xeb0505);
        drawCenteredString(matrixStack, this.font, (source.getString() + ":" + this.getMenu().getblastbasesource()), 46, 6, 0xFFFFFF);
    }

    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        this.renderBackground(p_230450_1_);
        this.minecraft.getTextureManager().bind(resourceLocation);
        int i = this.leftPos;
        int j = this.topPos;
        int l = this.menu.getblastbaseprogress();
        blit(p_230450_1_, i, j, 0, 0, imageWidth, imageHeight);
        blit(p_230450_1_, i+62, j+21, 176, 0, l+1, 8);
        if(this.menu.IsHeating()){
            blit(p_230450_1_, i+83, j+49, 176, 8, 5, 5);
        }
        if(this.menu.IsWorking()){
            blit(p_230450_1_, i+92, j+49, 181, 8, 5, 5);
        }
    }
}
