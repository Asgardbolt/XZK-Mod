package com.xzk.tech.block.SmallBoilers;

import com.xzk.tech.block.ContainerTypeRegistry;
import com.xzk.tech.fluid.ItemRegistry;
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

public class BoilersBaseContainer extends Container {
    private static IIntArray data = null;
    private final IInventory container;

    public BoilersBaseContainer(int p_i50095_1_, PlayerInventory p_i50095_2_) {
        this(p_i50095_1_, p_i50095_2_, new Inventory(4), new IntArray(6));
    }

    public BoilersBaseContainer(int p_i50096_1_, PlayerInventory p_i50096_2_, IInventory p_i50096_3_, IIntArray p_i50096_4_) {
        super(ContainerTypeRegistry.BoilersBaseContainer.get(), p_i50096_1_);
        checkContainerSize(p_i50096_3_, 4);
        checkContainerDataCount(p_i50096_4_, 6);
        this.container = p_i50096_3_;
        data = p_i50096_4_;
        this.addSlot(new BoilersBaseContainer.IngredientSlot(p_i50096_3_, 1, 8, 8));
        this.addSlot(new BoilersBaseContainer.FuelSlot(p_i50096_3_, 0, 8, 62));
        this.addSlot(new BoilersBaseContainer.ContainerSlot(p_i50096_3_, 2, 149, 8));
        this.addSlot(new BoilersBaseContainer.ResultSlot(p_i50096_3_, 3, 149, 58));
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
            return p_185004_0_.getItem() == Items.COAL || p_185004_0_.getItem() == Items.CHARCOAL;
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
            return p_185004_0_.getItem() == Items.WATER_BUCKET || p_185004_0_.getItem() == ItemRegistry.DistilledWaterBucket.get();
        }

        public int getMaxStackSize() {
            return 1;
        }
    }

    static class ContainerSlot extends Slot {
        public ContainerSlot(IInventory p_i47070_1_, int p_i47070_2_, int p_i47070_3_, int p_i47070_4_) {
            super(p_i47070_1_, p_i47070_2_, p_i47070_3_, p_i47070_4_);
        }

        public boolean mayPlace(ItemStack p_75214_1_) {
            return mayPlaceItem(p_75214_1_);
        }

        public static boolean mayPlaceItem(ItemStack p_185004_0_) {
            return p_185004_0_.getItem() == Items.BUCKET;
        }

        public int getMaxStackSize() {
            return 16;
        }

        public void setChanged() {
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

    public int getliquid(){
        return data.get(3) * 52 / 500000;
    }

    public int getgas(){
        return data.get(4) * 52 /40000;
    }

    public String getsmallboilersfuel(){
        return data.get(0) / 100 + "." + (data.get(0) - 100 * (data.get(0) / 100));
    }

    public String Test(){
        return data.get(0) + " " + data.get(1) + " "
                + data.get(2) + " " + data.get(3) + " "
                + data.get(4) + " " + data.get(5);
    }

    public int workinglevel(){
       if(data.get(2) >= 10000){
           if(data.get(3) > 0){
               return 1;
           }else{
               return 2;
           }
       }else return 0;
    }

    public int heating(){
        if(data.get(0) > 0) {
            if(data.get(3) > 0){
                return 1;
            }else return 2;
        }else return 0;
    }

    public int getsource(){
        switch (data.get(1)){
            case 1:return 1;
            case 0:
            default:return 0;
        }
    }
}
