package com.homework.hw1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListActivity: AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton

    private val adapter = ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        recyclerView.adapter = adapter

        fab.setOnClickListener {
            adapter.addItems(adapter.itemCount)
        }

        if (savedInstanceState != null) {
            val count = savedInstanceState.getInt("count")
            adapter.fill(count)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", adapter.itemCount)
    }
}