package com.homework.hw1

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val text: TextView = view.findViewById(R.id.text_1)
    private val image: ImageView = view.findViewById(R.id.image_view)

    fun bind(number: Int) {
        text.text = "$number"
        image.setBackgroundColor(if (number % 2 == 1) Color.BLUE else Color.RED)
    }
}