package com.homework.hw1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(): RecyclerView.Adapter<ListViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun fill(count: Int) {
        items.clear()
        items.addAll(0 until count)
        notifyDataSetChanged()
    }

    fun addItems(item: Int) {
        items.add(item)
        notifyDataSetChanged()
    }
}