package com.ashdroid.common.data.model

data class SongDetails(
    val id: Int,
    val title: String,
    val year: Int,
    val durationInSeconds: Int,
    val shortDescription: String,
    val fullLyrics: String,
    val audioUrl: String,
    val fullCoverArtUrl: String,
    val album: Album,
    val artists: List<Artist>,
    val relatedSongsIds: List<Int>,
    val recordLabel: String,
)