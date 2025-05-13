package com.example.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.databinding.ActivityAutenticacaoCadastralBinding

class AutenticacaoCadastralActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAutenticacaoCadastralBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutenticacaoCadastralBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnValidarCadastro.setOnClickListener {
            val nome = binding.inputNome.text.toString()
            val cpf = binding.inputCpf.text.toString()
            val endereco = binding.inputEndereco.text.toString()
            val telefone = binding.inputTelefone.text.toString()

            if (nome.isNotEmpty() && cpf.isNotEmpty() && endereco.isNotEmpty() && telefone.isNotEmpty()) {
                Toast.makeText(this, "Cadastro válido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
