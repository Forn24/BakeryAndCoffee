package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eng.*

class Eng : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng)

        btnOk.setOnClickListener {
            val intent = Intent(this, Finish::class.java)
            startActivity(intent)
        }
    }
}