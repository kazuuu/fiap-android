package br.com.fiap.baseapp

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
            actionBar.setTitle("Estados")

        val fakeAPI: FakeAPI = FakeAPI()

        val adapterString = ArrayAdapter(this, android.R.layout.simple_list_item_1, fakeAPI.getEstados())

        val lvEstados = findViewById<ListView>(R.id.lv_estados)
        lvEstados.adapter = adapterString

    }

}