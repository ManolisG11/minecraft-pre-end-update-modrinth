
package net.mcreator.thepreendbywhitewolf.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModItems;
import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModFluids;
import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModFluidTypes;
import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModBlocks;

public abstract class EndFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ThepreendByWhitewolfModFluidTypes.END_FLUID_TYPE.get(), () -> ThepreendByWhitewolfModFluids.END_FLUID.get(),
			() -> ThepreendByWhitewolfModFluids.FLOWING_END_FLUID.get()).explosionResistance(100f).levelDecreasePerBlock(2).bucket(() -> ThepreendByWhitewolfModItems.END_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) ThepreendByWhitewolfModBlocks.END_FLUID.get());

	private EndFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EndFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EndFluidFluid {
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
