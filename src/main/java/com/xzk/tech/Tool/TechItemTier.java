package com.xzk.tech.Tool;

import com.xzk.tech.item.ItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum TechItemTier implements IItemTier {
    CopperTier(2, 250, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(ItemRegistry.CopperIngot.get());
    }),

    TitaniumTier(3, 1000, 8.0F, 3.0F, 10, () -> {
        return Ingredient.of(ItemRegistry.TitaniumIngot.get());
    }),

    Fe_NiTier(3, 1100, 8.0F, 4.0F, 14, () -> {
        return Ingredient.of(ItemRegistry.Fe_NiIngot.get());
    }),

    Fe_BTier(3, 1561, 9.0F, 4.0F, 10, () -> {
        return Ingredient.of(ItemRegistry.Fe_NiIngot.get());
    }),

    W_CTier(4, 2500, 9.0F, 4.5F, 15, () -> {
        return Ingredient.of(ItemRegistry.W_CIngot.get());
    }),

    Fe_CTier(2, 400, 6.0F, 2.0F, 14, () -> {
        return Ingredient.of(ItemRegistry.Fe_CIngot.get());
    }),

    Al_MgTier(2, 250, 10.0F, 3.0F, 10, () -> {
        return Ingredient.of(ItemRegistry.Al_MgIngot.get());
    }),

    Cu_ZnTier(1, 150, 12.0F, 2.0F, 18, () -> {
        return Ingredient.of(ItemRegistry.Cu_ZnIngot.get());
    }),

    NeutronTier(100,602214076,602214076F,602214076F,0,()->{
        return Ingredient.of(Items.BEDROCK);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private TechItemTier(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_) {
        this.level = p_i48458_3_;
        this.uses = p_i48458_4_;
        this.speed = p_i48458_5_;
        this.damage = p_i48458_6_;
        this.enchantmentValue = p_i48458_7_;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
