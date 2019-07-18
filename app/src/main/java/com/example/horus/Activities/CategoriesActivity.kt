package com.example.horus.Activities

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.horus.R
import kotlinx.android.synthetic.main.categories_selection.*

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT
        setContentView(R.layout.categories_selection)
        listeners()
        finish_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    private fun listeners() {
        val cardViews: List<View> =
            listOf(cardView1, cardView2, cardView3, cardView4, cardView5, cardView6)
        for (item in cardViews) {
            item.setOnClickListener { dothat(it) }
        }
    }

    private fun dothat(it: View?) {
        when (it?.id) {
            R.id.cardView1 -> it.setBackgroundResource(R.color.timeline)
            R.id.cardView2 -> it.setBackgroundResource(R.color.timeline)
            R.id.cardView3 -> it.setBackgroundResource(R.color.timeline)
            R.id.cardView4 -> it.setBackgroundResource(R.color.timeline)
            R.id.cardView5 -> it.setBackgroundResource(R.color.timeline)
            R.id.cardView6 -> it.setBackgroundResource(R.color.timeline)

        }
    }


}