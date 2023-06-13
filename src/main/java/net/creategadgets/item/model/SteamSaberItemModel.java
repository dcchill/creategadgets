package net.creategadgets.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.creategadgets.item.SteamSaberItem;

public class SteamSaberItemModel extends AnimatedGeoModel<SteamSaberItem> {
	@Override
	public ResourceLocation getAnimationResource(SteamSaberItem animatable) {
		return new ResourceLocation("creategadgets", "animations/steamsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteamSaberItem animatable) {
		return new ResourceLocation("creategadgets", "geo/steamsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteamSaberItem animatable) {
		return new ResourceLocation("creategadgets", "textures/items/steamsaber.png");
	}
}
