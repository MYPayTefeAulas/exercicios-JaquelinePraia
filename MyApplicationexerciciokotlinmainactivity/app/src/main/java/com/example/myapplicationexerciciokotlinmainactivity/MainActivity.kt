package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btTrocar.setOnClickListener {
//            binding.txtHello.text = novotexto()
//            binding.txtHello.text = textoDaEntrada()
//            binding.txtHello.text = calculardobro()
//            binding.txtHello.text = multiplicar()
//            binding.txtHello.text = calcular()
            binding.txtHello.text = calcularComWhen()
        }
        setContentView(binding.root)
    }
    fun novotexto(): String{
        return "novo texto de função"
    }

    fun textoDaEntrada(): String{
        return binding.txtNumero2.text.toString()
    }

    fun calculardobro() {
//        forma numero um de fazer o dobro
//        val numeroStr = binding.txtNumero2.text.toString()
//        val numero = numeroStr.toInt()
//        val numeroBobro = numero * 2
//        return numeroBobro.toString()
//        forma numero dois de fazer dobro
//        val numero = binding.txtEntrada.text.toString().toInt()
//        return (numero * 2).toString()
//        forma numero tres de fazer o dobro
//        val numeroStr = binding.txtEntrada.text.toString()
//        val numero = numeroStr.toInt() * 2
//        return numero.toString()
    }

    fun multiplicar(): String {
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        val result = numero1 * numero2
        return result.toString()
    }

    fun calcular() : String {
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        var resultadoStr = ""
        if (operacao == "+") {
            resultadoStr = (numero1 + numero2).toString()
        }else if (operacao == "-"){
            resultadoStr = (numero1 - numero2).toString()
        }else {
            resultadoStr = "operação não suportada"
        }
        return resultadoStr.toString()

    }

    fun calcularComWhen() : String {
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1.text.toString().toDouble()
        val numero2 = binding.txtNumero2.text.toString().toDouble()
        var resultadoStr = ""
        when (operacao) {
            "+"-> resultadoStr = (numero1 + numero2).toString()
            "-"-> resultadoStr = (numero1 - numero2). toString()
            "*" -> resultadoStr = (numero1 * numero2).toString()
            "/"->resultadoStr = (numero1 / numero2).toString()
            else -> resultadoStr = "Operação não suportada"

        }
        return resultadoStr.toString()

    }

}