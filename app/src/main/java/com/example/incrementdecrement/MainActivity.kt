package com.example.incrementdecrement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text : TextView = findViewById(R.id.numView)
        var increment : Button = findViewById(R.id.incBtn)
        var decrement : Button = findViewById(R.id.decBtn)
        var reset : Button = findViewById(R.id.resetBtn)

        var counter=0

       increment.setOnClickListener {
           counter++
           text.text = counter.toString()
        }

        decrement.setOnClickListener {
            if (counter > 0){
                counter--
                text.text = counter.toString()
            }

        }

        reset.setOnClickListener {
            if (counter >= 0){
                counter = 0
                text.text = counter.toString()
            }
        }
    }
}