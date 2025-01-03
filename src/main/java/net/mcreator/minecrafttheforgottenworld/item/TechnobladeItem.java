
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecrafttheforgottenworld.procedures.TechnobladeRightclickedOnBlockProcedure;

public class TechnobladeItem extends RecordItem {
	public TechnobladeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minecraft_the_forgotten_world:technoblade")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1980);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TechnobladeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
