package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExploreMore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explore_more)

        val home: Button = findViewById(R.id.homep)
        // Set a click listener for the button
        home.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, HomePage::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        val fav: Button = findViewById(R.id.fav)
        // Set a click listener for the button
        fav.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, Favourites::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        val logout: Button = findViewById(R.id.account)
        // Set a click listener for the button
        logout.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, LogIn::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}