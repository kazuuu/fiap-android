package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_clique_me: Button = findViewById(R.id.btn_entrar)
        btn_clique_me.setOnClickListener {
            cliqueEntrar()
        }

        val tv_cadastrar = findViewById<View>(R.id.tv_cadastrar)
        tv_cadastrar.setOnClickListener {
            val intent = Intent(this, CadastrarActivity::class.java)
            startActivity(intent)
//            finish()

//            exibirMensagem("Sucesso", "Ir para tela de Cadastrar.")
        }

        val tv_esqueceu = findViewById<View>(R.id.tv_esqueceu)
        tv_esqueceu.setOnClickListener {
            exibirMensagem("Sucesso", "Ir para tela de Esqueci minha senha.")
        }
    }

    fun exibirMensagem(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("OK", null)

        builder.create().show()

    }

    fun cliqueEntrar() {
        val et_username: EditText = findViewById(R.id.et_username)
        val et_senha: EditText = findViewById(R.id.et_senha)

        if (et_username.text.toString() == "admin" && et_senha.text.toString() == "admin") {
            Toast.makeText(this, "Seja bem vindo", Toast.LENGTH_LONG).show()

            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", et_username.text.toString())
            startActivity(intent)
            finish()
        }

        else
            Toast.makeText(this, "Usuário e senha inválido", Toast.LENGTH_LONG).show()
    }

}