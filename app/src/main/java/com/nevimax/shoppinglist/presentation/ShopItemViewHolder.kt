package com.nevimax.shoppinglist.presentation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nevimax.shoppinglist.R

class ShopItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val textViewName = view.findViewById<TextView>(R.id.textView_name)
    val textViewCount = view.findViewById<TextView>(R.id.textView_count)
}