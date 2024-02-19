package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var listItem = ArrayList<String?>()
    var adapter: ArrayAdapter<String>? = null
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // fill listItem with stuff, and link the ListView
        listItem = arrayListOf("Thing 1", "Thing 2", "Thing 3", "Thing 4", "Thing 5")
        listView = findViewById(R.id.lvMyList)

        // set the adapter for the listView
        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listItem)

        // setting the listview adapter to the adapter we made
        listView.adapter = adapter

        // onItemClickListener shows a toast message of what item you clicked
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "You selected " + listItem[position], Toast.LENGTH_SHORT).show()
        }

    }
}