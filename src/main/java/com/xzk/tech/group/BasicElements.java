package com.xzk.tech.group;

import com.xzk.tech.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BasicElements extends ItemGroup {
    public BasicElements() {
        super("basic_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.CopperIngot.get());
    }
}
