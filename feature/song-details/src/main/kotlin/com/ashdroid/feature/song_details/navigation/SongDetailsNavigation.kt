package com.ashdroid.feature.song_details.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ashdroid.common.navigation.destinations.Route
import com.ashdroid.feature.song_details.ui.SongDetailsCallback
import com.ashdroid.feature.song_details.ui.SongDetailsScreen

internal fun NavGraphBuilder.songDetailsScreen(
    callback: SongDetailsCallback,
) {
    composable<Route.SongDetail> {
        SongDetailsScreen(
            callback = callback,
        )
    }
}