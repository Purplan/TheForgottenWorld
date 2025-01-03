
package net.mcreator.minecrafttheforgottenworld.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecrafttheforgottenworld.procedures.RadioactiveEffectEffectStartedappliedProcedure;

public class RadioactiveEffectMobEffect extends MobEffect {
	public RadioactiveEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -256);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		RadioactiveEffectEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
