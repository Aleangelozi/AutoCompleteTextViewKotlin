package com.technibyte.autocompletetextview_kotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suggestions = resources.getStringArray(R.array.Cities)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, suggestions)

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoCompleteTextView.threshold = 0
        autoCompleteTextView.setAdapter(arrayAdapter)

    }
}