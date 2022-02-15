package com.xzk.tech.block.SmallBoilers;

import com.xzk.tech.Utils;
import com.xzk.tech.block.TileEntityTypeRegistry;
import com.xzk.tech.fluid.ItemRegistry;
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

public class BoilersBaseTileEntity extends TileEntity implements INamedContainerProvider, ITickableTileEntity {
    private int fuel;
    private int source;
    private int heat;
    private int volume_liquid;
    private int volume_gas;
    private int pressure;
    private int calcify;
    static int deltafuel;
    static int deltaheat;
    static int deltasource;
    private final Inventory inventory = new Inventory(4);
    public final IIntArray BoilersBaseIntArray = new IIntArray(){

        @Override
        public int get(int p_221476_1_) {
            switch (p_221476_1_){
                case 0:
                    return BoilersBaseTileEntity.this.fuel;
                case 1:
                    return BoilersBaseTileEntity.this.source;
                case 2:
                    return BoilersBaseTileEntity.this.heat;
                case 3:
                    return BoilersBaseTileEntity.this.volume_liquid;
                case 4:
                    return BoilersBaseTileEntity.this.volume_gas;
                case 5:
                    return BoilersBaseTileEntity.this.calcify;
                default:
                    return 0;
            }
        }

        @Override
        public void set(int p_221477_1_, int p_221477_2_) {
            switch(p_221477_1_) {
                case 0:
                    BoilersBaseTileEntity.this.fuel = p_221477_2_;
                    break;
                case 1:
                    BoilersBaseTileEntity.this.source = p_221477_2_;
                    break;
                case 2:
                    BoilersBaseTileEntity.this.heat = p_221477_2_;
                    break;
                case 3:
                    BoilersBaseTileEntity.this.volume_liquid = p_221477_2_;
                    break;
                case 4:
                    BoilersBaseTileEntity.this.volume_gas = p_221477_2_;
                    break;
                case 5:
                    BoilersBaseTileEntity.this.calcify = p_221477_2_;
            }
        }

        @Override
        public int getCount() {
            return 6;
        }
    };

    public BoilersBaseTileEntity() {
        super(TileEntityTypeRegistry.BoilersBaseTileEntity.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("gui." + Utils.MOD_ID + ".small_boilers_gui");
    }

    @Nullable
    @Override
    public Container createMenu(int sycID, PlayerInventory inventory, PlayerEntity player) {
        return new BoilersBaseContainer(sycID,inventory,this.inventory, this.BoilersBaseIntArray);
    }

    @Override
    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        this.fuel = p_230337_2_.getInt("fuel");
        this.source = p_230337_2_.getInt("source");
        this.heat = p_230337_2_.getInt("heat");
        this.volume_liquid = p_230337_2_.getInt("volume_liquid");
        this.volume_gas = p_230337_2_.getInt("volume_gas");
        this.calcify = p_230337_2_.getInt("calcify");
        this.inventory.setItem(0, ItemStack.of(p_230337_2_.getCompound("fuelslot")));
        this.inventory.setItem(1,ItemStack.of(p_230337_2_.getCompound("ingredientslot")));
        this.inventory.setItem(2,ItemStack.of(p_230337_2_.getCompound("containerslot")));
        this.inventory.setItem(3,ItemStack.of(p_230337_2_.getCompound("resultslot")));
        super.load(p_230337_1_,p_230337_2_);
    }

    @Override
    public CompoundNBT save(CompoundNBT p_189515_1_) {
        p_189515_1_.putInt("fuel",this.fuel);
        p_189515_1_.putInt("source",this.source);
        p_189515_1_.putInt("heat",this.heat);
        p_189515_1_.putInt("volume_liquid",this.volume_liquid);
        p_189515_1_.putInt("volume_gas",this.volume_gas);
        p_189515_1_.putInt("calcify",this.calcify);
        p_189515_1_.put("fuelslot",inventory.getItem(0).copy().serializeNBT());
        p_189515_1_.put("ingredientslot",inventory.getItem(1).copy().serializeNBT());
        p_189515_1_.put("containerslot",inventory.getItem(2).copy().serializeNBT());
        p_189515_1_.put("resultslot",inventory.getItem(3).copy().serializeNBT());
        return super.save(p_189515_1_);
    }

    @Override
    public void tick() {
       if(this.inventory.getItem(1).getItem() == Items.WATER_BUCKET){
           if(source == 0){
               if(volume_liquid <= 400000){
                   volume_liquid = volume_liquid + 100000;
                   this.inventory.setItem(1,Items.BUCKET.getDefaultInstance());
               }
           }else if(volume_liquid == 0){
               source = 0;
               volume_liquid = 100000;
               this.inventory.setItem(1,Items.BUCKET.getDefaultInstance());
           }
       }else if(this.inventory.getItem(1).getItem() == ItemRegistry.DistilledWaterBucket.get()){
           if(source == 1){
               if(volume_liquid <= 400000){
                   volume_liquid = volume_liquid + 100000;
                   this.inventory.setItem(1,Items.BUCKET.getDefaultInstance());
               }
           }else if(volume_liquid == 0){
               source = 1;
               volume_liquid = 100000;
               this.inventory.setItem(1,Items.BUCKET.getDefaultInstance());
           }
       }

       if(!this.inventory.getItem(0).isEmpty()){
           if(this.inventory.getItem(0).getItem() == Items.COAL || this.inventory.getItem(0).getItem() == Items.CHARCOAL){
               if(fuel <= 400000){
                   inventory.getItem(0).setCount(inventory.getItem(0).getCount() - 1);
                   fuel = fuel + 100000;
               }
           }
       }

       if(fuel > 0 && volume_liquid > 0){
           if(heat < 10000){
               deltafuel = (9900 + fuel / 10000);
               deltaheat = (2 * deltafuel - heat) / (2000 + volume_liquid / 250);
               if(fuel - deltafuel >= 0 && heat + deltaheat <= 2 * deltafuel){
                   heat = heat + deltaheat;
                   fuel = fuel - deltafuel / 160;
               }else{
                   deltaheat = heat / (4000 + 4 * volume_liquid / 125) ;
                   heat = Math.max(heat - deltaheat, 0);
               }
           }else{
               deltafuel = (9900 + fuel / 10000);
               deltaheat = (2 * deltafuel - heat) / (2000 + volume_liquid / 125);
               if(fuel - deltafuel >= 0 && heat + deltaheat <= 2 * deltafuel){
                   heat = heat + deltaheat;
                   fuel = fuel - deltafuel / 160;
               }else{
                   deltaheat = heat / (4000 + 4 * volume_liquid / 125);
                   heat = heat - deltaheat;
               }
           }
       }else{
           deltaheat = heat / (4000 + 4 * volume_liquid / 125);
           heat = heat - deltaheat;
       }

       if(heat >= 10000){
           deltasource = (int) Math.sqrt(100 *(heat - 10000));
           if(volume_liquid - deltasource >= 0){
               volume_liquid = volume_liquid - deltasource;
               deltasource = calcify == 0 ? deltasource : deltasource/ (1+19*calcify/10000000);;
               volume_gas = Math.min(volume_gas + deltasource, 40000);
           }else{
               volume_liquid = 0;
           }
       }

       if(volume_liquid > 0) {
           calcify = source == 0 ? Math.min(10000000, calcify + volume_liquid / 1000) : calcify;
       }

       if(this.inventory.getItem(2).getItem() == Items.BUCKET && volume_gas >= 8000 && this.inventory.getItem(3).isEmpty()){
           volume_gas = volume_gas - 8000;
           this.inventory.removeItem(2,1);
           this.inventory.setItem(3, com.xzk.tech.item.ItemRegistry.SteamBucket.get().getDefaultInstance());
       }
    }
}
