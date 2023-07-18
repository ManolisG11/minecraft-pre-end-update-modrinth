
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thepreendbywhitewolf.client.renderer.TestRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThepreendByWhitewolfModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ThepreendByWhitewolfModEntities.TEST.get(), TestRenderer::new);
	}
}
