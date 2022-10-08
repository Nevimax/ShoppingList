package com.nevimax.shoppinglist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.nevimax.shoppinglist.domain.ShopItem

class ShopitemDiffCallback : DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }
}