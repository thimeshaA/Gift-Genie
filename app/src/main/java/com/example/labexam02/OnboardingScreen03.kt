package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding_screen03)

        val back2: Button = findViewById(R.id.goback2)
        val signuptogetstarted: Button = findViewById(R.id.signuptogetstarted)
//         Set a click listener for the button
        back2.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, OnboardingScreen02::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        signuptogetstarted.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, signup::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        }
    }
