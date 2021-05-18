package com.example.test01

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initalisiere GUI objekte
        var editTextLiter = findViewById<EditText>(R.id.mengeLiter)
        var editTextVol = findViewById<EditText>(R.id.alkoholgehaltVol)
        var editTextGewicht = findViewById<EditText>(R.id.koerperGewicht)
        var textViewMenge = findViewById<TextView>(R.id.alkoholMenge)
        var textViewAktuell = findViewById<TextView>(R.id.aktuellPromille)
        var textViewStunden00 = findViewById<TextView>(R.id.stunden00)
        val button = findViewById<Button>(R.id.button)
        var radioButton = findViewById<RadioButton>(R.id.geschlechtMann)
        var radioButtonWeiblich = findViewById<RadioButton>(R.id.geschlechtFrau)

        // initialisiere Werte
        var numberFrau = 0.6
        var resultPromille: Double
        var resultMann: Double
        var resultFrau: Double
        var resultAbbau: Double

        // Rechnen Button funktion
        button.setOnClickListener{

            var numberLiter = editTextLiter.text.toString().toDouble()
            var numberVol = editTextVol.text.toString().toDouble()
            var numberGewicht = editTextGewicht.text.toString().toDouble()

            // Result Menge berechnen
            resultPromille = numberLiter / 100 * numberVol
            textViewMenge.text = resultPromille.toString()

            // Result Aktuell
            if (radioButton.isChecked == true)  // wenn männlich ausgewählt wurde
            {
                // Rechnen
                resultMann = resultPromille / numberGewicht * 0.7
                // Runden
                val rounded:Double = String.format("%.2f", resultMann.toString().toDouble()).toDouble()
                // Ausgeben
                textViewAktuell.text = rounded.toString()
            }
            else if (radioButtonWeiblich.isChecked == true)  // wenn weiblich ausgewählt wurde
            {
                // Rechnen
                resultFrau = resultPromille / numberGewicht * 0.6
                // Runden
                val rounded:Double = String.format("%.2f", resultFrau.toString().toDouble()).toDouble()
                // Ausgeben
                textViewAktuell.text = rounded.toString()
            }

            // Result Abbau berechnen
            resultAbbau = textViewAktuell.text.toString().toDouble() / 0.13
            // Runden
            val rounded:Double = String.format("%.2f", resultAbbau.toString().toDouble()).toDouble()
            // Ausgeben
            textViewStunden00.text = rounded.toString()
        }
    }

    fun radio_button_click(view: View){
        var radioButton = findViewById<RadioButton>(R.id.geschlechtMann)
        radioButton.isChecked = false
    }

    fun radio_button_click1(view: View){
        var radioButtonWeiblich = findViewById<RadioButton>(R.id.geschlechtFrau)
        radioButtonWeiblich.isChecked = false
    }
}



