package com.example.promoapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.promoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPreview.setOnClickListener {
            onPreviewClicked()
        }

    }

    private fun onPreviewClicked() {
        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Contact Name", binding.editTextName.text.toString())
        previewActivityIntent.putExtra("Contact Number", binding.editTextNumber.text.toString())
        previewActivityIntent.putExtra("My display Name", binding.editTextDisplayName.text.toString())
        previewActivityIntent.putExtra("Include Junior", binding.checkBoxJunior.isChecked)
        previewActivityIntent.putExtra("Job title", binding.spinnerTitle?.selectedItem.toString())
        previewActivityIntent.putExtra("Immediate start", binding.checkBoxImmediateStart.isChecked)
        previewActivityIntent.putExtra("Start date", binding.editTextAvailability.text.toString())
        startActivity(previewActivityIntent)

    }
}