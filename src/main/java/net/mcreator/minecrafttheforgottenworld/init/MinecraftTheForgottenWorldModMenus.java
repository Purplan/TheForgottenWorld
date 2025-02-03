
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.minecrafttheforgottenworld.world.inventory.TimeMachineGUIMenu;
import net.mcreator.minecrafttheforgottenworld.world.inventory.SleepingPodGUIMenu;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<MenuType<TimeMachineGUIMenu>> TIME_MACHINE_GUI = REGISTRY.register("time_machine_gui", () -> IForgeMenuType.create(TimeMachineGUIMenu::new));
	public static final RegistryObject<MenuType<SleepingPodGUIMenu>> SLEEPING_POD_GUI = REGISTRY.register("sleeping_pod_gui", () -> IForgeMenuType.create(SleepingPodGUIMenu::new));
}
