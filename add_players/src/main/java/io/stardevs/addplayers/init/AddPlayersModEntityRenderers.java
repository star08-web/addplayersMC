
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevs.addplayers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.stardevs.addplayers.client.renderer.SteveRenderer;
import io.stardevs.addplayers.client.renderer.AlexRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AddPlayersModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AddPlayersModEntities.ALEX, AlexRenderer::new);
		event.registerEntityRenderer(AddPlayersModEntities.STEVE, SteveRenderer::new);
	}
}
