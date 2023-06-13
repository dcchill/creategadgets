
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.creategadgets.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.creategadgets.item.SteamSaberItem;
import net.creategadgets.item.GauntletFist2Item;
import net.creategadgets.item.GauntletFist1Item;
import net.creategadgets.item.GauntletBase3Item;
import net.creategadgets.item.GauntletBase2Item;
import net.creategadgets.item.GauntletBase1Item;
import net.creategadgets.item.BrassSteamFistItem;
import net.creategadgets.item.BasicSteamFistItem;
import net.creategadgets.item.AdvSteamFistItem;
import net.creategadgets.CreategadgetsMod;

public class CreategadgetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreategadgetsMod.MODID);
	public static final RegistryObject<Item> GAUNTLET_BASE_2 = REGISTRY.register("gauntlet_base_2", () -> new GauntletBase2Item());
	public static final RegistryObject<Item> GAUNTLET_BASE_1 = REGISTRY.register("gauntlet_base_1", () -> new GauntletBase1Item());
	public static final RegistryObject<Item> GAUNTLET_BASE_3 = REGISTRY.register("gauntlet_base_3", () -> new GauntletBase3Item());
	public static final RegistryObject<Item> GAUNTLET_FIST_1 = REGISTRY.register("gauntlet_fist_1", () -> new GauntletFist1Item());
	public static final RegistryObject<Item> GAUNTLET_FIST_2 = REGISTRY.register("gauntlet_fist_2", () -> new GauntletFist2Item());
	public static final RegistryObject<Item> BASIC_STEAM_FIST = REGISTRY.register("basic_steam_fist", () -> new BasicSteamFistItem());
	public static final RegistryObject<Item> BRASS_STEAM_FIST = REGISTRY.register("brass_steam_fist", () -> new BrassSteamFistItem());
	public static final RegistryObject<Item> ADV_STEAM_FIST = REGISTRY.register("adv_steam_fist", () -> new AdvSteamFistItem());
	public static final RegistryObject<Item> STEAM_SABER = REGISTRY.register("steam_saber", () -> new SteamSaberItem());
}
