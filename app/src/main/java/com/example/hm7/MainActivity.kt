package com.example.hm7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, SongListFragment())
            .commit()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_2, PhotoFragment())
            .commit()
    }
}