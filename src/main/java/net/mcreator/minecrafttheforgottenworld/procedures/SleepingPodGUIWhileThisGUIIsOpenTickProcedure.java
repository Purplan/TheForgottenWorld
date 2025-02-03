package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.gui.components.Checkbox;

import java.util.HashMap;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(DamageSource damagesource, Entity sourceentity, HashMap guistate) {
		if (damagesource == null || sourceentity == null || guistate == null)
			return;
		if (guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected()
				&& damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraft_the_forgotten_world:radioactive_water_damage")))) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
		}
	}
}
