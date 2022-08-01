
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
public class Bismuth_toolsSwordItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:bismuth_tools_sword")
	public static final Item block = null;

	public Bismuth_toolsSwordItem(RandomAdditionsModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 614;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 27;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BismuthItem.block));
			}
		}, 3, -3.2999999999999999f, new Item.Properties().group(RandomAdditionsWeaponsItemGroup.tab)) {
		}.setRegistryName("bismuth_tools_sword"));
	}
}
