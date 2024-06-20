package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        val magic: Button = findViewById(R.id.magic)
        // Set a click listener for the button
        magic.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, Questionpage::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        val exploremore2: Button = findViewById(R.id.exploremore)
        // Set a click listener for the button
        exploremore2.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, ExploreMore::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
        val exploremore: Button = findViewById(R.id.search)
        // Set a click listener for the button
        exploremore.setOnClickListener {
            // Create an Intent to start SecondActivity
            val intent = Intent(this, ExploreMore::class.java)

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