package com.example.promoapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
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

        //añadir valores al spinner mediante el adapter
        val spinnerValues = arrayOf("", "Android Developer", "Android Engineer")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerValues)
        binding.spinnerTitle.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {
        val message = Message(
            binding.editTextName.text.toString(),
            binding.editTextNumber.text.toString(),
            binding.editTextDisplayName.text.toString(),
            binding.checkBoxJunior.isChecked,
            binding.spinnerTitle?.selectedItem.toString(),
            binding.checkBoxImmediateStart.isChecked,
            binding.editTextAvailability.text.toString()
        )
        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Message", message)
        startActivity(previewActivityIntent)

    }
}