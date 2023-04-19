package com.example.rdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val bt = findViewById<ImageButton>(R.id.bt_usuario)
        bt.setOnClickListener{
            this.usuario()
        }
    }

    fun usuario() {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
}