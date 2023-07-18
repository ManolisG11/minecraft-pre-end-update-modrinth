
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.thepreendbywhitewolf.fluid.types.EndFluidFluidType;
import net.mcreator.thepreendbywhitewolf.ThepreendByWhitewolfMod;

public class ThepreendByWhitewolfModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ThepreendByWhitewolfMod.MODID);
	public static final RegistryObject<FluidType> END_FLUID_TYPE = REGISTRY.register("end_fluid", () -> new EndFluidFluidType());
}
