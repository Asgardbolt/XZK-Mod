package com.xzk.tech.block.BlastFurnaceBaseMachine;

import com.xzk.tech.Utils;
import com.xzk.tech.block.TileEntityTypeRegistry;
import com.xzk.tech.item.ItemRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIntArray;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class BlastFurnaceBaseTileEntity extends TileEntity implements INamedContainerProvider, ITickableTileEntity {
    private int fuel;
    private int source;
    private int progress;
    private int total_time;
    private int heat;
    private int heat_needed;
    private final Inventory inventory = new Inventory(4);
    public final IIntArray BlastFurnaceBaseIntArray = new IIntArray(){

        @Override
        public int get(int p_221476_1_) {
            switch (p_221476_1_){
                case 0:
                    return BlastFurnaceBaseTileEntity.this.fuel;
                case 1:
                    return BlastFurnaceBaseTileEntity.this.source;
                case 2:
                    return BlastFurnaceBaseTileEntity.this.progress;
                case 3:
                    return BlastFurnaceBaseTileEntity.this.total_time;
                case 4:
                    return BlastFurnaceBaseTileEntity.this.heat;
                case 5:
                    return BlastFurnaceBaseTileEntity.this.heat_needed;
                default:
                    return 0;
            }
        }

        @Override
        public void set(int p_221477_1_, int p_221477_2_) {
            switch(p_221477_1_) {
                case 0:
                    BlastFurnaceBaseTileEntity.this.fuel = p_221477_2_;
                    break;
                case 1:
                    BlastFurnaceBaseTileEntity.this.source = p_221477_2_;
                    break;
                case 2:
                    BlastFurnaceBaseTileEntity.this.progress = p_221477_2_;
                    break;
                case 3:
                    BlastFurnaceBaseTileEntity.this.total_time = p_221477_2_;
                    break;
                case 4:
                    BlastFurnaceBaseTileEntity.this.heat = p_221477_2_;
                    break;
                case 5:
                    BlastFurnaceBaseTileEntity.this.heat_needed = p_221477_2_;
            }
        }

        @Override
        public int getCount() {
            return 6;
        }
    };

    public BlastFurnaceBaseTileEntity() {
        super(TileEntityTypeRegistry.BlastFurnaceBaseTileEntity.get());
    }

    @Override
    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        this.fuel = p_230337_2_.getInt("fuel");
        this.source = p_230337_2_.getInt("source");
        this.heat = p_230337_2_.getInt("heat");
        this.progress = p_230337_2_.getInt("progress");
        this.total_time = p_230337_2_.getInt("total_time");
        this.heat_needed = p_230337_2_.getInt("heat_needed");
        this.inventory.setItem(0,ItemStack.of(p_230337_2_.getCompound("fuelslot")));
        this.inventory.setItem(1,ItemStack.of(p_230337_2_.getCompound("ingredientslot")));
        this.inventory.setItem(2,ItemStack.of(p_230337_2_.getCompound("additionslot")));
        this.inventory.setItem(3,ItemStack.of(p_230337_2_.getCompound("resultslot")));
        super.load(p_230337_1_,p_230337_2_);
    }

    @Override
    public CompoundNBT save(CompoundNBT p_189515_1_) {
        p_189515_1_.putInt("fuel",this.fuel);
        p_189515_1_.putInt("source",this.source);
        p_189515_1_.putInt("heat",this.heat);
        p_189515_1_.putInt("progress",this.progress);
        p_189515_1_.putInt("total_time",this.total_time);
        p_189515_1_.putInt("heat_needed",this.heat_needed);
        p_189515_1_.put("fuelslot",inventory.getItem(0).copy().serializeNBT());
        p_189515_1_.put("ingredientslot",inventory.getItem(1).copy().serializeNBT());
        p_189515_1_.put("additionslot",inventory.getItem(2).copy().serializeNBT());
        p_189515_1_.put("resultslot",inventory.getItem(3).copy().serializeNBT());
        return super.save(p_189515_1_);
    }

    @Nullable
    @Override
    public Container createMenu(int sycID, PlayerInventory inventory, PlayerEntity player) {
        return new BlastFurnaceBaseContainer(sycID,inventory,this.inventory, this.BlastFurnaceBaseIntArray);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("gui." + Utils.MOD_ID + ".blast_furnace_base_gui");
    }

    @Override
    public void tick() {
        ItemStack itemStack = this.inventory.getItem(0);
        if(!itemStack.isEmpty()){
            if(itemStack.getItem() == Items.COAL || itemStack.getItem() == Items.CHARCOAL){
                if(fuel <= 1900000){
                    inventory.getItem(0).setCount(inventory.getItem(0).getCount() - 1);
                    fuel = fuel + 100000;
                }
            }else if(itemStack.getItem() == Items.COAL_BLOCK){
                if(fuel <= 1100000){
                    inventory.getItem(0).setCount(inventory.getItem(0).getCount() - 1);
                    fuel = fuel + 900000;
                }
            }
        }

        int deltaheat;
        if(total_time == 0){
            deltaheat = heat / 4000;
            heat = Math.max(heat - deltaheat, 0);
            if(fuel > 0){
                if (!inventory.getItem(1).isEmpty()){
                    if(inventory.getItem(1).getItem() == Items.IRON_INGOT){
                        if((inventory.getItem(3).getItem() == ItemRegistry.Fe_CIngot.get() && inventory.getItem(3).getCount() < 64) || inventory.getItem(3).isEmpty()) {
                            total_time = 600000;
                            heat_needed = 100000;
                            inventory.getItem(1).setCount(inventory.getItem(1).getCount() - 1);
                        }
                    }
                    if(inventory.getItem(1).getItem() == Items.IRON_BLOCK) {
                        if ((inventory.getItem(3).getItem() == com.xzk.tech.block.ItemRegistry.Fe_CBlock.get() && inventory.getItem(3).getCount() < 64) || inventory.getItem(3).isEmpty()) {
                            total_time = 5400000;
                            heat_needed = 100000;
                            inventory.getItem(1).setCount(inventory.getItem(1).getCount() - 1);
                        }
                    }
                    if(inventory.getItem(1).getItem() == Items.IRON_ORE || inventory.getItem(1).getItem() == com.xzk.tech.block.ItemRegistry.Magnetite.get()) {
                        if ((inventory.getItem(3).getItem() == ItemRegistry.Fe_CIngot.get() && inventory.getItem(3).getCount() < 63) || inventory.getItem(3).isEmpty()) {
                            total_time = 900000;
                            heat_needed = 105000;
                            inventory.getItem(1).setCount(inventory.getItem(1).getCount() - 1);
                        }
                    }
                }
            }
        }else{
            int deltafuel = (9900 + fuel / 10000);
            deltaheat = (12 * deltafuel - heat) / 2000;
            if(fuel - deltafuel >= 0 && heat + deltaheat <= 12 * deltafuel){
                heat = heat + deltaheat;
                fuel = fuel - deltafuel / 160;
            }else{
                deltaheat = heat / 4000;
                heat = Math.max(heat - deltaheat, 0);
            }

            if(heat >= heat_needed){
                int coefficient = (100 * (heat - heat_needed))/ heat_needed;
                progress = progress + coefficient * coefficient;
                if(progress >= total_time){
                    progress = 0;
                    switch (total_time){
                        case 600000:
                            if(!inventory.getItem(3).isEmpty()){
                                inventory.getItem(3).setCount( inventory.getItem(3).getCount()+1);
                            }else{
                                inventory.setItem(3,ItemRegistry.Fe_CIngot.get().getDefaultInstance());
                            }
                            break;
                        case 900000:
                            if(!inventory.getItem(3).isEmpty()){
                                inventory.getItem(3).setCount( inventory.getItem(3).getCount()+2);
                            }else{
                                inventory.setItem(3,Items.IRON_INGOT.getDefaultInstance());
                                inventory.getItem(3).setCount( inventory.getItem(3).getCount()+1);
                            }
                            break;
                        case 5400000:
                            if(!inventory.getItem(3).isEmpty()){
                                inventory.getItem(3).setCount( inventory.getItem(3).getCount()+1);
                            }else{
                                inventory.setItem(3, com.xzk.tech.block.ItemRegistry.Fe_CBlock.get().getDefaultInstance());
                            }
                            break;
                    }
                    total_time = 0;
                    heat_needed = 0;
                }
            }
        }
    }
}
