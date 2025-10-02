package com.example.promoapp

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.promoapp.databinding.ActivityPreviewBinding
import androidx.core.net.toUri

class PreviewActivity : AppCompatActivity() {

    private lateinit var message: Message
    private lateinit var finalmessage: String
    private lateinit var binding: ActivityPreviewBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayMessage()
        setUpButton()
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun displayMessage() {
        message = intent.getSerializableExtra("Message", Message::class.java)!!
        finalmessage = """
                    Hello ${message.contactName},
                    
                    My name is ${message.myDisplayName} and I am ${message.getFullJobDescription()}.
                    
                    I have a portolio of apps to demonstrate my technical skills that i can show on request.
                    
                    I am able to start a new position ${message.getAvailability()}.
                    
                    Please get in touch if you have any suitable roles for me.
                    
                    Thanks and best regards,
                    
                    ${message.myDisplayName.uppercase()}
                """.trimIndent()
        binding.textViewMessage.text = finalmessage
    }

    private fun setUpButton() {
        binding.buttonSend.setOnClickListener {
            val sendMessageIntent= Intent(Intent.ACTION_SENDTO).apply {
                data = "smsto: {$message.contactNumber}".toUri()
                putExtra("sms_body", finalmessage)
            };
            startActivity(sendMessageIntent)
        }
    }
}