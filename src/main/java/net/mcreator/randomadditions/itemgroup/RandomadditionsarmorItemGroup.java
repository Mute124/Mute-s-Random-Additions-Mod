
package net.mcreator.randomadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomadditions.item.Wood_ArmorArmorItem;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class RandomadditionsarmorItemGroup extends RandomAdditionsModElements.ModElement {
	public RandomadditionsarmorItemGroup(RandomAdditionsModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrandomadditionsarmor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Wood_ArmorArmorItem.helmet);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
