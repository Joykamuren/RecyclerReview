package com.example.recyclerviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewsprojects.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_name_item.*
import layout.AgeRecyclerViewAdapter
import layout.DOBRecyclerViewAdapter
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("Andrew", "Pauline", "Sue", "Manuel", "Veronica", "Arthur", "Esther", "David", "Patience"))
        rvNames.adapter = namesAdapter

        var ageAdapter = AgeRecyclerViewAdapter (listOf(20,21,22,23,24,25,26,27,28,29) as List<Int>)
      //  rvAge.adapter = ageAdapter
        val DOBAdapter = DOBRecyclerViewAdapter (listOf(15/3/2001,2/3/2000,1/2/2004,1/2/2005,4/6/2001,12/3/1998,6/7/3004,7/3/1996,125/23/2009,5/8/2000) as List<Int>)
      //  rvDOB.adapter = DOBAdapter
    }
}
