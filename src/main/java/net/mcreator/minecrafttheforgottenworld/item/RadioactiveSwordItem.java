
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;

public class RadioactiveSwordItem extends SwordItem {
	public RadioactiveSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinecraftTheForgottenWorldModItems.BUCKET_OF_RADIOACTIVE_MASS.get()), new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
