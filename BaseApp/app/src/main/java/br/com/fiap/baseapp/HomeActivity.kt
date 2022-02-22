package br.com.fiap.baseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Home")

        // Pega o username que foi passado pela MainActivity
        val username = intent.getStringExtra("username")

        // Coloca o username no TextView da HomeActivity
        val tv_username = findViewById<TextView>(R.id.tv_username)
        tv_username.text = username;

        val btnSair = findViewById<Button>(R.id.btn_sair)
        btnSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Configura o evento OnClick do botao Listar Estados para executar a função irEstados()
        val btnEstados = findViewById<Button>(R.id.btn_estados)
        btnEstados.setOnClickListener {
            irEstados()
        }

        // Configura o evento OnClick do botao Listar Estados para executar a função irEstados()
        val btnContato = findViewById<Button>(R.id.btn_contatos)
        btnContato.setOnClickListener {
            irContatos()
        }
    }

    fun irContatos() {
        val intent = Intent(this, ContatosActivity::class.java)
        startActivity(intent)
    }

    fun irEstados() {
        val intent = Intent(this, EstadosActivity::class.java)
        startActivity(intent)
    }

}