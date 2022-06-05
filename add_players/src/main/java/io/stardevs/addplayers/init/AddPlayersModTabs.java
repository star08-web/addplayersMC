
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevs.addplayers.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AddPlayersModTabs {
	public static CreativeModeTab TAB_ADDPLAYERSMC;

	public static void load() {
		TAB_ADDPLAYERSMC = new CreativeModeTab("tabaddplayersmc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.PLAYER_HEAD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
