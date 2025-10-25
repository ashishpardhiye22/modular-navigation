package com.ashdroid.common.navigation.destinations

import kotlinx.serialization.Serializable

sealed interface Route{

    @Serializable
    object Dashboard

    @Serializable
    data class SongDetail(
        val id: Int,
    ):Route
}