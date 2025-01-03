package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class BritishAC74BombBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MinecraftTheForgottenWorldMod.queueServerWork(300, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 12, Level.ExplosionInteraction.TNT);
		});
	}
}
