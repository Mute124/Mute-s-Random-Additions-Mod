
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.randomadditions.itemgroup.RandomAdditionstoolsItemGroup;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class ChainsawItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:chainsaw")
	public static final Item block = null;

	public ChainsawItem(RandomAdditionsModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 9.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(RandomAdditionstoolsItemGroup.tab)) {
		}.setRegistryName("chainsaw"));
	}
}
