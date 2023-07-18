
package net.mcreator.thepreendbywhitewolf.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModFluids;

public class EndFluidBlock extends LiquidBlock {
	public EndFluidBlock() {
		super(() -> ThepreendByWhitewolfModFluids.END_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).lightLevel(s -> 5).noCollission().noLootTable());
	}
}
