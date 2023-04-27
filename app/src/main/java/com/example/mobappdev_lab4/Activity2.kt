package com.example.mobappdev_lab4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.Calendar

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val name = intent.getStringExtra("name")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Привет, $name!"
    }
}