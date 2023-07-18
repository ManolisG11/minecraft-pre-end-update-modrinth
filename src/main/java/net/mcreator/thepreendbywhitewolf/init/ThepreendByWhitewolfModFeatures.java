
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.thepreendbywhitewolf.world.features.ores.EnderBlockFeature;
import net.mcreator.thepreendbywhitewolf.ThepreendByWhitewolfMod;

@Mod.EventBusSubscriber
public class ThepreendByWhitewolfModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ThepreendByWhitewolfMod.MODID);
	public static final RegistryObject<Feature<?>> ENDER_BLOCK = REGISTRY.register("ender_block", EnderBlockFeature::new);
}
