
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.stardevlabs.addplayersfe.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import io.stardevlabs.addplayersfe.entity.SteveEntity;
import io.stardevlabs.addplayersfe.entity.AlexEntity;
import io.stardevlabs.addplayersfe.AddplayersFeMod;

public class AddplayersFeModEntities {
	public static EntityType<AlexEntity> ALEX;
	public static EntityType<SteveEntity> STEVE;

	public static void load() {
		ALEX = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AddplayersFeMod.MODID, "alex"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, AlexEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true))
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		AlexEntity.init();
		FabricDefaultAttributeRegistry.register(ALEX, AlexEntity.createAttributes());
		STEVE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AddplayersFeMod.MODID, "steve"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SteveEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true))
						.trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SteveEntity.init();
		FabricDefaultAttributeRegistry.register(STEVE, SteveEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1)
				.trackedUpdateRate(64).build();
	}
}
