package com.example.elloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_click_me = findViewById<Button>(R.id.greetings_button)

        btn_click_me.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hello to you too dude!", Toast.LENGTH_LONG).show()
        }
    }
}