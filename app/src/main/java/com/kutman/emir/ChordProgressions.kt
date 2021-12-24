package com.kutman.emir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChordProgressions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chord_progressions)

        val backPr = findViewById<ImageView>(R.id.back)

        backPr.setOnClickListener {
            startActivity(Intent(this, Learn::class.java))
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.fav -> {
                    startActivity(Intent(this, Favorite::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.learn -> {
                    startActivity(Intent(this, Learn::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.settings -> {
                    startActivity(Intent(this, Settings::class.java))
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}