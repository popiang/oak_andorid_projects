package com.popiang.buttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var btnDoMagic : Button
    lateinit var btnMyButton : Button
    lateinit var myText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDoMagic = findViewById(R.id.btnDoMagic)
        btnMyButton = findViewById(R.id.btnMyButton)
        myText = findViewById(R.id.textExample)

        btnDoMagic.setOnClickListener {

            btnDoMagic.setBackgroundColor(Color.BLACK)
            myText.setText("Shahril awesome!!")
            btnMyButton.isVisible = false

        }


    }
}