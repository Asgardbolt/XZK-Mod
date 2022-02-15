package com.xzk.tech.group;

import com.xzk.tech.block.BlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Ores extends ItemGroup {
    public Ores() {
        super("ores");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockRegistry.Beryl.get());
    }
}
