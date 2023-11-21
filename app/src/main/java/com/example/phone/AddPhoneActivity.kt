package com.example.phone

import MySharedPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.phone.Models.Phone
import com.example.phone.databinding.ActivityAddPhoneBinding

class AddPhoneActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPhoneBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_add_phone)

        MySharedPreference.init(this)

        val type = intent.getIntExtra("type",0)

        binding.btnSave.setOnClickListener {
            val name = binding.edtFoodName.text.toString().trim()
            val features = binding.edtFoodFeatures.text.toString().trim()


            if (name!="" && features!="" && type!=-1){
                val list = MySharedPreference.obektString
                list.add(Phone(type, name , features))
                MySharedPreference.obektString = list
                Toast.makeText(this,"Save" , Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}