package com.example.hm7
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(
    private val context: Context,
    private val songList: List<SongModel>
) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_song, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val data = songList[position]
        holder.bind(data)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("SONG_TITLE", data.title)
            intent.putExtra("SONG_ARTIST", data.artist)
            intent.putExtra("SONG_DOUBLE", data.duration)
            intent.putExtra("SONG_ST", data.st)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val songTextView: TextView = itemView.findViewById(R.id.text_song_title)
        private val artistTextView: TextView = itemView.findViewById(R.id.text_artist)
        private val doubleTextView: TextView = itemView.findViewById(R.id.text_2)
        private val stTextView: TextView = itemView.findViewById(R.id.st)

        fun bind(data: SongModel) {
            songTextView.text = data.title
            artistTextView.text = data.artist
            doubleTextView.text = data.duration
            stTextView.text = data.st
        }
    }
}
