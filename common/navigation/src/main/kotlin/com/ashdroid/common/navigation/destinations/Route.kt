package com.ashdroid.common.navigation.destinations

import kotlinx.serialization.Serializable

@Serializable
sealed interface Route {

    @Serializable
    data object Dashboard : Route

    @Serializable
    data class SongDetail(
        val id: Int,
    ) : Route

    @Serializable
    data class ArtistDetail(
        val id: Int,
    ) : Route

    @Serializable
    data class AlbumDetail(
        val id: Int,
    ) : Route
}