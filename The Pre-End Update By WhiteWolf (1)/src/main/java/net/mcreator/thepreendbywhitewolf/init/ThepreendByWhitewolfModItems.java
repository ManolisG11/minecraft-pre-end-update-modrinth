
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thepreendbywhitewolf.item.ThePreEndItem;
import net.mcreator.thepreendbywhitewolf.item.EndFluidItem;
import net.mcreator.thepreendbywhitewolf.item.ArdaniumIngotItem;
import net.mcreator.thepreendbywhitewolf.ThepreendByWhitewolfMod;

public class ThepreendByWhitewolfModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThepreendByWhitewolfMod.MODID);
	public static final RegistryObject<Item> ENDER_INGOT = REGISTRY.register("ender_ingot", () -> new ArdaniumIngotItem());
	public static final RegistryObject<Item> TEST_SPAWN_EGG = REGISTRY.register("test_spawn_egg", () -> new ForgeSpawnEggItem(ThepreendByWhitewolfModEntities.TEST, -26368, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> ENDER_BLOCK = block(ThepreendByWhitewolfModBlocks.ENDER_BLOCK);
	public static final RegistryObject<Item> THE_PRE_END = REGISTRY.register("the_pre_end", () -> new ThePreEndItem());
	public static final RegistryObject<Item> END_FLUID_BUCKET = REGISTRY.register("end_fluid_bucket", () -> new EndFluidItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
