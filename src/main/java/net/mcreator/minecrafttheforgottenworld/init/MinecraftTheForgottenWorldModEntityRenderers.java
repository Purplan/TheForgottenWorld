
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minecrafttheforgottenworld.client.renderer.PoliceguardRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftTheForgottenWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftTheForgottenWorldModEntities.POLICEGUARD.get(), PoliceguardRenderer::new);
	}
}
