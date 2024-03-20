package com.example.music_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_player.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {
    private val binding: ActivityPlayerBinding by lazy {
        ActivityPlayerBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Music_player)
        setContentView(binding.root)
    }
}