
package net.mcreator.randomadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class RandomAdditionsFoodItemGroup extends RandomAdditionsModElements.ModElement {
	public RandomAdditionsFoodItemGroup(RandomAdditionsModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrandom_additions_food") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.BREAD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
