package com.example.rdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val bt = findViewById<Button>(R.id.bt_tela_cadastro)
        bt.setOnClickListener{
            this.tela_cadastro()
        }

        val bt2 = findViewById<Button>(R.id.bt_entrar)
        bt2.setOnClickListener{
            this.entrar()
        }

    }

    fun tela_cadastro() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun entrar() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}