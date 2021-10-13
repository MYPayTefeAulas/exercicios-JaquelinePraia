package com.example.myapplicationexerciciokotlinmainactivity

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()
//    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvarAgenda.setOnClickListener {
            val nome = binding.txtNomeAgenda.text.toString()
            val telefone = binding.txtTelefoneAgenda.text.toString()
            val novoContato = Pessoa(nome, 0, telefone)

            if (novoContato.verificarNomeVazio() && novoContato.verificarNomeVazio()) {
//                mexer na cor
                binding.txtStatusAgenda.setTextColor((corVermelha))
                binding.txtStatusAgenda.text = "Erro, digite um nome e um telefone"
            } else if (novoContato.verificarNomeVazio()) {
                binding.txtStatusAgenda.setTextColor((corAzul))
                binding.txtStatusAgenda.text = "Erro, digite um nome"
            } else if (novoContato.verificarTelefoneVAzio()) {
                binding.txtStatusAgenda.setTextColor((corVermelha))
                binding.txtStatusAgenda.text = "Erro, digite um telefone"
            } else if (agenda.testarRepetido(novoContato)) {
                binding.txtStatusAgenda.setTextColor((corVerde))
                binding.txtStatusAgenda.text = "Este contato já existe"
            } else {
                agenda.salvarContato(novoContato)
//                binding.txtNomeAgenda.text.clear()
//                binding.txtTelefoneAgenda.text.clear()
                  binding.txtStatusAgenda.text = ""

            }
        }
        binding.btProximoAgenda.setOnClickListener {
            if (agenda.checarVazio()){
                binding.txtStatusAgenda.setTextColor((corVerde))
                binding.txtStatusAgenda.text = "Nenhum contato para imprimir"
            }else{
                binding.txtNomeAgenda.setText(agenda.ImprimrNomeContato())
                binding.txtTelefoneAgenda.setText(agenda.ImprimirTelefone())
            }
        }
        binding.btProximoAgenda.setOnClickListener {
            binding.txtNomeAgenda.setText(agenda.ImprimrNomeContato())
            binding.txtTelefoneAgenda.setText(agenda.ImprimirTelefone())
        }
        binding.btDeletarAgenda.setOnClickListener {
            if (agenda.retornaNumeroContatos() == 0) {
                binding.txtStatusAgenda.setTextColor((corVermelha))
                binding.txtStatusAgenda.text = "Não existe contato para deletar"
            } else {
                agenda.deletarContato()
                binding.txtStatusAgenda.setTextColor((corAzul))
                binding.txtStatusAgenda.text = "Contato deletado"
            }
        }
        binding.btPesquisarAgenda.setOnClickListener() {
            val nomePesquisar = binding.txtBarraPesquisaAgenda.text.toString()
            val pessoaPesquisar = Pessoa(nomePesquisar, 0, "")
            if (agenda.checarVazio()){
                binding.txtStatusAgenda.setTextColor((corVermelha))
                binding.txtStatusAgenda.text = "Erro, nenhum  contato salvo"
//                !testa se é falso, ou == false
            }else if (!agenda.pesquisarContato(pessoaPesquisar)){
                binding.txtStatusAgenda.setTextColor((corVermelha))
                binding.txtStatusAgenda.text = "Contato não encontrado"
            } else {
                binding.txtStatusAgenda.setTextColor((corAzul))
                binding.txtStatusAgenda.text = "Contato Encontrado"
                binding.txtNomeAgenda.setText(agenda.imprimirNomeContatoPesquisa(pessoaPesquisar))
                binding.txtTelefoneAgenda.setText(agenda.imprimirTelefoneContatoPesquisa(pessoaPesquisar))
            }
        }

        setContentView(binding.root)
    }
    companion object {
        val corVermelha : Int = Color.rgb(212,12,12)
        val corVerde : Int = Color.rgb(12,212,12)
        var corAzul : Int = Color.rgb(12,12,212)
    }
}

