package com.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.R
import com.quodantifraude.databinding.ActivityAnaliseDocumentoBinding

class AnaliseDocumentoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnaliseDocumentoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnaliseDocumentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCaptureDocument.setOnClickListener {
            // Simulação de captura de documento
            Toast.makeText(this, "Documento Capturado e Validado", Toast.LENGTH_SHORT).show()
        }
    }
}
