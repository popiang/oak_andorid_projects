package com.popiang.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter : CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("Malaysia")
        countryNameList.add("Palestine")
        countryNameList.add("Japan")
        countryNameList.add("South Korea")

        detailsList.add("This is the Malaysia Flag")
        detailsList.add("This is the Palestine Flag")
        detailsList.add("This is the Japan Flag")
        detailsList.add("This is the South Korea Flag")

        imageList.add(R.drawable.malaysia)
        imageList.add(R.drawable.palastine)
        imageList.add(R.drawable.japan)
        imageList.add(R.drawable.south_korea)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}