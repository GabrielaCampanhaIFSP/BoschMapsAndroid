package com.example.boschmapsmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.boschmapsmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            val navegarHome = Intent(this,Home::class.java)
            startActivity(navegarHome)
        }
        binding.btnRegister.setOnClickListener{
            val navegarRegister = Intent(this,Register::class.java)
            startActivity(navegarRegister)
        }

    }
}