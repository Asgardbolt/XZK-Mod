package com.xzk.tech.group;

import com.xzk.tech.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class AdvanceElements extends ItemGroup {
    public AdvanceElements() {
        super("advance_elements");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.Fe_NiIngot.get());
    }
}
