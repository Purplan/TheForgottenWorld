
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<Potion> RADIOACTIVE_POTION = REGISTRY.register("radioactive_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, true), new MobEffectInstance(MobEffects.HARM, 300, 0, false, true),
					new MobEffectInstance(MinecraftTheForgottenWorldModMobEffects.RADIOACTIVE_EFFECT.get(), 3600, 0, false, true)));
}
