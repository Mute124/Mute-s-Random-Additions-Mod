package net.mcreator.randomadditions.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.randomadditions.item.BarkItem;
import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.Map;

public class BismuthtoolsAxeRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure BismuthtoolsAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure BismuthtoolsAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure BismuthtoolsAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure BismuthtoolsAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure BismuthtoolsAxeRightClickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Blocks.OAK_LOG.getDefaultState().getMaterial() == net.minecraft.block.material.Material.WOOD) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BarkItem.block);
				_setstack.setCount((int) Math.random());
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
