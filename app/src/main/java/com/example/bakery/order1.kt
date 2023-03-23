package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.activity_order1.*
import kotlinx.android.synthetic.main.activity_order1.menu

class order1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order1)

        menu.setOnClickListener {
            val intent = Intent(this, one::class.java)
            startActivity(intent)
        }
        delete.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            startActivity(intent)
        }
        ok.setOnClickListener {
            val intent = Intent(this, Confirm::class.java)
            startActivity(intent)
        }
    }
}