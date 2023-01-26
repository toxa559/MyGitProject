package com.shchipanovanton.mygitproject.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItemUseCase(shopItem: ShopItem)
    fun getShopItem(shopItemId : Int): ShopItem
    fun getShopList(): List<ShopItem>

}