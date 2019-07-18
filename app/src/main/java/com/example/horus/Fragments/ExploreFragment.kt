package com.example.horus.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horus.R
import kotlinx.android.synthetic.main.bottom_nav.*

class ExploreFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.explore, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        item_hotels.setOnClickListener {

        }
        super.onViewCreated(view, savedInstanceState)
    }
}