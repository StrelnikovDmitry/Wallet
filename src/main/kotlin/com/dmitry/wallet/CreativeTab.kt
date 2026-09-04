package com.dmitry.wallet

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.text.Text

object CreativeTab {

    // creating a registry key for the tab
    val REGISTRY_KEY: RegistryKey<ItemGroup> = RegistryKey.of<ItemGroup>(RegistryKeys.ITEM_GROUP, Wallet.id("wallet_mod_tab"))

    // creating a tab
    @Suppress("UNUSED")
    val CREATIVE_TAB = Registry.register(
        Registries.ITEM_GROUP,
        REGISTRY_KEY,
        FabricItemGroup.builder()
            .icon { ItemStack(ModItems.GOLD_COIN) }
            .displayName( Text.translatable("wallet_creative_tab") )
            .build()
    )

    // initialising
    fun init() {
        ItemGroupEvents.modifyEntriesEvent(REGISTRY_KEY)
            .register { entries ->
                entries.add(ModItems.COPPER_COIN)
                entries.add(ModItems.IRON_COIN)
                entries.add(ModItems.GOLD_COIN)

                entries.add(ModItems.GREEN_CASH)
                entries.add(ModItems.BLUE_CASH)
                entries.add(ModItems.RED_CASH)

                entries.add(ModItems.WALLET)
            }
    }
}
