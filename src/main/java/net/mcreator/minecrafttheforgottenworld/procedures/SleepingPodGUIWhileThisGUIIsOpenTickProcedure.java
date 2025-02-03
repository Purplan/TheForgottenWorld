package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.client.gui.components.Checkbox;

import java.util.HashMap;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected()) {
		}
	}
}
