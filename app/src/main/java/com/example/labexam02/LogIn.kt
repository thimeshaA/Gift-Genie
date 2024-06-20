package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        val signuppg: Button = findViewById(R.id.signuppage)
        // Set a click listener for the button
        signuppg.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, signup::class.java)

            // Start SecondActivity
            startActivity(intent)
        }

        val logintohome: Button = findViewById(R.id.finallogin)
        // Set a click listener for the button
        logintohome.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, HomePage::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}