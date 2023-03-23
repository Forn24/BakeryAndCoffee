package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_order.*
class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        menu.setOnClickListener {
            val intent = Intent(this, Finish::class.java)
            startActivity(intent)
        }
    }
}