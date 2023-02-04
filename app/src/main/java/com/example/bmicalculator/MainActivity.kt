package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.VisibleActivityCallback
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weight = findViewById<EditText>(R.id.etWeight)
        val height = findViewById<EditText>(R.id.etHeight)
        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.result)
        val result2 = findViewById<TextView>(R.id.result2)

        btn.setOnClickListener{
            val w = weight.text.toString()
            val h = height.text.toString()

            val bmi = w.toFloat()/((h.toFloat()/100)*(h.toFloat()/100))
            val bmi2 = String.format("%.2f",bmi).toFloat()
            
            result.visibility = VISIBLE
            result2.text = bmi2.toString()

            result2.visibility = VISIBLE

            
            
        }

    }
}


