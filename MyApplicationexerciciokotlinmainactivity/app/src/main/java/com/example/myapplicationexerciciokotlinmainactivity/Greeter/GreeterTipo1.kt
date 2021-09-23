package com.example.myapplicationexerciciokotlinmainactivity.Greeter

//declara o atributo enquanto cria construtor nos parenteses

class GreeterTipo1 (val cumprimento: String){
// método greet que estara presente emtodo os greters
//  lembre de carro: a acelerador é igual para todos os carros
//
//    o conteúdo de "cumprimento" caria entre os diferentes greeter
//    cumprimento + nome
    fun greet(nome: String): String{
        val cumprimentoCompleto = "$cumprimento $nome"
        return cumprimentoCompleto
    }
}