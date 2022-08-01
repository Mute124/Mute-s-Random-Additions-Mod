package net.mcreator.randomadditions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.Map;

public class ConfusionPotionStartedappliedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure ConfusionPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) Math.random(), (int) Math.random(), (false), (true)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) Math.random(), (int) Math.random(), (false), (true)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) Math.random(), (int) Math.random(), (false), (true)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) Math.random(), (int) Math.random(), (false), (true)));
		System.out.println("why would you do that?");
	}
}
