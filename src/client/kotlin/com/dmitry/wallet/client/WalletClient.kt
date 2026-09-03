package com.dmitry.wallet.client

import com.dmitry.wallet.ModItems
import net.fabricmc.api.ClientModInitializer

object WalletClient : ClientModInitializer {
	override fun onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		ModItems.init()
	}
}