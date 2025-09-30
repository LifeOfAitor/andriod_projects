package com.example.promoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.promoapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // creamos las variables para cada elemento de la activity_main
    private var contactNameEditText: TextInputEditText? = null
    private var contactNumberEditText: TextInputEditText? = null
    private var myDisplayNameEditText: TextInputEditText? = null
    private var startDateEditText: TextInputEditText? = null
    private var juniorCheckBox: CheckBox? = null
    private var immediateStartCheckBox: CheckBox? = null
    private var jobTitleSpinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //inicializamos aqui las variables de arriba

        contactNameEditText = binding.editTextName
        contactNumberEditText = binding.editTextNumber
        myDisplayNameEditText = binding.editTextDisplayName
        startDateEditText = binding.editTextAvailability
        juniorCheckBox = binding.checkBoxJunior
        immediateStartCheckBox = binding.checkBoxJunior
        jobTitleSpinner = binding.spinnerTitle

        val previewButton: Button = binding.buttonPreview
        previewButton.setOnClickListener {
            //Toast.makeText(this, "Boton funciona", Toast.LENGTH_LONG).show()
            onPreviewClicked()
        }

    }
    private fun onPreviewClicked(){
        val textEditName: TextInputEditText = binding.editTextName
        val textEditNumber: TextInputEditText = binding.editTextNumber
        val testString = textEditName.text.toString() + " , " + textEditNumber.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }
}