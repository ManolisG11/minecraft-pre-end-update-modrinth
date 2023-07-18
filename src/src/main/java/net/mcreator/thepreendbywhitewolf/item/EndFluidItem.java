
package net.mcreator.thepreendbywhitewolf.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import net.mcreator.thepreendbywhitewolf.init.ThepreendByWhitewolfModFluids;

import java.util.List;

public class EndFluidItem extends BucketItem {
	public EndFluidItem() {
		super(ThepreendByWhitewolfModFluids.END_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A Rare fluid that you can find in the Pre-End"));
	}
}
