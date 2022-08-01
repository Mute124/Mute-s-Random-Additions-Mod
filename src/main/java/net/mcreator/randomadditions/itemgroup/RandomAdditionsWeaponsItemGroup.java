
package net.mcreator.randomadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomadditions.item.Bismuth_toolsSwordItem;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class RandomAdditionsWeaponsItemGroup extends RandomAdditionsModElements.ModElement {
	public RandomAdditionsWeaponsItemGroup(RandomAdditionsModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrandom_additions_weapons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Bismuth_toolsSwordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
