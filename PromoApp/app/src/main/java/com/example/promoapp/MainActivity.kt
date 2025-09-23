package com.example.promoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val previewButton: Button = findViewById(R.id.button_preview)
        //var previewButton= findViewById<Button>(R.id.button_preview)
        previewButton.setOnClickListener {
            //Toast.makeText(this, "Boton funciona", Toast.LENGTH_LONG).show()
            onPreviewClicked()
        }

    }
    private fun onPreviewClicked(){
        val textEditName: TextInputEditText = findViewById(R.id.edit_text_name)
        val textEditNumber: TextInputEditText = findViewById(R.id.edit_text_number)
        val testString = textEditName.text.toString() + " , " + textEditNumber.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }
}