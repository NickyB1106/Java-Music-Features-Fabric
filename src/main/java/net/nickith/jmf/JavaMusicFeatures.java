package net.nickith.jmf;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.nickith.jmf.block.ModBlocks;
import net.nickith.jmf.item.ModItems;
import net.nickith.jmf.stat.ModStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaMusicFeatures implements ModInitializer {
	public static final String MOD_ID = "jmf";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModStats.registerStats();

	}
	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
