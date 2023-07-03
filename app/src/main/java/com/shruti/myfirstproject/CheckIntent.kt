package com.shruti.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CheckIntent : AppCompatActivity() {
    var email = ""
    var percent =0f
    var marks = 0.0
    var phone = ""
    var tvname :TextView ?= null
    var tvper :TextView ?= null
    var tvmar :TextView ?= null
    var tvphn :TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_intent)

        intent?.let {
            email = it.getStringExtra("name") ?: ""
            percent = it.getFloatExtra("percent", 0f)
            marks = it.getDoubleExtra("marks",0.0)
            phone = it.getStringExtra("phone") ?: ""
        }
        tvname = findViewById(R.id.tvname )
        tvname?.setText(email)
        tvper = findViewById(R.id.tvper )
        tvper?.setText(percent.toString())
        tvmar = findViewById(R.id.tvmar )
        tvmar?.setText(marks.toString())
        tvphn = findViewById(R.id.tvphn )
        tvphn?.setText(phone)
        System.out.println("email $email")
        System.out.println("percent $percent")
        System.out.println("phone $phone")
        System.out.println("marks $marks")

    }
}