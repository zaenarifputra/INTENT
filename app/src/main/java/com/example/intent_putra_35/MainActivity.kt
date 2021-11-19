package com.example.intent_putra_35

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentButton: Button = findViewById(R. id.button)
        intentButton.setOnClickListener { viewDetail() }
    }

    private fun viewDetail() {
        val intent = Intent (this, DetailActivity::class.java)
        startActivity(intent)
    }
}