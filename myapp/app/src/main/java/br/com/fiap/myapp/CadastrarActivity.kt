package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class CadastrarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val btn_cadastrar = findViewById<View>(R.id.btn_cadastrar)
        btn_cadastrar.setOnClickListener {
            cadastrar()
        }

        val btn_voltar = findViewById<View>(R.id.btn_voltar)
        btn_voltar.setOnClickListener {
            finish()
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

    fun cadastrar() {
        val rdgGenero: RadioGroup = findViewById(R.id.rdgGenero)

        if (rdgGenero.checkedRadioButtonId == -1) {
            Toast.makeText(this, "Preencha seu sexo.", Toast.LENGTH_LONG).show()

            return
        }

        val chkConcordoTermo: CheckBox = findViewById(R.id.chkConcordoTermo)
        if (!chkConcordoTermo.isChecked()) {
            Toast.makeText(this, "Você precisa concordar para se cadastrar.", Toast.LENGTH_LONG).show()

            return
        }

        exibirMensagem("Sucesso", "Usuário cadastrado.")
    }
}