package com.example.phone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phone.Models.ItemGridOnclick
import com.example.phone.Models.TypeAdapter
import com.example.phone.Utils.MyData
import com.example.phone.databinding.ActivityMenuGridBinding

class MenuGridActivity : AppCompatActivity() {
    lateinit var typeAdapter: TypeAdapter
    lateinit var binding: ActivityMenuGridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuGridBinding.inflate(layoutInflater)
        setContentView(binding.root)


        typeAdapter = TypeAdapter(this, MyData.typelistname, object : ItemGridOnclick {
            override fun onClick(type: String, position: Int) {
            val intent = Intent(this@MenuGridActivity, PhoneListActivity::class.java)
                intent.putExtra("type", position)
                startActivity(intent)
            }
        })
        binding.gridView.adapter = typeAdapter
    }
}