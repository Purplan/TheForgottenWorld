
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.minecrafttheforgottenworld.fluid.types.RadioactiveWaterFluidType;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<FluidType> RADIOACTIVE_WATER_TYPE = REGISTRY.register("radioactive_water", () -> new RadioactiveWaterFluidType());
}
