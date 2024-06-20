package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MagicResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_magic_result)

        val backbuttontoq: Button = findViewById(R.id.goback3)
        val homepage: Button = findViewById(R.id.homepage)
        // Set a click listener for the button
        backbuttontoq.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, OnboardingScreen03::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        homepage.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, HomePage::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}