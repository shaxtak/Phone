package com.example.phone

import MySharedPreference
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.example.phone.Adapter.ItemClickListPhones
import com.example.phone.Adapter.PhoneListAdapter
import com.example.phone.Models.Phone
import com.example.phone.databinding.ActivityPhoneListBinding

class PhoneListActivity : AppCompatActivity() {
    private lateinit var phoneListAdapter: PhoneListAdapter
    private lateinit var binding: ActivityPhoneListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneListBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_phone_list)

        val type = intent.getIntExtra("type", -1)

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString

        var listSort = ArrayList<Phone>()


        for (phone in list){
            if (phone.type == type){
                listSort.add(phone)
            }
        }

        phoneListAdapter = PhoneListAdapter(this, listSort, object : ItemClickListPhones{
            override fun onClick(phone: Phone, position: Int) {

            }

        })
        binding.listPhones.adapter = phoneListAdapter
    }
}