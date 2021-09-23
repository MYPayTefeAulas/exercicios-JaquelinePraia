package com.example.myapplicationexerciciokotlinmainactivity

class Agenda () {
    private val listaContatos = mutableListOf<Pessoa>()
    private var indiceAtul = 0

    fun salvarContato(novoContato: Pessoa){
        listaContatos.add(novoContato)
    }
    fun ImprimrNomeContato():String {
        if (indiceAtul == listaContatos.size){
            indiceAtul = 0
        }
        val contatoAtual = listaContatos[indiceAtul]
        indiceAtul++
        return "${contatoAtual.nome}"
    }
    fun ImprimirTelefone():String{
        indiceAtul-=1
        if (indiceAtul == listaContatos.size){
            indiceAtul = 0
        }
        val contatoAtual = listaContatos [indiceAtul]
        indiceAtul++
        return "${contatoAtual.telefone}"
    }

    fun deletarContato(){
        if (indiceAtul>=1) {
            indiceAtul -= 1
            val contatoAtual =  listaContatos [indiceAtul]
            listaContatos.remove(contatoAtual)
        }else {
            val contatoAtual = listaContatos[indiceAtul]
            listaContatos.remove(contatoAtual)
        }
    }
    fun retornaNumeroContatos(): Int{
        return listaContatos.size
    }
}