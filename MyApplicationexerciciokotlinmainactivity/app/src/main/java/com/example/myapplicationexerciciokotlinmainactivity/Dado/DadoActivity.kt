package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityAgendaBinding
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityDadoBinding

class DadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadoBinding

    private val dado1 = Dados(4)
    private val dado2 = Dados(6)
    private val dado3 = Dados(8)
    private val dado4 = Dados(10)
//
    private var indice1 = 0
    private var indice2 = 0
    private var indice3 = 0

    private val listaDados = mutableListOf<Dados>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityDadoBinding.inflate(layoutInflater)

        listaDados.add(dado1)
        listaDados.add(dado2)
        listaDados.add(dado3)
        listaDados.add(dado4)

        setTitle("Sorteio de Dado")

        binding.btSortearDado.setOnClickListener {
//            variavel listaDados = [0, 1, 2, 3]
//            [dado1, dado2,dado3, dado4
//
            binding.txtQuantidadeDado1.text = "${listaDados[indice1].numeroLados}"
            binding.txtNumeroDado1.text = listaDados[indice1].lancarDado()

            binding.txtQuantidadeDado2.text = "${listaDados[indice2].numeroLados}"
            binding.txtNumeroDado2.text = listaDados[indice2].lancarDado()

            binding.txtQuantidadeDado3.text = "${listaDados[indice3].numeroLados}"
            binding.txtNumeroDado3.text = listaDados[indice3].lancarDado()

            Toast.makeText(this, "Sorteio Realizado!", Toast.LENGTH_SHORT).show()
        }
        binding.btUmDado.setOnClickListener {
              indice1++
            if (indice1 == listaDados.size)
                indice1 = 0
            binding.txtQuantidadeDado1.text= "${listaDados[indice1].numeroLados}"
        }
        binding.btDoisDado.setOnClickListener {
            indice2++
            if (indice2 == listaDados.size)
                indice2 = 0
            binding.txtQuantidadeDado2.text = "${listaDados[indice2].numeroLados}"
        }
        binding.btTresDado.setOnClickListener {
            indice3++
            if (indice3 == listaDados.size)
                indice3= 0
            binding.txtQuantidadeDado3.text = "${listaDados[indice3].numeroLados}"
        }
        setContentView(binding.root)
    }

}