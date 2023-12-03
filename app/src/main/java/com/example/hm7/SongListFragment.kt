package com.example.hm7
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class SongListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_song_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val songList = listOf(
            SongModel("Стволы и Розы", "Ганвест feat. DONI", "3:13", "1"),
            SongModel("Качели", "НАZИМА", "2:55", "2"),
            SongModel("Твоя Планета", "Гио ПиКа feat. Кравц ", "1:23", "3"),
            SongModel("YA LUBLYU TEBYA", "CMH ", "4:40", "4"),
            SongModel("Где ты, где я", "SHOOVAL", "1:05", "5"),
            SongModel(" Госпожа ТРАВМА", "Винтаж", "5:09", "6"),
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.rv_song)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = SongAdapter(requireContext(), songList)
        recyclerView.adapter = adapter


        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        val topPadding = 1000
        recyclerView.setPadding(100, topPadding, 0, 0)
        val middlePosition = songList.size / 2
        layoutManager.scrollToPositionWithOffset(middlePosition, 0)
    }

}
