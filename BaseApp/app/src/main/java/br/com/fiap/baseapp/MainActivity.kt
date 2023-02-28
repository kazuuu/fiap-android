package br.com.fiap.baseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import br.com.fiap.baseapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun irEntrar(view: View) {
        val intent = Intent(this, HomeActivity::class.java)

        intent.putExtra("username", binding.etUsername.text.toString())

        startActivity(intent)
        finish()
    }

    fun exibirMensagem(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)

        builder.create().show()

    }

    fun irCadastrar(view: View) {
        exibirMensagem("Ir para CadastrarActivity", "We are under construction")
    }

    fun irEsqueci(view: View) {
        exibirMensagem("Ir para EsqueceuActivity", "We are under construction")
    }

}
