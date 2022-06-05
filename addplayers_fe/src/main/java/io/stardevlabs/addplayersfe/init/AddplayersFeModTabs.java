
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevlabs.addplayersfe.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class AddplayersFeModTabs {
	public static CreativeModeTab TAB_ADD_PLAYERS;

	public static void load() {
		TAB_ADD_PLAYERS = FabricItemGroupBuilder.create(new ResourceLocation("addplayers_fe", "add_players"))
				.icon(() -> new ItemStack(Blocks.REPEATER)).build();
	}
}
