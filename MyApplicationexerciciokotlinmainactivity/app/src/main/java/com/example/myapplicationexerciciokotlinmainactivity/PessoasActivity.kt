package com.example.myapplicationexerciciokotlinmainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding
    private var nome = ""
    private var idade = 0

    private val listaPessoas  = mutableListOf<Pessoa>()
    private  var indiceAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btImprimirPessoa.setOnClickListener {
            binding.txtSaidaPessoa.text = imprimePessoa()
        }
        binding.btSalvarPessoa.setOnClickListener {
            nome = binding.txtNomePessoa.text.toString()
            binding.txtNomePessoa.text.clear()
            idade = binding.txtIdadePessoa.text.toString().toInt()
            binding.txtIdadePessoa.text.clear()

            val pessoa = Pessoa ("", 0,telefone = null)
            listaPessoas.add(pessoa)
        }
        setContentView(binding.root)
    }
    fun imprimePessoa(): String{
        if (indiceAtual>= listaPessoas.size)
            indiceAtual = 0
        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual ++
        return "Nome: ${pessoaAtual.nome} , Idade: ${pessoaAtual.idade}"
    }
}