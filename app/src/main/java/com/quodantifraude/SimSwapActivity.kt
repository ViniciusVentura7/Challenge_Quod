package com.example.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.databinding.ActivitySimswapBinding

class SimSwapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySimswapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimswapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerificarSimSwap.setOnClickListener {
            val cpf = binding.inputCpfSim.text.toString()

            if (cpf.isNotEmpty()) {
                // Simulação do endpoint
                val resultadoSimulado = listOf(true, false).random()
                if (resultadoSimulado) {
                    Toast.makeText(this, "Sem indício de troca recente de chip.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Alerta: troca de chip recente detectada!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Informe o CPF.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
