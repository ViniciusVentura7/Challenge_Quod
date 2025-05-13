package com.example.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.databinding.ActivityScoreAntifraudeBinding
import kotlin.random.Random

class ScoreAntifraudeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScoreAntifraudeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreAntifraudeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConsultarScore.setOnClickListener {
            val cpf = binding.inputCpfScore.text.toString()
            if (cpf.isNotEmpty()) {
                val score = Random.nextInt(1, 1001)
                val risco = when {
                    score > 800 -> "Baixo risco de fraude"
                    score > 500 -> "Risco médio"
                    else -> "Alto risco de fraude"
                }
                binding.resultadoScore.text = "Score: $score\n$risco"
            } else {
                Toast.makeText(this, "Informe o CPF para consultar.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
