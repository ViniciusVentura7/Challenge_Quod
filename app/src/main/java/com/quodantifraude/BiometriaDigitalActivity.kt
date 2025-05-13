package com.quodantifraude

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.quodantifraude.databinding.ActivityBiometriaDigitalBinding



class BiometriaDigitalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiometriaDigitalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiometriaDigitalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCaptureFingerprint.setOnClickListener {
            Toast.makeText(this, "Biometria Digital Capturada", Toast.LENGTH_SHORT).show()
        }
    }
}
