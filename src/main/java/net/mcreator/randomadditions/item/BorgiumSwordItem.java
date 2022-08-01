
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.randomadditions.itemgroup.RandomAdditionsWeaponsItemGroup;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class BorgiumSwordItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:borgium_sword")
	public static final Item block = null;

	public BorgiumSwordItem(RandomAdditionsModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 660;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BorgiumDustItem.block));
			}
		}, 3, -3f, new Item.Properties().group(RandomAdditionsWeaponsItemGroup.tab)) {
		}.setRegistryName("borgium_sword"));
	}
}
