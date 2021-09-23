package com.example.myapplicationexerciciokotlinmainactivity.Greeter

class GreeterTipo2 {
    val cumprimento: String
    constructor(cumprimento: String){
        this.cumprimento = cumprimento
    }
    fun greet(nome: String): String{
        val cumprimentoCompleto = "$cumprimento $nome"
        return cumprimentoCompleto
    }
}