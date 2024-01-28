package com.popiang.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var name : String
    private lateinit var nameInputField : EditText
    private lateinit var btnSubmit : Button
    private lateinit var result : TextView
    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInputField = findViewById(R.id.inputTextName)
        btnSubmit = findViewById(R.id.btnSubmit)
        result = findViewById(R.id.result)
        image = findViewById(R.id.imageViewExample)

        btnSubmit.setOnClickListener {
            name = nameInputField.text.toString()
            result.text = name;
            image.setImageResource(R.drawable.pic2)
        }
    }
}