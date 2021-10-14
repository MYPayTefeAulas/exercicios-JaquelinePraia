package com.example.myapplicationexerciciokotlinmainactivity

class Dados(val numeroLados : Int)  {
    private  var qtdLados = mutableListOf<Int>()
    private var i = 1

    fun lancarDado (): String{
//        o sortei começa apartir do número de lados/

        while (i <= numeroLados){
            qtdLados.add(i)
            i++
        }
//        shuffled embaralha e se não tivesse first deixaria tudo embaralhado /E first ele retorna pro primeiro
        return "${qtdLados.shuffled().first()}"
    }
}