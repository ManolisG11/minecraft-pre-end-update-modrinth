
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thepreendbywhitewolf.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThepreendByWhitewolfModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ThepreendByWhitewolfModItems.TEST_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ThepreendByWhitewolfModItems.ENDER_INGOT.get());
		}

		if (tabData.getTab() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(ThepreendByWhitewolfModItems.END_FLUID_BUCKET.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ThepreendByWhitewolfModBlocks.ENDER_BLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ThepreendByWhitewolfModItems.THE_PRE_END.get());
		}
	}
}
