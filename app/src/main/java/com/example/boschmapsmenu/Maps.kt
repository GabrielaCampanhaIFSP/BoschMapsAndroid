package com.example.boschmapsmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.boschmapsmenu.databinding.ActivityHomeBinding
import com.example.boschmapsmenu.databinding.ActivityMapsBinding

class Maps: AppCompatActivity() {
    private lateinit var binding: ActivityMapsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener{
            val navegarHome = Intent(this,Home::class.java)
            startActivity(navegarHome)
        }
    }
}