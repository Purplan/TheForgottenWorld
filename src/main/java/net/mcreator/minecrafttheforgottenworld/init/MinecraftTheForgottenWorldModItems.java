
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecrafttheforgottenworld.item.UraniumIngotItem;
import net.mcreator.minecrafttheforgottenworld.item.TheForgottenWorldItem;
import net.mcreator.minecrafttheforgottenworld.item.TechnobladeItem;
import net.mcreator.minecrafttheforgottenworld.item.RubberNuggetItemItem;
import net.mcreator.minecrafttheforgottenworld.item.RubberItemItem;
import net.mcreator.minecrafttheforgottenworld.item.RadioactiveWaterItem;
import net.mcreator.minecrafttheforgottenworld.item.RadioactiveSwordItem;
import net.mcreator.minecrafttheforgottenworld.item.HazmatSuitArmorItem;
import net.mcreator.minecrafttheforgottenworld.item.BucketOfRadioactiveMassItem;
import net.mcreator.minecrafttheforgottenworld.item.BucketOfGunpowderItem;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftTheForgottenWorldMod.MODID);
	public static final RegistryObject<Item> RADIOACTIVE_WATER_BUCKET = REGISTRY.register("radioactive_water_bucket", () -> new RadioactiveWaterItem());
	public static final RegistryObject<Item> THE_FORGOTTEN_WORLD = REGISTRY.register("the_forgotten_world", () -> new TheForgottenWorldItem());
	public static final RegistryObject<Item> BUCKET_OF_RADIOACTIVE_MASS = REGISTRY.register("bucket_of_radioactive_mass", () -> new BucketOfRadioactiveMassItem());
	public static final RegistryObject<Item> RADIOACTIVE_SWORD = REGISTRY.register("radioactive_sword", () -> new RadioactiveSwordItem());
	public static final RegistryObject<Item> TECHNOBLADE = REGISTRY.register("technoblade", () -> new TechnobladeItem());
	public static final RegistryObject<Item> TIME_MACHINE = block(MinecraftTheForgottenWorldModBlocks.TIME_MACHINE);
	public static final RegistryObject<Item> POLICEGUARD_SPAWN_EGG = REGISTRY.register("policeguard_spawn_egg", () -> new ForgeSpawnEggItem(MinecraftTheForgottenWorldModEntities.POLICEGUARD, -13421569, -13408513, new Item.Properties()));
	public static final RegistryObject<Item> USA_FLAG = block(MinecraftTheForgottenWorldModBlocks.USA_FLAG);
	public static final RegistryObject<Item> URANIUM = block(MinecraftTheForgottenWorldModBlocks.URANIUM);
	public static final RegistryObject<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", () -> new UraniumIngotItem());
	public static final RegistryObject<Item> BRITISH_AC_74_BOMB = block(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_74_BOMB);
	public static final RegistryObject<Item> BRITISH_AC_79_LAND_MINE = block(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_79_LAND_MINE);
	public static final RegistryObject<Item> BUCKET_OF_GUNPOWDER = REGISTRY.register("bucket_of_gunpowder", () -> new BucketOfGunpowderItem());
	public static final RegistryObject<Item> UK_FLAG = block(MinecraftTheForgottenWorldModBlocks.UK_FLAG);
	public static final RegistryObject<Item> HAZMAT_SUIT_ARMOR_HELMET = REGISTRY.register("hazmat_suit_armor_helmet", () -> new HazmatSuitArmorItem.Helmet());
	public static final RegistryObject<Item> HAZMAT_SUIT_ARMOR_CHESTPLATE = REGISTRY.register("hazmat_suit_armor_chestplate", () -> new HazmatSuitArmorItem.Chestplate());
	public static final RegistryObject<Item> HAZMAT_SUIT_ARMOR_LEGGINGS = REGISTRY.register("hazmat_suit_armor_leggings", () -> new HazmatSuitArmorItem.Leggings());
	public static final RegistryObject<Item> HAZMAT_SUIT_ARMOR_BOOTS = REGISTRY.register("hazmat_suit_armor_boots", () -> new HazmatSuitArmorItem.Boots());
	public static final RegistryObject<Item> RUBBER_FIG_PLANT = block(MinecraftTheForgottenWorldModBlocks.RUBBER_FIG_PLANT);
	public static final RegistryObject<Item> RUBBER_NUGGET_ITEM = REGISTRY.register("rubber_nugget_item", () -> new RubberNuggetItemItem());
	public static final RegistryObject<Item> RUBBER_ITEM = REGISTRY.register("rubber_item", () -> new RubberItemItem());
	public static final RegistryObject<Item> SLEEPING_POD = block(MinecraftTheForgottenWorldModBlocks.SLEEPING_POD);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
