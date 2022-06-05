
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevlabs.addplayersfe.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import io.stardevlabs.addplayersfe.client.renderer.SteveRenderer;
import io.stardevlabs.addplayersfe.client.renderer.AlexRenderer;

@Environment(EnvType.CLIENT)
public class AddplayersFeModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(AddplayersFeModEntities.ALEX, AlexRenderer::new);
		EntityRendererRegistry.register(AddplayersFeModEntities.STEVE, SteveRenderer::new);
	}
}
