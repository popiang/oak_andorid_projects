package com.popiang.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter : CountriesAdapter

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Malaysia")
        countryNameList.add("Palestine")
        countryNameList.add("Japan")
        countryNameList.add("South Korea")

        detailsList.add("This is the Malaysia flag")
        detailsList.add("This is the Palestine flag")
        detailsList.add("This is the Japan flag")
        detailsList.add("This is the South Korea flag")

        imageList.add(R.drawable.malaysia)
        imageList.add(R.drawable.palastine)
        imageList.add(R.drawable.japan)
        imageList.add(R.drawable.south_korea)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}