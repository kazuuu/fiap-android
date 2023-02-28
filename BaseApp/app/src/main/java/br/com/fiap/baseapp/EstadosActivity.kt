package br.com.fiap.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.ActionBar
import br.com.fiap.baseapp.databinding.ActivityEstadosBinding
import br.com.fiap.baseapp.databinding.ActivityHomeBinding

class EstadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEstadosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEstadosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Estados")

        val fakeAPI: FakeAPI = FakeAPI()

        val adapterString = ArrayAdapter(this, android.R.layout.simple_list_item_1, fakeAPI.getEstados())

        binding.lvEstados.adapter = adapterString
    }
}