package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextLiter = findViewById<EditText>(R.id.mengeLiter)
        var editTextVol = findViewById<EditText>(R.id.alkoholgehaltVol)
        var editTextGewicht = findViewById<EditText>(R.id.koerperGewicht)
        var radioButtonWeiblich = findViewById<RadioButton>(R.id.geschlechtFrau)
        var radioButton = findViewById<RadioButton>(R.id.geschlechtMann)
        var textViewMenge = findViewById<TextView>(R.id.alkoholMenge)
        var textViewAktuell = findViewById<TextView>(R.id.aktuellPromille)
        var textViewStunden05 = findViewById<TextView>(R.id.stunden05)
        var textViewStunden00 = findViewById<TextView>(R.id.stunden00)

        var result: Double





        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{

            var numberLiter = editTextLiter.text.toString().toDouble()
            var numberVol = editTextVol.text.toString().toDouble()
            var numberGewicht = editTextGewicht.text.toString().toDouble()

            result = numberLiter / 100 * numberVol
            textViewMenge.text = result.toString()


        }
       // operator fun Editable.div(i: Int): Double {

       // mengeLiter : 100 * alkoholgehaltVol = alkoholMenge

       // alkoholmenge : koerperGewicht * geschlecht =   aktuellPromille

        //aktuellPromille : stündlicherPromilleAbbau = stundenBis0


    }
}



