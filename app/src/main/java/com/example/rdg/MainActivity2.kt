package com.example.rdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bt = findViewById<Button>(R.id.bt_entrar_2)
        bt.setOnClickListener{
            this.entrar2()
        }
    }

    fun entrar2() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}