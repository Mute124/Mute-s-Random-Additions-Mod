
package net.mcreator.randomadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.randomadditions.itemgroup.RandomadditionsItemsItemGroup;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class BarkItem extends RandomAdditionsModElements.ModElement {
	@ObjectHolder("random_additions:bark")
	public static final Item block = null;

	public BarkItem(RandomAdditionsModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RandomadditionsItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bark");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
