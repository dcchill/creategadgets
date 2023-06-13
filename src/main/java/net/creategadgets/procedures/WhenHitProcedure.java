package net.creategadgets.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.creategadgets.CreategadgetsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, world, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity immediatesourceentity, Entity sourceentity) {
		if (immediatesourceentity == null || sourceentity == null)
			return;
		if (4 >= Math.abs((Math.abs(immediatesourceentity.getX()) + Math.abs(immediatesourceentity.getY()) + Math.abs(immediatesourceentity.getZ())) - (Math.abs(sourceentity.getX()) + Math.abs(sourceentity.getY()) + Math.abs(sourceentity.getZ())))) {
			sourceentity.getPersistentData().putBoolean("fistReady", (true));
			CreategadgetsMod.queueServerWork(1, () -> {
				sourceentity.getPersistentData().putBoolean("fistReady", (false));
			});
		}
	}
}
