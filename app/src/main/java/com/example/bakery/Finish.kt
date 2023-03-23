package com.example.bakery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        order.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            startActivity(intent)
        }

        btn1.setOnClickListener {
            val intent = Intent(this, one::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, two::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, three::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, four::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this, five::class.java)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            val intent = Intent(this, six::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}