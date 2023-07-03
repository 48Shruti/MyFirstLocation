package com.shruti.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etname : EditText?= null
    var etper : EditText ?= null
    var etmar : EditText ?= null
    var etphone : EditText ?= null
    var btnvalidate : Button ?= null
    var btnnext : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etname = findViewById(R.id.etname)
        etper = findViewById(R.id.etper)
        etmar = findViewById(R.id.etmar)
        etphone = findViewById(R.id.etphone)
        btnvalidate = findViewById(R.id.btnvalidate)
        btnnext = findViewById(R.id.btnnext)
      btnvalidate?.setOnClickListener {
          if (etname?.text.isNullOrEmpty())
          {
              etname?.error= "Enter your name"
          }else if (etper?.text.isNullOrEmpty())
          {
              etper?.error = "Enter about  your percentage"
          }else if (etphone?.text.isNullOrEmpty())
          {
              etphone?.error = "Enter your phone number"
          }else if(etphone?.text.toString().length<10){
              etphone?.error = "Enter a validate number"
          }else{
              Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
          }
      }
        btnnext?.setOnClickListener {
            var intent = Intent(this , CheckIntent::class.java)
            intent.putExtra("name",etname ?.text.toString())
            intent.putExtra("percent",etper?.text.toString().toFloat())
            intent.putExtra("phone",etphone?.text.toString())
            intent.putExtra("marks",etmar?.text.toString().toDouble())

            startActivity(intent)

        }

    }

}