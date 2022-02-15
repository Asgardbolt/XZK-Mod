package com.xzk.tech.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SteamBucket extends Item{
    public SteamBucket()
    {
        super(new Properties().tab(ItemGroup.TAB_MISC).stacksTo(1));
    }
}
