package net.mcreator.randomadditions.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.Map;

public class MagmaIngotItemInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure MagmaIngotItemInHandTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure MagmaIngotItemInHandTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure MagmaIngotItemInHandTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure MagmaIngotItemInHandTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), Blocks.FIRE.getDefaultState(), 3);
	}
}
