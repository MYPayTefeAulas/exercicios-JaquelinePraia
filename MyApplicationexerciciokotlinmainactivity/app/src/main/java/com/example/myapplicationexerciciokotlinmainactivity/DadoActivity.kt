package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityAgendaBinding
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityDadoBinding

class DadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadoBinding
    private val dado1 = Dados(4)
    private val dado2 = Dados(6)
    private val dado3 = Dados(8)
    private val dado4 = Dados(10)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btSortearDado.setOnClickListener {

            binding.txtQuantidadeDado1.text = "${dado1.numeroLados}"
            binding.txtNumeroDado1.text = dado1.lancarDado()
            binding.txtQuantidadeDado2.text = "${dado2.numeroLados}"
            binding.txtNumeroDado2.text = dado2.lancarDado()
            binding.txtQuantidadeDado3.text = "${dado2.numeroLados}"
            binding.txtNumeroDado3.text = dado4.lancarDado()
        }

        setContentView(binding.root)
    }

}