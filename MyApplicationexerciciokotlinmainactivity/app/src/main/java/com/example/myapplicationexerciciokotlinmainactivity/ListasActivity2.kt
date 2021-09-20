package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityListas2Binding
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityMainBinding

class ListasActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityListas2Binding

    private  val listasfrutas = listOf("maçã", "mamão", "abacate", "uva")
    private val listasvegatais = listOf( "pepino", "alface", "pimentão", "cebola")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListas2Binding.inflate (layoutInflater)
        binding.btAnalisar.setOnClickListener {
            binding.txtSaida.text = analisar(binding.txtEntrada.text.toString())
        }
        setContentView(binding.root)

    }
    fun analisar(entrada: String):String{
        var saida = ""

//        var  encontrouAlimento = false

        for (fruta in listasfrutas){
            if (fruta == entrada) {
                saida = "É uma fruta"
//                encontrouAlimento = true
            }
            break
        }
        for (vegetal in listasvegatais){
            if ( vegetal == entrada){
                saida ="E um vegetal"
//                encontrouAlimento = true
            }
            break
        }
//        if (encontrouAlimento){
//            saida = "Não sei o que é isso!"
//        }

        return saida
    }

}