package com.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.databinding.ActivityBiometriaFacialBinding

class BiometriaFacialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiometriaFacialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiometriaFacialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCaptureFace.setOnClickListener {
            // Simulação de captura de biometria facial
            Toast.makeText(this, "Biometria Facial Capturada", Toast.LENGTH_SHORT).show()
        }
    }
}
