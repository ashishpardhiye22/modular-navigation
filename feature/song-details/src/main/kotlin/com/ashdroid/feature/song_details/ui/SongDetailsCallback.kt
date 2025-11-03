package com.ashdroid.feature.song_details.ui

data class SongDetailsCallback(
    val onViewArtistClick: (artistId: Int) -> Unit,
    val onViewAlbumClick: (albumId: Int) -> Unit,
)
