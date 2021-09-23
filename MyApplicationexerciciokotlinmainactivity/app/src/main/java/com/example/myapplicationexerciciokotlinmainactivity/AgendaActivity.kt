package com.example.myapplicationexerciciokotlinmainactivity

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationexerciciokotlinmainactivity.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvarAgenda.setOnClickListener {
            val nome = binding.txtEntradaNomeAgenda.text.toString()
            val telefone = binding.txtEntradaTelefoneAgenda.text.toString()
            val novoContato = Pessoa(nome, idade = 0, telefone)
            agenda.salvarContato(novoContato)

            binding.btProximoAgenda.setOnClickListener {
                binding.txtEntradaNomeAgenda.setText(agenda.ImprimrNomeContato())
                binding.txtEntradaTelefoneAgenda.setText(agenda.ImprimirTelefone())
              binding.txtEntradaTelefoneAgenda.text = "Nenhum contato salvo"
            }
            binding.btDeletarAgenda.setOnClickListener {
                if (agenda.retornaNumeroContatos() == 0) {
                    binding.txtStatusAgenda.setTextColor(Color.rgb(212, 12, 12))
                    binding.txtStatusAgenda.text = "Agenda vazia"
                } else agenda.deletarContato()
            }
            setContentView(binding.root)
        }
    }
}