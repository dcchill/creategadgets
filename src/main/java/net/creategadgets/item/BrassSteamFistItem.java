
package net.creategadgets.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.creategadgets.procedures.BrassSteamFistWhileBaubleIsEquippedTickProcedure;

public class BrassSteamFistItem extends Item implements ICurioItem {
	public BrassSteamFistItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		BrassSteamFistWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level, slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
	}
}
