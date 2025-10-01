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
        val message = intent.getParcelableExtra("Message", Message::class.java)

        binding.textViewMessage.text = message.toString()
    }
}