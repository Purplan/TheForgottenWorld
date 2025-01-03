
package net.mcreator.minecrafttheforgottenworld.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModFluids;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModFluidTypes;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModBlocks;

public abstract class RadioactiveWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MinecraftTheForgottenWorldModFluidTypes.RADIOACTIVE_WATER_TYPE.get(), () -> MinecraftTheForgottenWorldModFluids.RADIOACTIVE_WATER.get(),
			() -> MinecraftTheForgottenWorldModFluids.FLOWING_RADIOACTIVE_WATER.get()).explosionResistance(100f).bucket(() -> MinecraftTheForgottenWorldModItems.RADIOACTIVE_WATER_BUCKET.get())
			.block(() -> (LiquidBlock) MinecraftTheForgottenWorldModBlocks.RADIOACTIVE_WATER.get());

	private RadioactiveWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RadioactiveWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RadioactiveWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
