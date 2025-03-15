
package net.mcreator.ismeargavno.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.ismeargavno.init.IsmeargavnoModItems;
import net.mcreator.ismeargavno.init.IsmeargavnoModFluids;
import net.mcreator.ismeargavno.init.IsmeargavnoModFluidTypes;
import net.mcreator.ismeargavno.init.IsmeargavnoModBlocks;

public abstract class PotatoWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> IsmeargavnoModFluidTypes.POTATO_WATER_TYPE.get(), () -> IsmeargavnoModFluids.POTATO_WATER.get(),
			() -> IsmeargavnoModFluids.FLOWING_POTATO_WATER.get()).explosionResistance(100f).bucket(() -> IsmeargavnoModItems.POTATO_WATER_BUCKET.get()).block(() -> (LiquidBlock) IsmeargavnoModBlocks.POTATO_WATER.get());

	private PotatoWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PotatoWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PotatoWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
