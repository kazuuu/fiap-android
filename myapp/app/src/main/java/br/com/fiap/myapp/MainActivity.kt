package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_clique_me: Button = findViewById(R.id.btn_clique_me)
        btn_clique_me.setOnClickListener {
            cliqueBotao()
        }

    }

    fun cliqueBotao() {
        val et_nome: EditText = findViewById(R.id.et_nome)
//        Toast.makeText(this, et_nome.text.toString(), Toast.LENGTH_SHORT).show()
        exibirMensagem("Saudacões", et_nome.text.toString())
    }

    fun exibirMensagem(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)

        builder.create().show()

    }
}