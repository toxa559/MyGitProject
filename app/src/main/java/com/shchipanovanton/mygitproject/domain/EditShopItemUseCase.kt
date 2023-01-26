package com.shchipanovanton.mygitproject.domain

class EditShopItemUseCase (private val shopListRepository: ShopListRepository) {
    fun editShopItemUseCase(shopItem: ShopItem){
        shopListRepository.editShopItemUseCase(shopItem)
    }
}