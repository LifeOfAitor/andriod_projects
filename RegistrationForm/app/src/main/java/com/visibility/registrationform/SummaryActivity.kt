package com.visibility.registrationform

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.visibility.registrationform.databinding.ActivitySummaryBinding
import androidx.core.net.toUri

class SummaryActivity : AppCompatActivity() {
    lateinit var user: User
    private lateinit var binding: ActivitySummaryBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrieveUser()
        displayUser()
        setupClickListeners()
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun retrieveUser() {
        user = intent.getSerializableExtra("User", User::class.java)!!
    }

    private fun displayUser() {
        binding.textViewTitleNameSecond.text = user.getFullName()
        binding.textViewEmail.text = user.email
        binding.textViewPhone.text = user.phone
        binding.textViewPassword.text = user.password
    }

    private fun setupClickListeners() {
        binding.textViewEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = "mailto:${user.email}".toUri()
            startActivity(intent)
        }

        binding.textViewPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data ="tel:${user.phone}".toUri()
            startActivity(intent)
        }
    }
}