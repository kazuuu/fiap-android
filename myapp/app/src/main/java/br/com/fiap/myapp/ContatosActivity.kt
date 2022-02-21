package br.com.fiap.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.ActionBar

class ContatosActivity : AppCompatActivity() {

    lateinit var lstContatos: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Contatos")

        val fakeAPI: FakeAPI = FakeAPI()
        val contatos: ArrayList<Contato> = fakeAPI.getContatos()
        val adapter = ContatoAdapter(this, contatos)

        lstContatos = findViewById(R.id.lstContatos)
        lstContatos.adapter = adapter

    }
}