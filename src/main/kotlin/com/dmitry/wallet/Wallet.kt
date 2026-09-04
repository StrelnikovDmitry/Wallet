package com.dmitry.wallet

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object Wallet : ModInitializer {
	const val MOD_ID: String = "wallet"

	private val LOGGER = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initialising wallet mod...")

		LOGGER.info("Initializing items...")
		ModItems.init()
		LOGGER.info("Items initialized successfully")

		LOGGER.info("Initializing creative tab...")
		CreativeTab.init()
		LOGGER.info("Creative tab initialized successfully")

		LOGGER.info("Wallet mod initialized successfully")
	}

	fun id(path: String): Identifier = Identifier(MOD_ID, path)
}
