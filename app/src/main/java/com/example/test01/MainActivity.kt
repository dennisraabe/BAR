package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextLiter = findViewById<EditText>(R.id.mengeLiter)
        var editTextVol = findViewById<EditText>(R.id.alkoholgehaltVol_)
        var editTextGewicht = findViewById<EditText>(R.id.koerperGewicht)
        var radioButtonWeiblich = findViewById<RadioButton>(R.id.geschlechtFrau)
        var radioButton = findViewById<RadioButton>(R.id.geschlechtMann)
        var textViewMenge = findViewById<TextView>(R.id.alkoholMenge)
        var textViewAktuell = findViewById<TextView>(R.id.aktuellPromille)
        var textViewStunden05 = findViewById<TextView>(R.id.stunden05)
        var textViewStunden00 = findViewById<TextView>(R.id.stunden00)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            Toast.makeText(this, editTextLiter.text, Toast.LENGTH_SHORT).show()

    }


    }
}