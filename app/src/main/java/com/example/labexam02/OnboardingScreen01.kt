package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingScreen01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen01)

        val button1: Button = findViewById(R.id.getstartedbutton)
        val button2: Button = findViewById(R.id.Login)
        // Set a click listener for the button
        button1.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, OnboardingScreen02::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        button2.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, LogIn::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}