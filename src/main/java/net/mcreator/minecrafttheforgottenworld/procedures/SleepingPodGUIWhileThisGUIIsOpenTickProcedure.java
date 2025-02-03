package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected()) {
		}
	}
}
