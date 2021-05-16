package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextLiter = findViewById<EditText>(R.id.mengeLiter)
        var editTextVol = findViewById<>(R.id.alkoholgehaltVol_)
        var editTextGewicht = findViewById<>(R.id.koerperGewicht)
        var radioButtonWeiblich = findViewById<>(R.id.geschlechtFrau)
        var radioButton = findViewById<>(R.id.geschlechtMann)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this, editTextLiter.text, Toast.LENGTH_SHORT).show()

    }


    }
}