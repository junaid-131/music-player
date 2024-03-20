package com.example.music_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_player.databinding.ActivityFavouriteBinding

class FavouriteActivity : AppCompatActivity() {
    private val binding: ActivityFavouriteBinding by lazy {
        ActivityFavouriteBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Music_player)
        setContentView(binding.root)
    }
}