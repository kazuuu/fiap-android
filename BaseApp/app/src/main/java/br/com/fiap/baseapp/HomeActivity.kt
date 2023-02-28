package br.com.fiap.baseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import br.com.fiap.baseapp.databinding.ActivityHomeBinding
import br.com.fiap.baseapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Home")

        // Pega o username que foi passado pela MainActivity
        val username = intent.getStringExtra("username")

        // Coloca o username no TextView da HomeActivity
        binding.tvUsername.text = username;
    }

    fun sair() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
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