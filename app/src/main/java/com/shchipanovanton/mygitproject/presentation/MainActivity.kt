package com.shchipanovanton.mygitproject.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import com.shchipanovanton.mygitproject.R
import com.shchipanovanton.mygitproject.domain.ShopItem

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var llShopList: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llShopList = findViewById(R.id.ll_shop_list)
        viewModel= ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this){
            showList(it)
        }
    }


    private fun showList(list: List<ShopItem>){
        for (shopItem in list){
            val layoutId = if (shopItem.enabled) {
            R.layout.item_shop_enabled
            } else {
                R.layout.item_shop_disable
            }
            val view= LayoutInflater.from(this).inflate(layoutId,llShopList,false)
            llShopList.addView(view)
        }
    }
}