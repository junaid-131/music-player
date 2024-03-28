package com.example.music_player

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.music_player.databinding.MusicViewBinding

class musicAdapter(private val context: Context , private val musicList:ArrayList<music>):RecyclerView.Adapter<musicAdapter.MyHolder>() {
    class MyHolder (binding: MusicViewBinding):RecyclerView.ViewHolder(binding.root){
        val title = binding.songNameMV
        val album = binding.SongAlbumMV
        val image = binding.musicMV
        val duration = binding.songDurationMV

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): musicAdapter.MyHolder {
        return MyHolder(MusicViewBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: musicAdapter.MyHolder, position: Int) {
        holder.title.text = musicList[position].title
        holder.album.text=musicList[position].album
        holder.duration.text=musicList[position].toString()
    }

    override fun getItemCount(): Int {
        return musicList.size
    }
}