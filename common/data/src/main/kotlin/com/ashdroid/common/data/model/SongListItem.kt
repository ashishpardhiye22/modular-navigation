package com.ashdroid.common.data.model

data class SongListItem(
    val id: Int,
    val title: String,
    val durationInSeconds: Int,
    val thumbnailUrl: String,
    val artistName: String,
    val albumName: String,
    val isFavorite: Boolean = false,
)