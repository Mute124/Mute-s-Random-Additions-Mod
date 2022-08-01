
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.randomadditions.itemgroup.RandomAdditionstoolsItemGroup;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class Bismuth_toolsShovelItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:bismuth_tools_shovel")
	public static final Item block = null;

	public Bismuth_toolsShovelItem(RandomAdditionsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 614;
			}

			public float getEfficiency() {
				return 7.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 27;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BismuthItem.block));
			}
		}, 1, -3f, new Item.Properties().group(RandomAdditionstoolsItemGroup.tab)) {
		}.setRegistryName("bismuth_tools_shovel"));
	}
}
