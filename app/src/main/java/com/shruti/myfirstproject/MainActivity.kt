package com.shruti.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etname : EditText?= null
    var etcollegeinfo : EditText ?= null
    var etphone : EditText ?= null
    var btnvalidate : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etname = findViewById(R.id.etname)
        etcollegeinfo = findViewById(R.id.etcollegeinfo)
        etphone = findViewById(R.id.etphone)
        btnvalidate = findViewById(R.id.btnvalidate)
      btnvalidate?.setOnClickListener {
          if (etname?.text.isNullOrEmpty())
          {
              etname?.error= "Enter your name"
          }else if (etcollegeinfo?.text.isNullOrEmpty())
          {
              etcollegeinfo?.error = "Enter about  your college"
          }else if (etphone?.text.isNullOrEmpty())
          {
              etphone?.error = "Enter your phone number"
          }else if(etphone?.text.toString().length<10){
              etphone?.error = "Enter a validate number"
          }else{
              Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
          }
      }

    }

}