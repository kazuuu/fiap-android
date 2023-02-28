package br.com.fiap.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.ActionBar
import br.com.fiap.baseapp.databinding.ActivityContatosBinding
import br.com.fiap.baseapp.databinding.ActivityEstadosBinding

class ContatosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Altera o texto da Action Bar
        val actionBar: ActionBar? = getSupportActionBar()
        if (actionBar != null)
            actionBar.setTitle("Contatos")

        val fakeAPI: FakeAPI = FakeAPI()
        val contatos: ArrayList<Contato> = fakeAPI.getContatos()
        val adapter = ContatosAdapter(this, contatos)

        binding.lvContatos.adapter = adapter
    }
}