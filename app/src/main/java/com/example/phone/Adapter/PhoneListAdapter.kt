package com.example.phone.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.phone.Models.Phone
import com.example.phone.R

class PhoneListAdapter(context: Context, val list: ArrayList<Phone>, var itemClickListPhones: ItemClickListPhones) :ArrayAdapter<Phone>(context, R.layout.item_phone_list,list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View
        if (convertView!=null){
            itemView=convertView
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_phone_list,parent,false)
        }
        itemView.findViewById<TextView>(R.id.txt_item_phones).text = list[position].toString()
        itemView.findViewById<CardView>(R.id.card_item_phone).setOnClickListener{
            itemClickListPhones.onClick(list[position], position)
        }
        return itemView

    }


}
interface ItemClickListPhones{
    fun onClick(phone: Phone, position: Int)
}