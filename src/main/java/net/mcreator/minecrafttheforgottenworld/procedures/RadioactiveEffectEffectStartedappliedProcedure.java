package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class RadioactiveEffectEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraft_the_forgotten_world:radioactive_water_damage")))), 4);
		MinecraftTheForgottenWorldMod.queueServerWork(40, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Radiation: 5"), false);
		});
		MinecraftTheForgottenWorldMod.queueServerWork(80, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Radiation: 10"), false);
		});
		MinecraftTheForgottenWorldMod.queueServerWork(120, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Radiation: 15"), false);
		});
		MinecraftTheForgottenWorldMod.queueServerWork(160, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Radiation: 25"), false);
		});
		MinecraftTheForgottenWorldMod.queueServerWork(200, () -> {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Radiation: 50"), false);
		});
		MinecraftTheForgottenWorldMod.queueServerWork(240, () -> {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 5000);
		});
	}
}
