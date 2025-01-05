package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IsWearingHazmatSuitProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_HELMET.get();
			entity.getCapability(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.is_wearing_hazmat_suit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
