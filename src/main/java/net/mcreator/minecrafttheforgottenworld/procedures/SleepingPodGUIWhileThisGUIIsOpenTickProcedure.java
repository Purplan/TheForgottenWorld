package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;

import java.util.HashMap;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected()) {
			{
				boolean _setval = true;
				entity.getCapability(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.has_radioactivity_protection = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
