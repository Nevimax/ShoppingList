package com.nevimax.shoppinglist.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.nevimax.shoppinglist.R
import com.nevimax.shoppinglist.domain.ShopItem

class ShopListAdapter : RecyclerView.Adapter<ShopListAdapter.ShopItemViewHolder>() {

    var shopList = listOf<ShopItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_shop_enabled,
            parent,
            false
        )
        return ShopItemViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ShopItemViewHolder, position: Int) {
        val shopItem = shopList[position]
        val status = if(shopItem.enabled){"Active"}else{"Not active"}

        viewHolder.view.setOnLongClickListener {
            true
        }
        if(shopItem.enabled){
            viewHolder.textViewName.text = "${shopItem.name} $status"
            viewHolder.textViewCount.text = shopItem.count.toString()
            viewHolder.textViewName.setTextColor(ContextCompat.getColor(viewHolder.view.context, android.R.color.holo_red_dark))
        }
    }

    override fun getItemCount(): Int {
        return shopList.size
    }

    class ShopItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textViewName = view.findViewById<TextView>(R.id.textView_name)
        val textViewCount = view.findViewById<TextView>(R.id.textView_count)
    }
}