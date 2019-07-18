package com.example.horus.Fragments

import android.app.ActionBar
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.widget.Toolbar
import com.example.horus.R
import kotlinx.android.synthetic.main.profile.*

class ProfileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
    = inflater.inflate(R.layout.profile, container, false)!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



//        if (activity is AppCompatActivity){
//            (activity as AppCompatActivity).setSupportActionBar(toolbar)
//        }


    }


}
