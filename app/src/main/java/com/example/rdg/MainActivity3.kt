package com.example.rdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        Handler(Looper.getMainLooper()).postDelayed({
            val tela = Intent(this, MainActivity::class.java)
            startActivity(tela)
            finish()
        }, 3000)
    }
}