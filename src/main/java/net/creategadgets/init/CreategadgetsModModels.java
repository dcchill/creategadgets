
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.creategadgets.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.creategadgets.client.model.ModelGauntletBase;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreategadgetsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGauntletBase.LAYER_LOCATION, ModelGauntletBase::createBodyLayer);
	}
}
