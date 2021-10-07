package com.xen.knightsjourney.common.material;

import com.google.common.base.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum SwordMaterial implements IItemTier {
	
	//Cutlass
	IRON_CUTLASS(1, 360, 6.0f, 6.0f, 15,() -> Ingredient.of(Items.IRON_INGOT)),
	GOLD_CUTLASS(1, 80, 8.0f, 6.0f, 22,() -> Ingredient.of(Items.GOLD_INGOT)),
	DIAMOND_CUTLASS(1, 880, 6.5f, 7.5f, 13,() -> Ingredient.of(Items.DIAMOND)),
	NETHERITE_CUTLASS(1, 1260, 7.0f, 9.0f, 16,() -> Ingredient.of(Items.NETHERITE_INGOT));

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;

	private SwordMaterial(int level, int uses, float speed, float damage, int enchantmentValue,
			Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = new LazyValue<>(repairIngredient);
	}

	@Override
	public float getAttackDamageBonus() {
		return this.damage;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public int getLevel() {
		return this.level;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public int getUses() {
		return this.uses;
	}

}
