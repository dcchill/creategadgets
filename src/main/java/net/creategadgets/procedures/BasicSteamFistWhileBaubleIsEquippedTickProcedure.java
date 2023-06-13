package net.creategadgets.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class BasicSteamFistWhileBaubleIsEquippedTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("fistReady") == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 8, 5, (false), (false)));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 2,
						Explosion.BlockInteraction.NONE);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound create:steam player @p ~ ~ ~ 1 0.1");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 3, 1, 1, 1, 0.2);
			world.addParticle(ParticleTypes.POOF, x, y, z, (entity.getLookAngle().x + Mth.nextInt(RandomSource.create(), 1, 10) / 10), (entity.getLookAngle().y + Mth.nextInt(RandomSource.create(), 1, 10) / 10),
					(entity.getLookAngle().z + Mth.nextInt(RandomSource.create(), 1, 10) / 10));
			world.addParticle(ParticleTypes.POOF, x, y, z, (entity.getLookAngle().x + Mth.nextInt(RandomSource.create(), 1, 10) / 10), (entity.getLookAngle().y + Mth.nextInt(RandomSource.create(), 1, 10) / 10),
					(entity.getLookAngle().z + Mth.nextInt(RandomSource.create(), 1, 10) / 10));
			world.addParticle(ParticleTypes.POOF, x, y, z, (entity.getLookAngle().x + Mth.nextInt(RandomSource.create(), 1, 10) / 10), (entity.getLookAngle().y + Mth.nextInt(RandomSource.create(), 1, 10) / 10),
					(entity.getLookAngle().z + Mth.nextInt(RandomSource.create(), 1, 10) / 10));
			world.addParticle(ParticleTypes.POOF, x, y, z, (entity.getLookAngle().x + Mth.nextInt(RandomSource.create(), 1, 10) / 10), (entity.getLookAngle().y + Mth.nextInt(RandomSource.create(), 1, 10) / 10),
					(entity.getLookAngle().z + Mth.nextInt(RandomSource.create(), 1, 10) / 10));
			world.addParticle(ParticleTypes.POOF, x, y, z, (entity.getLookAngle().x + Mth.nextInt(RandomSource.create(), 1, 10) / 10), (entity.getLookAngle().y + Mth.nextInt(RandomSource.create(), 1, 10) / 10),
					(entity.getLookAngle().z + Mth.nextInt(RandomSource.create(), 1, 10) / 10));
		}
	}
}
