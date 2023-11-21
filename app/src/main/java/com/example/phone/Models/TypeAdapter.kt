package com.example.phone.Models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.phone.R

class TypeAdapter(context:Context, val list:List<String>, val itemGridOnclick: ItemGridOnclick):ArrayAdapter<String>(context, R.layout.item_grid, list ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView: View
        if (convertView != null) {
            itemView = convertView
        } else {
            itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        }
        itemView.findViewById<TextView>(R.id.txt_item_grid).text = list[position]
        itemView.findViewById<CardView>(R.id.card_item).setOnClickListener {
            itemGridOnclick.onClick(list[position],position)
        }

        return itemView
    }

}
interface ItemGridOnclick{
    fun onClick(type:String, position: Int)
}