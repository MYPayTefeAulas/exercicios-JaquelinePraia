package com.example.myapplicationteste01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationteste01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.txthello.text = "Oi"

        val view = binding.root
        setContentView(view)
    }
}