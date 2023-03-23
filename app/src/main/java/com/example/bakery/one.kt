package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        order.setOnClickListener {
            val intent = Intent(this, order1::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, seven::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}