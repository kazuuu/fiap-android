package br.com.fiap.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.ActionBar

class ContatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contatos)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Contatos")

        val fakeAPI: FakeAPI = FakeAPI()
        val contatos: ArrayList<Contato> = fakeAPI.getContatos()
        val adapter = ContatosAdapter(this, contatos)

        val lvContatos = findViewById<ListView>(R.id.lv_contatos)
        lvContatos.adapter = adapter
    }
}