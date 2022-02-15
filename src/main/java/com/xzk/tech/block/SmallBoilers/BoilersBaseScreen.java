package com.xzk.tech.block.SmallBoilers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.xzk.tech.Utils;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BoilersBaseScreen extends ContainerScreen<BoilersBaseContainer> {
    private final ResourceLocation resourceLocation = new ResourceLocation(Utils.MOD_ID, "textures/gui/small_boilers_container_gui.png");

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        renderTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(MatrixStack matrixStack, int x, int y) {
        TranslationTextComponent fuel = new TranslationTextComponent("message.fuel");
        drawCenteredString(matrixStack, this.font, (fuel.getString() + ":" + this.getMenu().getsmallboilersfuel()), 88, 9, 0xeb0505);
        drawCenteredString(matrixStack, this.font, (this.getMenu().Test()), 88, 0, 0xeb0505);
    }

    public BoilersBaseScreen(BoilersBaseContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        this.renderBackground(p_230450_1_);
        this.minecraft.getTextureManager().bind(resourceLocation);
        int i = this.leftPos;
        int j = this.topPos;
        int l1 = this.menu.getliquid();
        int l2 = this.menu.getgas();
        blit(p_230450_1_,i,j,0,0,imageWidth,imageHeight);
        switch (this.menu.getsource()){
            case 0:
                blit(p_230450_1_, i+33, j+60-l1, 176, 133-l1, 18, l1+1);
                break;
            case 1:
                blit(p_230450_1_, i+33, j+60-l1, 194, 133-l1, 18, l1+1);
                break;
        }
        blit(p_230450_1_, i+123, j+60-l2, 212, 133-l2, 18, l2+1);
        switch (this.menu.workinglevel()){
            case 0:
                blit(p_230450_1_,i+60,j+30,60,30,52,24);
                break;
            case 1:
                blit(p_230450_1_,i+61,j+31,176,0,52,24);
                break;
            case 2:
                blit(p_230450_1_,i+61,j+31,176,24,52,24);
                break;
        }

        switch(this.menu.heating()){
            case 0:
                blit(p_230450_1_,i+60,j+61,60,61,52,16);
                break;
            case 1:
                blit(p_230450_1_,i+61,j+62,176,48,52,16);
                break;
            case 2:
                blit(p_230450_1_,i+61,j+62,176,64,52,16);
        }
    }
}
