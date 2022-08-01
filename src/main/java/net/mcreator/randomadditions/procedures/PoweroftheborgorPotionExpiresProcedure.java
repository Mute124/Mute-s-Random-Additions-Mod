package net.mcreator.randomadditions.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.Map;

public class PoweroftheborgorPotionExpiresProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure PoweroftheborgorPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
