package com.nevimax.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nevimax.shoppinglist.R
import com.nevimax.shoppinglist.domain.ShopItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_shop_enabled.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ShopListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            adapter.shopList = it

        }
    }

    private fun setupRecyclerView() {
        adapter = ShopListAdapter()
        recyclerView_shopList.adapter = adapter
    }
}