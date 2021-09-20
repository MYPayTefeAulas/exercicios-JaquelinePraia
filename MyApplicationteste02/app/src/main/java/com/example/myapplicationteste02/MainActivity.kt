package com.example.myapplicationteste02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationteste02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.txthello.text = "Oi,\nsou Jaqueline!"
       val view = binding.root
        setContentView(view)
    }

}