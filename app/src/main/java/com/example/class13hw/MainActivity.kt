package com.example.class13hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import com.example.class13hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId==binding.btn1.id){
                Toast.makeText(this, " "+binding.btn1.text, Toast.LENGTH_SHORT).show()
            }
            else if (checkedId == binding.btn2.id){
                Toast.makeText(this, " "+binding.btn2.text, Toast.LENGTH_SHORT).show()
            }
            else if (checkedId == binding.btn3.id){
                Toast.makeText(this, " "+binding.btn3.text, Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, " "+binding.btn4.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}