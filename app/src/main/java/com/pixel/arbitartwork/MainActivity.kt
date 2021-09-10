package com.pixel.arbitartwork


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* setSupportActionBar(findViewById(R.id.toolbar)) */
        val rollButtonI = findViewById<Button>(R.id.rollButton);
        val textViewI = findViewById<TextView>(R.id.textView);
        rollButtonI.setOnClickListener {
            textViewI.text="I am a Kotlin beginner"
        }
    }


    fun onRollClick(view:View){

    }

}