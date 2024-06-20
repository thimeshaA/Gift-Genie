package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupfinall: Button = findViewById(R.id.signupfinal)
        // Set a click listener for the button
        signupfinall.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, MagicResult::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }

}