package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import java.util.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Start of dynamic title code---------------------
        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            //Setting a dynamic title at runtime. Here, it displays the current time.
            actionBar.setTitle("Home")
        }
        //End of dynamic title code----------------------

        val btn_clique_me: Button = findViewById(R.id.btn_sair)
        btn_clique_me.setOnClickListener {
            cliqueSair()
        }
    }

    fun cliqueSair() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}