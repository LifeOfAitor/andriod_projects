package com.example.promoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var previewButton: Button = findViewById(R.id.button_preview)
        //var previewButton= findViewById<Button>(R.id.button_preview)
        previewButton.setOnClickListener {
            Toast.makeText(this, "Boton funciona", Toast.LENGTH_LONG).show()
        }

    }
}