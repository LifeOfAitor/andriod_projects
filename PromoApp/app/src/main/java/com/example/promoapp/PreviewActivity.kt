package com.example.promoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.promoapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recolectar las variables que hemos creado en el main a traves del intent
        val jobName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val displayName = intent.getStringExtra("My display Name")
        val displayJunior = intent.getBooleanExtra("Include Junior", false)
        val jobTitle = intent.getStringExtra("Job title")
        val immediateStart = intent.getBooleanExtra("Immediate start", false)
        val startDate = intent.getStringExtra("Start date")

        binding.textViewMessage.text = "Contact name: $jobName Contact Number: $contactNumber Display name: $displayName Is junior: $displayJunior Job title: $jobTitle Immediate start: $immediateStart Starting date: $startDate"
    }

}