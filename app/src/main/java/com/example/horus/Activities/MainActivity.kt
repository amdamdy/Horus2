package com.example.horus.Activities

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.horus.Fragments.*
import com.example.horus.R
import com.example.horus.Utils.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT
        setSupportActionBar(toolbar)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        val tabs: TabLayout = findViewById(R.id.tabs)
        val adapter = ViewPagerAdapter(supportFragmentManager)

        val isFirstRun: Boolean = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE)
            .getBoolean("isFirstRun", true)
        if (isFirstRun) {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE).edit()
            .putBoolean("isFirstRun", false).apply()

        adapter.addFragment(ProfileFragment(), "Profile")
        adapter.addFragment(FragmentTwo(), "Timeline")
        adapter.addFragment(ShoppingFragment(), "Shopping")
        adapter.addFragment(ExploreFragment(), "Explore")
        adapter.addFragment(ChatFragment(), "Chat")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)


//        val fab: FloatingActionButton = this.findViewById(R.id.fab)
//
//        fab.setOnClickListener {
//            val intent = Intent(this, ChatActivity::class.java)
//            startActivity(intent)
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.humburger_meu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.categories_menu -> {
                val intent = Intent(this, CategoriesActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.login -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.regMenu -> {
                val intent = Intent(this, RegistrationActivity::class.java)
                startActivity(intent)
                true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }


}

