package com.piyal.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2


class Details : AppCompatActivity() {

    private var imagesList= mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        /*postToList()

        var viewPager = findViewById<ViewPager2>(R.id.View_pager2)
        viewPager.adapter = ViewPageAdapter(imagesList)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(viewPager)*/
    }

   /* private fun addToList(image: Int){
        imagesList.add(image)
    }
    private fun postToList(){
        for (i in 1..5){
            addToList(R.mipmap.ic_launcher_round)
        }
    }*/
}