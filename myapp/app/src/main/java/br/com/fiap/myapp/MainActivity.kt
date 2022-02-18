package br.com.fiap.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_fiji: Button = findViewById(R.id.btn_fiji)
        btn_fiji.setOnClickListener {
            val imageView: ImageView = findViewById(R.id.imageView)
            imageView.setImageResource(R.drawable.ic_flag_of_fiji)
        }

        val btn_india: Button = findViewById(R.id.btn_india)
        btn_india.setOnClickListener {
            val imageView: ImageView = findViewById(R.id.imageView)
            imageView.setImageResource(R.drawable.ic_flag_of_india)
        }

        val btn_kuwait: Button = findViewById(R.id.btn_kuwait)
        btn_kuwait.setOnClickListener {
            val imageView: ImageView = findViewById(R.id.imageView)
            imageView.setImageResource(R.drawable.ic_flag_of_kuwait)
        }

        val btn_somar: Button = findViewById(R.id.btn_somar)
        btn_kuwait.setOnClickListener {
            val et_num1: EditText = findViewById(R.id.et_num1);
            val et_num2: EditText = findViewById(R.id.et_num2);
            val tv_result: TextView = findViewById(R.id.tv_result);

            tv_result.text = (Integer.valueOf(et_num1.text.toString()) + Integer.valueOf(et_num2.text.toString())).toString()
        }

    }
}