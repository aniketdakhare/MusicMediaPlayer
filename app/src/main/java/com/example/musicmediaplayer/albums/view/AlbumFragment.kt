package com.example.musicmediaplayer.albums.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.musicmediaplayer.R
import com.example.musicmediaplayer.albums.viewmodel.AlbumsViewModel
import com.example.musicmediaplayer.albums.viewmodel.AlbumsViewModelFactory
import com.example.musicmediaplayer.databinding.FragmentAlbumBinding

class AlbumFragment : Fragment() {

    private lateinit var albumsViewModel: AlbumsViewModel
    private lateinit var binding: FragmentAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        albumsViewModel = ViewModelProvider(this, AlbumsViewModelFactory())[AlbumsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_album, container, false)
        binding.albumViewModel = albumsViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textAlbum.text = "Albums"
    }
}