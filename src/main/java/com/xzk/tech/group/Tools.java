package com.xzk.tech.group;

import com.xzk.tech.Tool.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Tools extends ItemGroup {
    public Tools() {
        super("tools");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.BasicBuildingTools.get());
    }
}
