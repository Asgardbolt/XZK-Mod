package com.xzk.tech.Tool;

import com.xzk.tech.block.BlockRegistry;
import com.xzk.tech.group.ModGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.xzk.tech.Tool.Builds.*;

public class BrokenBasicBuildingTools extends Item {
    public BrokenBasicBuildingTools() {
        super(new Properties().tab(ModGroup.Tools).stacksTo(1));
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        Hand hand = context.getHand();
        World world = context.getLevel();
        PlayerEntity entity = context.getPlayer();
        boolean IsSuccess;
        BlockPos pos = context.getClickedPos();
        ItemStack itemstack = context.getItemInHand();
        if(!world.isClientSide() && hand == Hand.MAIN_HAND) {
            if (world.getBlockState(pos) == BlockRegistry.BlastFurnaceBaseCore.get().defaultBlockState()) {
                IsSuccess = BlastFurnaceBaseBuilding(world, pos,entity);
                IfUse(IsSuccess, entity, itemstack);
            }else if(world.getBlockState(pos) == BlockRegistry.BoilersBaseCore.get().defaultBlockState()){
                IsSuccess = BoilersBaseBuilding(world,pos,entity);
                IfUse(IsSuccess,entity,itemstack);
            }
        }
            return ActionResultType.SUCCESS;
    }
}


