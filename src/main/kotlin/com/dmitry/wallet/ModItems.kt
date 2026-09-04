package com.dmitry.wallet

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

object ModItems {
    val COPPER_COIN: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("copper_coin"),
        Item(FabricItemSettings())
    )
    val IRON_COIN: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("iron_coin"),
        Item(FabricItemSettings())
    )
    val GOLD_COIN: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("gold_coin"),
        Item(FabricItemSettings())
    )

    val GREEN_CASH: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("green_cash"),
        Item(FabricItemSettings())
    )
    val RED_CASH: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("red_cash"),
        Item(FabricItemSettings())
    )
    val BLUE_CASH: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("blue_cash"),
        Item(FabricItemSettings())
    )

    val WALLET: Item = Registry.register(
        Registries.ITEM,
        Wallet.id("wallet"),
        Item(FabricItemSettings().maxCount(1))
    )

    fun init() {}
}