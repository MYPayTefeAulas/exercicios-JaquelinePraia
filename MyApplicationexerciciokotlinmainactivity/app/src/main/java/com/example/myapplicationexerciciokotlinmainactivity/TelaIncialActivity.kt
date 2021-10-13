package com.example.myapplicationexerciciokotlinmainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.Greeter.GreeterActivity
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityTelaIncialBinding

class TelaIncialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaIncialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaIncialBinding.inflate(layoutInflater)
        binding.btAbrirExListas.setOnClickListener {
            val intent = Intent(this@TelaIncialActivity, ListasActivity2::class.java)
            startActivity(intent)
        }
        binding.btAbrirExPessoas.setOnClickListener {
            val intent = Intent(this, PessoasActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirExGreeter.setOnClickListener {
            val intent = Intent(this, GreeterActivity::class.java)
            startActivity(intent)
        }
        binding.btAgenda.setOnClickListener{
            val intent = Intent(this,AgendaActivity:: class.java)
            startActivity(intent)
        }
        binding.btAgenda.setOnClickListener{
            val intent = Intent(this,DadoActivity :: class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}



