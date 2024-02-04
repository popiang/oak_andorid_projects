package com.popiang.recyclerview3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var countryDetailList: ArrayList<String>,
    var countryImageList: ArrayList<Int>,
    var context: Context) : RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {

    class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewCountryNameZ : TextView = itemView.findViewById(R.id.textViewCountryName)
        var textViewDetailsZ : TextView = itemView.findViewById(R.id.textViewDetails)
        var imageViewZ : CircleImageView = itemView.findViewById(R.id.imageView)
        var cardViewZ : CardView = itemView.findViewById(R.id.cardViewComponent)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)

        return CountriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryNameList.size
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.textViewCountryNameZ.text = countryNameList.get(position)
        holder.textViewDetailsZ.text = countryDetailList.get(position)
        holder.imageViewZ.setImageResource(countryImageList.get(position))

        holder.cardViewZ.setOnClickListener {
            Toast.makeText(context, "You selected the ${countryNameList.get(position)}", Toast.LENGTH_LONG).show()
        }
    }
}