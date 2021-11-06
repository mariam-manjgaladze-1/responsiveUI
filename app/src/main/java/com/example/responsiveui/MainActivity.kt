package com.example.responsiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstThree = findViewById<EditText>(R.id.first3)
        val lastThree = findViewById<EditText>(R.id.last3)
        val letters = findViewById<EditText>(R.id.asoebi)
        val personal_ID = findViewById<EditText>(R.id.id_Num)
        val email_address = findViewById<EditText>(R.id.email)
    }
}

fun main(){
    if (3 == length(MainActivity().firstThree)){

    }
}
