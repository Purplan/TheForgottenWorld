package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class DamageWithoutHazmatSuitProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("minecraft_the_forgotten_world:radioactive_oak_biome"))
				&& !((entity.getCapability(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftTheForgottenWorldModVariables.PlayerVariables())).is_wearing_hazmat_suit
						|| (entity.getCapability(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MinecraftTheForgottenWorldModVariables.PlayerVariables())).has_radioactivity_protection)) {
			if (Calendar.getInstance().get(Calendar.SECOND) % 3 == 0) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraft_the_forgotten_world:radioactive_water_damage")))),
						2);
			}
		}
	}
}
