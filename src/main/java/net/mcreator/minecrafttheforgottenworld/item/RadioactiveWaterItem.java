
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModFluids;

public class RadioactiveWaterItem extends BucketItem {
	public RadioactiveWaterItem() {
		super(MinecraftTheForgottenWorldModFluids.RADIOACTIVE_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
