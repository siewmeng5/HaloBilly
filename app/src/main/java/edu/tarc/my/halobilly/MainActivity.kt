package edu.tarc.my.halobilly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.show_message_button)
        val text = findViewById<TextView>(R.id.textViewName)

        button.setOnClickListener{
            text.text = "billy"
        }

        testing
    }
}