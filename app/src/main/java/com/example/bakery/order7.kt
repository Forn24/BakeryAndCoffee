package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order1.delete
import kotlinx.android.synthetic.main.activity_order1.ok
import kotlinx.android.synthetic.main.activity_order7.*

class order7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order7)

        menu.setOnClickListener {
            val intent = Intent(this, seven::class.java)
            startActivity(intent)
        }
        delete.setOnClickListener {
            val intent = Intent(this, order4::class.java)
            startActivity(intent)
        }
        delete2.setOnClickListener {
            val intent = Intent(this, order1::class.java)
            startActivity(intent)
        }
        ok.setOnClickListener {
            val intent = Intent(this, Confirm::class.java)
            startActivity(intent)
        }
    }
}