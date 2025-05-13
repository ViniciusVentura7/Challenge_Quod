package com.quodantifraude

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quodantifraude.AutenticacaoCadastralActivity
import com.example.quodantifraude.ScoreAntifraudeActivity
import com.example.quodantifraude.SimSwapActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnFace).setOnClickListener {
            startActivity(Intent(this, BiometriaFacialActivity::class.java))
        }
        findViewById<Button>(R.id.btnDigital).setOnClickListener {
            startActivity(Intent(this, BiometriaDigitalActivity::class.java))
        }
        findViewById<Button>(R.id.btnScore).setOnClickListener {
            startActivity(Intent(this, ScoreAntifraudeActivity::class.java))
        }
        findViewById<Button>(R.id.btnDocumento).setOnClickListener {
            startActivity(Intent(this, AnaliseDocumentoActivity::class.java))
        }
        findViewById<Button>(R.id.btnSimSwap).setOnClickListener {
            startActivity(Intent(this, SimSwapActivity::class.java))
        }
        findViewById<Button>(R.id.btnAutenticacao).setOnClickListener {
            startActivity(Intent(this, AutenticacaoCadastralActivity::class.java))
        }
    }
}
