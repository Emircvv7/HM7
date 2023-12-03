package com.example.hm7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val songTitle = intent.getStringExtra("SONG_TITLE")

        val textViewSongTitle: TextView = findViewById(R.id.text_song_title)
        textViewSongTitle.text = songTitle
    }
}