package br.edu.fatecpg.kotlin.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.kotlin.R

class BemVindoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtIdade = findViewById<EditText>(R.id.edt_idade)
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        btnEnviar.setOnClickListener {
            val nome = edtNome.text.toString()
            val idade = edtIdade.text.toString()
            if(nome.isNotEmpty() && idade.isNotEmpty()){
                val mensagem = "Bem-vindo $nome! Você tem $idade anos."
                Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}