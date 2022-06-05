/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package io.stardevlabs.addplayersfe;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import io.stardevlabs.addplayersfe.init.AddplayersFeModTabs;
import io.stardevlabs.addplayersfe.init.AddplayersFeModItems;
import io.stardevlabs.addplayersfe.init.AddplayersFeModEntities;

public class AddplayersFeMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "addplayers_fe";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing AddplayersFeMod");
		AddplayersFeModTabs.load();

		AddplayersFeModEntities.load();

		AddplayersFeModItems.load();

	}
}
