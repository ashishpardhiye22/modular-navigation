package com.ashdroid.common.navigation.destinations

import kotlinx.serialization.Serializable

/**
 * Represents all the screens/routes in the application.
 * Each screen has a unique name and optionally arguments.
 *
 * Using sealed classes ensures **type-safe navigation**.
 */
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