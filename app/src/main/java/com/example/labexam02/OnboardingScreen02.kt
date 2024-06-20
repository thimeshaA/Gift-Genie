package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen02)

        val backbutton: Button = findViewById(R.id.goback)
        val startsearch: Button = findViewById(R.id.startsearch)
        // Set a click listener for the button
        backbutton.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, OnboardingScreen01::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        startsearch.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, OnboardingScreen03::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}