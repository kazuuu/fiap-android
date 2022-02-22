package br.com.fiap.baseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<Button>(R.id.btn_entrar)
        btnEntrar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)

            val etUsername = findViewById<EditText>(R.id.et_username)
            intent.putExtra("username", etUsername.text.toString())

            startActivity(intent)
            finish()
        }

        var msg = "Username: Marcello\n"
        msg = msg + "Nome Completo: Marcello Kazuo\n"
        msg = msg + "Senha: abc\n"
        msg = msg + "Confirmar Senha: abc\n"
        msg = msg + "Genero: Masculino\n"

        exibirMensagem("Sucesso", msg)
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