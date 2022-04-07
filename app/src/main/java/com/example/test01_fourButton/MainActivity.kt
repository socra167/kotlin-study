package com.example.test01_fourButton

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        btn1.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(mIntent)
        }
        btn2.setOnClickListener{
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/123"))
            startActivity(mIntent)
        }
        btn3.setOnClickListener{
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(mIntent)

        }
        btn4.setOnClickListener{finish()}
    }
}