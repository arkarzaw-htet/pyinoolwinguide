package com.example.pyinoolwintravelguide

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnNext = findViewById<Button>(R.id.button2)
        val btnBack = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)
        val img = findViewById<ImageView>(R.id.imageView)
        btnNext.setOnClickListener {
            text.setText("You Clicked Next") 

        }



        btnBack.setOnClickListener {
            text.setText("You clicked Back")

        }
    }
}