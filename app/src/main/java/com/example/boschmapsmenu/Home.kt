package com.example.boschmapsmenu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.boschmapsmenu.databinding.ActivityHomeBinding


class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMaps.setOnClickListener{
            val navegarMaps = Intent(this,Maps::class.java)
            startActivity(navegarMaps)
        }
        binding.btnInformation.setOnClickListener{
            val navegarInformation = Intent(this,Maps::class.java)
            startActivity(navegarInformation)
        }
        binding.btnRestaurant.setOnClickListener{
            val navegarRestaurant = Intent(this,Maps::class.java)
            startActivity(navegarRestaurant)
        }
        binding.btnAboutUs.setOnClickListener{
            val navegarAboutUs = Intent(this,AboutUs::class.java)
            startActivity(navegarAboutUs)
        }

    }}
