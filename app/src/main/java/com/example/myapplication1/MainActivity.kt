package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_click)
        val infoText = findViewById<TextView>(R.id.textView)
        val inputField = findViewById<EditText>(R.id.input_field)
        button.setOnClickListener {
            val newText = inputField.text.toString()
      Toast.makeText(this,"done",Toast.LENGTH_SHORT).show()
        }
    }
}