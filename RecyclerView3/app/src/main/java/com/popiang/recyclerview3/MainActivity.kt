package com.popiang.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter : CountriesAdapter

    var countryNameList = ArrayList<String>()
    var countryDetailList = ArrayList<String>()
    var countryImageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Malaysia")
        countryNameList.add("Palestine")
        countryNameList.add("Japan")
        countryNameList.add("South Korea")

        countryDetailList.add("This is Malaysia flag")
        countryDetailList.add("This is Palestine flag")
        countryDetailList.add("This is Japan flag")
        countryDetailList.add("This is South Korea flag")

        countryImageList.add(R.drawable.malaysia)
        countryImageList.add(R.drawable.palastine)
        countryImageList.add(R.drawable.japan)
        countryImageList.add(R.drawable.south_korea)

        adapter = CountriesAdapter(countryNameList, countryDetailList, countryImageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}