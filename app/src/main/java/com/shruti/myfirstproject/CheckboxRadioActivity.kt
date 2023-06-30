package com.shruti.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class CheckboxRadioActivity : AppCompatActivity() {
    var cbIagree : CheckBox?=null
    var rbmale : RadioButton ?= null
    var rbfemale : RadioButton ?= null
    var rbothers : RadioButton ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio)
        cbIagree = findViewById(R.id.cbIagree)
        rbmale = findViewById(R.id.rbmale)
        rbfemale = findViewById(R.id.rbfemale)
        rbothers = findViewById(R.id.rbothers)
        cbIagree?.setOnCheckedChangeListener {_,isChecked->
            if (isChecked) {
                Toast.makeText(this, "checked", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "not checked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}