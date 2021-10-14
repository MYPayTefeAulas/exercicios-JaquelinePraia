package com.example.myapplicationexerciciokotlinmainactivity

class Agenda () {
    private val listaContatos = mutableListOf<Pessoa>()
    private var indiceAtul = 0

    fun salvarContato(novoContato: Pessoa) {
        listaContatos.add(novoContato)
    }

    fun ImprimrNomeContato(): String {
        if (indiceAtul == listaContatos.size)
            indiceAtul = 0
        val contatoAtual = listaContatos[indiceAtul]
        indiceAtul++
        return "${contatoAtual.nome}"
    }

    fun ImprimirTelefone(): String {
        indiceAtul -= 1
        if (indiceAtul == listaContatos.size)
            indiceAtul = 0
        val contatoAtual = listaContatos[indiceAtul]
        indiceAtul++
        return "${contatoAtual.telefone}"
    }

    fun deletarContato() {
        if (indiceAtul >= 1) {
            indiceAtul -= 1
            val contatoAtual = listaContatos[indiceAtul]
            listaContatos.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos[indiceAtul]
            listaContatos.remove(contatoAtual)
        }
    }

    fun retornaNumeroContatos(): Int {
        return listaContatos.size
    }

    fun existeTelefone(telefone: String): Boolean {
        for (contato in listaContatos) {
            if (contato.telefone == telefone)
                return true
        }
        return false
    }

    //    size é conta meu número de elementos, tem a função de checar se tem elementos usando x
//    fun checarVazio():Int{
//        var x = 1
//        if ( listaContatos.size == 0) x = 1
//        return x
//    }
//    isEmpty ela verifica se está vazia, isso é possível ao boolean
    fun checarVazio(): Boolean {
        return listaContatos.isEmpty()
    }

    //    testa pra saber se existe a pessoa ou não por isso boolean e
//    quando você usar o For quer varrer isso significa que ela vai contar
//    desde o começo break quebra o laço, ou seja, faz parar.
    fun testarRepetido(contato: Pessoa): Boolean {
        var resultado: Boolean = false
        for (lista in listaContatos) {
            if (lista.telefone == contato.telefone) {
                resultado = true
                break
            }
        }
        return resultado
    }

    fun pesquisarContato(contato: Pessoa): Boolean {
        var encontrou: Boolean = false
        for (lista in listaContatos) {
            if (lista.nome == contato.nome) {
                encontrou = true
                break
            }
        }
        return encontrou
    }

    //    String porque é nome que queremos achar
    fun imprimirNomeContatoPesquisa(contato: Pessoa): String {
        var encontrou: String = ""
        for (lista in listaContatos) {
            if (lista.nome == contato.nome) {
                encontrou = lista.nome
                break
            }
        }
        return encontrou
    }
    fun imprimirTelefoneContatoPesquisa(contato: Pessoa): String {
        var encontrou: String = ""
        for (lista in listaContatos) {
//            aqui usa nome porque estamos pesquisando pelo nome
                if (lista.nome == contato.nome) {
                encontrou = lista.telefone.toString()
                break
            }
        }
        return encontrou
    }

}