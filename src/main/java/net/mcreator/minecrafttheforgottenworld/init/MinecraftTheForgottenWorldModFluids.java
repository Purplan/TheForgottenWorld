
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minecrafttheforgottenworld.fluid.RadioactiveWaterFluid;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<FlowingFluid> RADIOACTIVE_WATER = REGISTRY.register("radioactive_water", () -> new RadioactiveWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_RADIOACTIVE_WATER = REGISTRY.register("flowing_radioactive_water", () -> new RadioactiveWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(RADIOACTIVE_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_RADIOACTIVE_WATER.get(), RenderType.translucent());
		}
	}
}
