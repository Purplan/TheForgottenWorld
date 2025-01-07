
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecrafttheforgottenworld.block.UraniumBlock;
import net.mcreator.minecrafttheforgottenworld.block.USAFlagBlock;
import net.mcreator.minecrafttheforgottenworld.block.UKFlagBlock;
import net.mcreator.minecrafttheforgottenworld.block.TimeMachineBlock;
import net.mcreator.minecrafttheforgottenworld.block.TheForgottenWorldPortalBlock;
import net.mcreator.minecrafttheforgottenworld.block.RubberFigPlantBlock;
import net.mcreator.minecrafttheforgottenworld.block.RadioactiveWaterBlock;
import net.mcreator.minecrafttheforgottenworld.block.BritishAC79LandMineBlock;
import net.mcreator.minecrafttheforgottenworld.block.BritishAC74BombBlock;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<Block> RADIOACTIVE_WATER = REGISTRY.register("radioactive_water", () -> new RadioactiveWaterBlock());
	public static final RegistryObject<Block> THE_FORGOTTEN_WORLD_PORTAL = REGISTRY.register("the_forgotten_world_portal", () -> new TheForgottenWorldPortalBlock());
	public static final RegistryObject<Block> TIME_MACHINE = REGISTRY.register("time_machine", () -> new TimeMachineBlock());
	public static final RegistryObject<Block> USA_FLAG = REGISTRY.register("usa_flag", () -> new USAFlagBlock());
	public static final RegistryObject<Block> URANIUM = REGISTRY.register("uranium", () -> new UraniumBlock());
	public static final RegistryObject<Block> BRITISH_AC_74_BOMB = REGISTRY.register("british_ac_74_bomb", () -> new BritishAC74BombBlock());
	public static final RegistryObject<Block> BRITISH_AC_79_LAND_MINE = REGISTRY.register("british_ac_79_land_mine", () -> new BritishAC79LandMineBlock());
	public static final RegistryObject<Block> UK_FLAG = REGISTRY.register("uk_flag", () -> new UKFlagBlock());
	public static final RegistryObject<Block> RUBBER_FIG_PLANT = REGISTRY.register("rubber_fig_plant", () -> new RubberFigPlantBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
