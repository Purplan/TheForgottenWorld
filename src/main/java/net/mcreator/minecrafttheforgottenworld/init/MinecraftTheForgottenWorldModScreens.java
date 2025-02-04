
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.minecrafttheforgottenworld.client.gui.TimeMachineGUIScreen;
import net.mcreator.minecrafttheforgottenworld.client.gui.SleepingPodGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftTheForgottenWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MinecraftTheForgottenWorldModMenus.TIME_MACHINE_GUI.get(), TimeMachineGUIScreen::new);
			MenuScreens.register(MinecraftTheForgottenWorldModMenus.SLEEPING_POD_GUI.get(), SleepingPodGUIScreen::new);
		});
	}
}
