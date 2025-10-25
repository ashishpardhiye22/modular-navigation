package com.ashdroid.feature.album_details.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ashdroid.common.navigation.destinations.Route
import com.ashdroid.feature.album_details.ui.AlbumDetailsScreen

internal fun NavGraphBuilder.albumDetailsScreen() {
    composable<Route.AlbumDetail> {
        AlbumDetailsScreen()
    }
}