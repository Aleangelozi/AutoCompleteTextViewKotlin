package com.technibyte.autocompletetextview_kotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.technibyte.autocompletetextview_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val suggestions = resources.getStringArray(R.array.Cities)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, suggestions)

        val autoCompleteTextView = binding.autoCompleteTextView
        autoCompleteTextView.threshold = 0
        autoCompleteTextView.setAdapter(arrayAdapter)

    }
}