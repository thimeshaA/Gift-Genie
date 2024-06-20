package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.launch_screen)

        // Delay starting OnboardingScreen01 by 5 seconds
        Handler().postDelayed({
            // Create an Intent to start OnboardingScreen01
            val intent = Intent(this, OnboardingScreen01::class.java)

            // Start OnboardingScreen01
            startActivity(intent)

            // Finish launch_screen to prevent going back to it when pressing back button
            finish()
        }, 5000) // 5000 milliseconds = 5 seconds
}}