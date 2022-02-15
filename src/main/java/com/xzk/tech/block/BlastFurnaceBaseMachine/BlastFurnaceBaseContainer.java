package com.xzk.tech.block.BlastFurnaceBaseMachine;

import com.xzk.tech.block.ContainerTypeRegistry;
import com.xzk.tech.block.ItemRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;
import net.minecraft.util.text.TranslationTextComponent;

public class BlastFurnaceBaseContainer extends Container {
    private static IIntArray data = null;
    private final IInventory container;

    public BlastFurnaceBaseContainer(int p_i50095_1_, PlayerInventory p_i50095_2_) {
        this(p_i50095_1_, p_i50095_2_, new Inventory(4), new IntArray(6));
    }

    public BlastFurnaceBaseContainer(int p_i50096_1_, PlayerInventory p_i50096_2_, IInventory p_i50096_3_, IIntArray p_i50096_4_) {
        super(ContainerTypeRegistry.BlastFurnaceBaseContainer.get(), p_i50096_1_);
        checkContainerSize(p_i50096_3_, 4);
        checkContainerDataCount(p_i50096_4_, 6);
        this.container = p_i50096_3_;
        data = p_i50096_4_;
        this.addSlot(new Slot(p_i50096_3_, 2, 38, 53));
        this.addSlot(new IngredientSlot(p_i50096_3_, 1, 38, 17));
        this.addSlot(new FuelSlot(p_i50096_3_, 0, 56, 53));
        this.addSlot(new ResultSlot(p_i50096_3_, 3, 116, 17));
        this.addDataSlots(p_i50096_4_);
        layoutPlayerInventorySlots(p_i50096_2_, 8, 84);
    }

    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return this.container.stillValid(p_75145_1_);
    }

    @Override
    public ItemStack quickMoveStack(PlayerEntity p_82846_1_, int p_82846_2_) {
        return ItemStack.EMPTY;
    }

    public void removed(PlayerEntity p_75134_1_) {
        super.removed(p_75134_1_);
        this.container.stopOpen(p_75134_1_);
    }

    static class FuelSlot extends Slot {
        public FuelSlot(IInventory p_i47070_1_, int p_i47070_2_, int p_i47070_3_, int p_i47070_4_) {
            super(p_i47070_1_, p_i47070_2_, p_i47070_3_, p_i47070_4_);
        }

        public boolean mayPlace(ItemStack p_75214_1_) {
            return mayPlaceItem(p_75214_1_);
        }

        public static boolean mayPlaceItem(ItemStack p_185004_0_) {
            return p_185004_0_.getItem() == Items.COAL || p_185004_0_.getItem() == Items.COAL_BLOCK || p_185004_0_.getItem() == Items.CHARCOAL;
        }

        public int getMaxStackSize() {
            return 64;
        }
    }

    static class IngredientSlot extends Slot {
        public IngredientSlot(IInventory p_i47070_1_, int p_i47070_2_, int p_i47070_3_, int p_i47070_4_) {
            super(p_i47070_1_, p_i47070_2_, p_i47070_3_, p_i47070_4_);
        }

        public boolean mayPlace(ItemStack p_75214_1_) {
            return mayPlaceItem(p_75214_1_);
        }

        public static boolean mayPlaceItem(ItemStack p_185004_0_) {
            return p_185004_0_.getItem() == Items.IRON_INGOT ||
                    p_185004_0_.getItem() == Items.IRON_ORE ||
                    p_185004_0_.getItem() == ItemRegistry.Magnetite.get() ||
                    p_185004_0_.getItem() == Items.IRON_BLOCK;
        }

        public int getMaxStackSize() {
            return 64;
        }

        public void setChanged() {
            if (this.container.getItem(1).getItem() == Items.IRON_INGOT) {
                data.set(1, 0);
            } else if (this.container.getItem(1).getItem() == Items.IRON_BLOCK) {
                data.set(1, 1);
            } else if (this.container.getItem(1).getItem() == Items.IRON_ORE) {
                data.set(1, 2);
            } else if (this.container.getItem(1).getItem() == ItemRegistry.Magnetite.get()) {
                data.set(1, 3);
            } else {
                data.set(1, 4);
            }
        }
    }

    static class ResultSlot extends Slot {
        public ResultSlot(IInventory p_i47070_1_, int p_i47070_2_, int p_i47070_3_, int p_i47070_4_) {
            super(p_i47070_1_, p_i47070_2_, p_i47070_3_, p_i47070_4_);
        }

        public boolean mayPlace(ItemStack p_75214_1_) {
            return false;
        }

        public boolean mayPickup(PlayerEntity p_82869_1_) {
            return super.mayPickup(p_82869_1_);
        }
    }

    private int addSlotRange(IInventory inventory, int index, int x, int y, int amount, int dx) {
        for (int i = 0; i < amount; i++) {
            addSlot(new Slot(inventory, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(IInventory inventory, int index, int x, int y, int horAmount, int dx, int verAmount, int dy) {
        for (int j = 0; j < verAmount; j++) {
            index = addSlotRange(inventory, index, x, y, horAmount, dx);
            y += dy;
        }
        return index;
    }

    private void layoutPlayerInventorySlots(IInventory inventory, int leftCol, int topRow) {
        // Player inventory
        addSlotBox(inventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(inventory, 0, leftCol, topRow, 9, 18);
    }

    public String getblastbasefuel() {
        return data.get(0) / 100 + "." + (data.get(0) - 100 * (data.get(0) / 100));
    }

    public String getblastbaseheat() {
        return data.get(4) / 100 + "." + (data.get(4) - 100 * (data.get(4) / 100));
    }

    public String getblastbasesource() {
        switch (data.get(1)) {
            case 0:
                TranslationTextComponent iron_ingot = new TranslationTextComponent("message.iron_ingot");
                return iron_ingot.getString();
            case 1:
                TranslationTextComponent iron_block = new TranslationTextComponent("message.iron_block");
                return iron_block.getString();
            case 2:
                TranslationTextComponent iron_ore = new TranslationTextComponent("message.iron_ore");
                return iron_ore.getString();
            case 3:
                TranslationTextComponent magnetite = new TranslationTextComponent("message.magnetite");
                return magnetite.getString();
            default:
                return "null";
        }
    }

    public int getblastbaseprogress() {
        if (data.get(2) != 0 && data.get(3) != 0) {
            return 40 * data.get(2) / data.get(3);
        } else return 0;
    }

    public Boolean IsHeating() {
        return data.get(3) != 0 && data.get(0) >= 0;
    }

    public Boolean IsWorking(){
        return (data.get(4) >= data.get(5)) && data.get(5) != 0;
    }

}
