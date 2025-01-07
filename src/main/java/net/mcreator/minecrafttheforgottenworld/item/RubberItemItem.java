
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubberItemItem extends Item {
	public RubberItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
