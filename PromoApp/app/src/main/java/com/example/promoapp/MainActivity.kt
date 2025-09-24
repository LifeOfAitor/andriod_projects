package com.example.promoapp

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

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
        setContentView(R.layout.activity_main)

        //inicializamos aqui las variables de arriba

        contactNameEditText = findViewById(R.id.edit_text_name)
        contactNumberEditText = findViewById(R.id.edit_text_number)
        myDisplayNameEditText = findViewById(R.id.edit_text_display_name)
        startDateEditText = findViewById(R.id.edit_text_availability)
        juniorCheckBox = findViewById(R.id.check_box_junior)
        immediateStartCheckBox = findViewById(R.id.check_box_immediate_start)
        jobTitleSpinner = findViewById(R.id.spinner_title)

        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {
            //Toast.makeText(this, "Boton funciona", Toast.LENGTH_LONG).show()
            onPreviewClicked()
        }

    }
    private fun onPreviewClicked(){
        /*
        val textEditName: TextInputEditText = findViewById(R.id.edit_text_name)
        val textEditNumber: TextInputEditText = findViewById(R.id.edit_text_number)
        val testString = textEditName.text.toString() + " , " + textEditNumber.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
         */
    }
}