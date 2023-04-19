package com.example.rdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val bt = findViewById<Button>(R.id.bt_voltar)
        bt.setOnClickListener{
            this.voltar()
        }
    }

    fun voltar() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}