
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<SoundEvent> LOG1 = REGISTRY.register("log1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minecraft_the_forgotten_world", "log1")));
	public static final RegistryObject<SoundEvent> TECHNOBLADE = REGISTRY.register("technoblade", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minecraft_the_forgotten_world", "technoblade")));
}
