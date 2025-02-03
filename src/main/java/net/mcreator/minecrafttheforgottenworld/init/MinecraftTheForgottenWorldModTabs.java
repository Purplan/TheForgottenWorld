
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftTheForgottenWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<CreativeModeTab> USA = REGISTRY.register("usa",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecraft_the_forgotten_world.usa")).icon(() -> new ItemStack(MinecraftTheForgottenWorldModBlocks.USA_FLAG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecraftTheForgottenWorldModItems.RADIOACTIVE_SWORD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(MinecraftTheForgottenWorldModBlocks.USA_FLAG.get().asItem());
			tabData.accept(MinecraftTheForgottenWorldModBlocks.UK_FLAG.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

			tabData.accept(MinecraftTheForgottenWorldModItems.TECHNOBLADE.get());
			tabData.accept(MinecraftTheForgottenWorldModBlocks.TIME_MACHINE.get().asItem());
			tabData.accept(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_74_BOMB.get().asItem());
			tabData.accept(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_79_LAND_MINE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

			tabData.accept(MinecraftTheForgottenWorldModBlocks.SLEEPING_POD.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_HELMET.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_CHESTPLATE.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_LEGGINGS.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(MinecraftTheForgottenWorldModItems.POLICEGUARD_SPAWN_EGG.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(MinecraftTheForgottenWorldModItems.URANIUM_INGOT.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.BUCKET_OF_GUNPOWDER.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.RUBBER_NUGGET_ITEM.get());
			tabData.accept(MinecraftTheForgottenWorldModItems.RUBBER_ITEM.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(MinecraftTheForgottenWorldModItems.THE_FORGOTTEN_WORLD.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(MinecraftTheForgottenWorldModBlocks.URANIUM.get().asItem());
			tabData.accept(MinecraftTheForgottenWorldModBlocks.RUBBER_FIG_PLANT.get().asItem());

		}
	}
}
