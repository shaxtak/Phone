package com.example.phone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phone.Utils.MyData
import com.example.phone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn2.setOnClickListener {
            loadData()
            val intent = Intent(this, AddPhoneListActivity::class.java)
            startActivity(intent)
        }
        binding.btn1.setOnClickListener {
            val intent = Intent(this, MenuGridActivity::class.java)
            startActivity(intent)
        }

    }

    private fun loadData() {
        MyData.typelistname.add("iPhone")
        MyData.typelistname.add("Samsung")
        MyData.typelistname.add("Mi")
        MyData.typelistname.add("Sony")
        MyData.typelistname.add("Huawei")
        MyData.typelistname.add("Artel")
    }
}