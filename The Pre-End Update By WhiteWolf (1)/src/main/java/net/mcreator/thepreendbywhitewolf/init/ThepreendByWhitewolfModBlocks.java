
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thepreendbywhitewolf.block.ThePreEndPortalBlock;
import net.mcreator.thepreendbywhitewolf.block.EnderBlockBlock;
import net.mcreator.thepreendbywhitewolf.block.EndFluidBlock;
import net.mcreator.thepreendbywhitewolf.ThepreendByWhitewolfMod;

public class ThepreendByWhitewolfModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThepreendByWhitewolfMod.MODID);
	public static final RegistryObject<Block> ENDER_BLOCK = REGISTRY.register("ender_block", () -> new EnderBlockBlock());
	public static final RegistryObject<Block> THE_PRE_END_PORTAL = REGISTRY.register("the_pre_end_portal", () -> new ThePreEndPortalBlock());
	public static final RegistryObject<Block> END_FLUID = REGISTRY.register("end_fluid", () -> new EndFluidBlock());
}
