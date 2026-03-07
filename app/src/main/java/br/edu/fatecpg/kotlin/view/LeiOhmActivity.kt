package br.edu.fatecpg.kotlin.view

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.kotlin.R

class LeiOhmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lei)

        val tensao = findViewById<EditText>(R.id.etTensao)
        val resistencia = findViewById<EditText>(R.id.etResistencia)
        val corrente = findViewById<EditText>(R.id.etCorrente)
        val calcular = findViewById<Button>(R.id.btnCalcular)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        calcular.setOnClickListener {

            val v = tensao.text.toString()
            val r = resistencia.text.toString()
            val i = corrente.text.toString()

            if (v.isNotEmpty() && r.isNotEmpty() && i.isEmpty()) {
                val V = v.toDouble()
                val R = r.toDouble()
                val I = V / R
                resultado.text = "Corrente (I) = $I A"
            }

            else if (v.isNotEmpty() && i.isNotEmpty() && r.isEmpty()) {
                val V = v.toDouble()
                val I = i.toDouble()
                val R = V / I
                resultado.text = "Resistência (R) = $R Ω"
            }

            else if (r.isNotEmpty() && i.isNotEmpty() && v.isEmpty()) {
                val R = r.toDouble()
                val I = i.toDouble()
                val V = R * I
                resultado.text = "Tensão (V) = $V V"
            }

            else {
                resultado.text = "Preencha apenas dois valores."
            }
        }
    }
}