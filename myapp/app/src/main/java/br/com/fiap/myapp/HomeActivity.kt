package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import java.util.*

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
        val tv_username: TextView = findViewById(R.id.tv_username)
        tv_username.text = username;

        // Configura o evento OnClick do botao Sair para executar a função cliqueSair()
        val btn_sair: Button = findViewById(R.id.btn_sair)
        btn_sair.setOnClickListener {
            irSair()
        }

        // Configura o evento OnClick do botao Sair para executar a função cliqueSair()
        val btn_contatos: Button = findViewById(R.id.btn_contatos)
        btn_contatos.setOnClickListener {
            irContatos()
        }

        // Configura o evento OnClick do botao Sair para executar a função cliqueSair()
        val btn_estados: Button = findViewById(R.id.btn_estados)
        btn_estados.setOnClickListener {
            irEstados()
        }
    }

    fun irSair() {
        // Vai para a tela da MainActivity e finaliza esta Activity.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun irContatos() {
        // Vai para a tela da MainActivity e finaliza esta Activity.
        val intent = Intent(this, ContatosActivity::class.java)
        startActivity(intent)
    }

    fun irEstados() {
        // Vai para a tela da MainActivity e finaliza esta Activity.
        val intent = Intent(this, EstadosActivity::class.java)
        startActivity(intent)
    }
}