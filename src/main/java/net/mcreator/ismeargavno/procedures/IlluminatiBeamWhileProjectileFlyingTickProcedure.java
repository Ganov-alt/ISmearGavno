package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class IlluminatiBeamWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SPIT, x, y, z, 0, 0, 0);
	}
}
