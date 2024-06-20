package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Questionpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questionpage)

        val backbutton: Button = findViewById(R.id.goback)
        val startsearch: Button = findViewById(R.id.startsearch)
        // Set a click listener for the button
        backbutton.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, HomePage::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        startsearch.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, MagicResult::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}