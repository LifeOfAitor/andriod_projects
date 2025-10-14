package com.visibility.registrationform

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import  com.visibility.registrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSpinner()
        setupButton()
    }

    private fun setupButton() {
        binding.buttonCreate.setOnClickListener {
            createAccount()
        }
    }

    private fun setupSpinner() {
        val titles = arrayOf("Miss", "Mrs", "Ms", "Mr", "Mx", "Dr")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, titles)
        binding.spinnerTitle.adapter = titleAdapter
    }

    private fun createAccount() {
        val user = User(
            binding.spinnerTitle.selectedItem as String,
            binding.editTextFirstName.text.toString(),
            binding.textInputLastName.text.toString(),
            binding.textInputEmail.text.toString(),
            binding.textInputPhone.text.toString(),
            binding.textInputPassword.text.toString(),
        )
        val intent = Intent(this, SummaryActivity::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }
}