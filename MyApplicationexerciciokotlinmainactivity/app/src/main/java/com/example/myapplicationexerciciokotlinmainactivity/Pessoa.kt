package com.example.myapplicationexerciciokotlinmainactivity

class Pessoa(val nome: String, val idade: Int, val telefone: String? = null) {
    fun verificarNomeVazio () : Boolean {
        return nome == ""
        }
    fun verificarTelefoneVAzio() : Boolean{
        return telefone == ""
    }
}
