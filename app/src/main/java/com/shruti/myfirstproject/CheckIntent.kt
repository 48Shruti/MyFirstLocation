package com.shruti.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class CheckIntent : AppCompatActivity() {
    var name = ""
    var marks = 0.0
    var per = 0f
    var phone = ""
    var email = ""
    var tvemail : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_intent)
        intent?.let {
            name = intent.getStringExtra("name")?:""
            per = intent.getFloatExtra("per",0f)
            marks =intent.getDoubleExtra("marks",0.0)
            phone= intent.getStringExtra("phone")?:""
           email= intent.getStringExtra("email")?:""
        }

        tvemail = findViewById(R.id.tvemail)
        tvemail?.setText(tvemail?.text.toString().plus( email))


    }
}