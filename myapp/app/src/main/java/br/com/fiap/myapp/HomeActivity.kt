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
        val btn_clique_me: Button = findViewById(R.id.btn_sair)
        btn_clique_me.setOnClickListener {
            cliqueSair()
        }
    }

    fun cliqueSair() {
        // Vai para a tela da MainActivity e finaliza esta Activity.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}