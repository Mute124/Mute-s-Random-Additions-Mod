
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.randomadditions.itemgroup.RandomAdditionstoolsItemGroup;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class BorgiumPickaxeItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:borgium_pickaxe")
	public static final Item block = null;

	public BorgiumPickaxeItem(RandomAdditionsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(RandomAdditionstoolsItemGroup.tab)) {
		}.setRegistryName("borgium_pickaxe"));
	}
}
