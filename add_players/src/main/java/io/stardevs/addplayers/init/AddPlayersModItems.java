
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevs.addplayers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AddPlayersModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ALEX = register(
			new SpawnEggItem(AddPlayersModEntities.ALEX, -3355444, -16711885, new Item.Properties().tab(AddPlayersModTabs.TAB_ADDPLAYERSMC))
					.setRegistryName("alex_spawn_egg"));
	public static final Item STEVE = register(
			new SpawnEggItem(AddPlayersModEntities.STEVE, -10053121, -16737895, new Item.Properties().tab(AddPlayersModTabs.TAB_ADDPLAYERSMC))
					.setRegistryName("steve_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
