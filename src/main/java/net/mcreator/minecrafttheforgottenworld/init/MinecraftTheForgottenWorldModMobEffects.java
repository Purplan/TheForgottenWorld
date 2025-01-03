
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minecrafttheforgottenworld.potion.RadioactiveEffectMobEffect;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<MobEffect> RADIOACTIVE_EFFECT = REGISTRY.register("radioactive_effect", () -> new RadioactiveEffectMobEffect());
}
