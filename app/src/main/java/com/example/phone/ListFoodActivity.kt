package com.example.phone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phone.databinding.ActivityListFoodBinding

class ListFoodActivity : AppCompatActivity() {
    lateinit var binding: ActivityListFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}