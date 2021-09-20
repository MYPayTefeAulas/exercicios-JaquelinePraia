package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGreeterBinding
    private  val listaNomes = mutableListOf<String>()
    private  var indiceAtual = 0
    private lateinit var greeterAtual: GreeterTipo1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeterBinding.inflate(layoutInflater)
//
//        -----------------------------------------------------------
//        Configuração de variaveis "globais da tela

        val greeter1 = GreeterTipo1("Óla,")
        val greeter2 = GreeterTipo1("Bem vindo,")
//        Inicialização do greete Atual
        greeterAtual= greeter1
//        listaNomes.add(Pessoa("João", 40))
        listaNomes.add("Rodrigo")
        listaNomes.add("Alex")
        listaNomes.add("Robert")
//        -----------------------------------------------------------
//        configuração dos botões

        binding.btImprimirProximo.setOnClickListener {
            val nomeAtual = listaNomes[indiceAtual]
//            binding.txtSaida.text = greeterAtual.greet(Pessoa)
            binding.txtSaida.text = greeterAtual.greet(nomeAtual)

//            when (greeterAtual){
//                1-> binding.txtSaida.text = greeter1.greet(nomeAtual)
//                2-> binding.txtSaida.text = greeter2.greet(nomeAtual)}

            if (indiceAtual == listaNomes.size - 1){
                indiceAtual = 0
            }else {
                indiceAtual ++
            }
        }
       binding.btTrocar.setOnClickListener {
           if (greeterAtual == greeter1){
               greeterAtual = greeter2
               binding.txtNumGreeter.text = "2"
           }else {
                   greeterAtual = greeter1
                   binding.txtNumGreeter.text = "1"

               }
           }
        setContentView(binding.root)
    }
}