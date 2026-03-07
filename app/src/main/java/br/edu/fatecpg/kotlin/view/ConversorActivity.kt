package br.edu.fatecpg.kotlin.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.kotlin.R

class ConversorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)
        val edtCelsius = findViewById<EditText>(R.id.edt_celsius)
        val btnConverter = findViewById<Button>(R.id.btn_converter)
        val txtResultado = findViewById<TextView>(R.id.txt_resultado)
        btnConverter.setOnClickListener {
            val celsiusTexto = edtCelsius.text.toString()
            if(celsiusTexto.isNotEmpty()){
                val celsius = celsiusTexto.toDouble()
                val fahrenheit = (celsius * 9/5) + 32
                txtResultado.text = "$celsius °C = $fahrenheit °F"
            }else{
                txtResultado.text = "Digite uma temperatura!"
            }
        }
    }
}