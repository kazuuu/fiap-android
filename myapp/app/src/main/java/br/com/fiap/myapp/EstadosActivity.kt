package br.com.fiap.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.ActionBar

class EstadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estados)
        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Contatos")

        val fakeAPI: FakeAPI = FakeAPI()

        val adapterString = ArrayAdapter(this, android.R.layout.simple_list_item_1, fakeAPI.getEstados())

        val lstEstados: ListView = findViewById(R.id.lstEstados)
        lstEstados.adapter = adapterString
    }
}