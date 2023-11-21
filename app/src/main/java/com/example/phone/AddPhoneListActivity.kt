package com.example.phone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phone.Models.ItemGridOnclick
import com.example.phone.Models.TypeAdapter
import com.example.phone.Utils.MyData
import com.example.phone.databinding.ActivityPhoneListBinding

class AddPhoneListActivity : AppCompatActivity() {
    private lateinit var typeAdapter: TypeAdapter
    private lateinit var binding: ActivityPhoneListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneListBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_phone_list)
        typeAdapter = TypeAdapter(this, MyData.typelistname, object : ItemGridOnclick {
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@AddPhoneListActivity, AddPhoneActivity::class.java)
                intent.putExtra("type", position)
                startActivity(intent)
            }

        })
        binding.listPhones.adapter = typeAdapter
    }
}