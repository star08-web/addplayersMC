
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevlabs.addplayersfe.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import io.stardevlabs.addplayersfe.AddplayersFeMod;

public class AddplayersFeModItems {
	public static Item ALEX;
	public static Item STEVE;

	public static void load() {
		ALEX = Registry.register(Registry.ITEM, new ResourceLocation(AddplayersFeMod.MODID, "alex_spawn_egg"),
				new SpawnEggItem(AddplayersFeModEntities.ALEX, -1, -26368, new Item.Properties().tab(AddplayersFeModTabs.TAB_ADD_PLAYERS)));
		STEVE = Registry.register(Registry.ITEM, new ResourceLocation(AddplayersFeMod.MODID, "steve_spawn_egg"),
				new SpawnEggItem(AddplayersFeModEntities.STEVE, -13395457, -3355444, new Item.Properties().tab(AddplayersFeModTabs.TAB_ADD_PLAYERS)));
	}
}
