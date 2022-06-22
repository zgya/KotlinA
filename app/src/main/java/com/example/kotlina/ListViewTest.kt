package com.example.kotlina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class ListViewTest : AppCompatActivity() {
    private val data = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_test)

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
    }
}