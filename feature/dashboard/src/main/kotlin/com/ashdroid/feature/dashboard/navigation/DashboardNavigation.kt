package com.ashdroid.feature.dashboard.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ashdroid.common.navigation.destinations.Route
import com.ashdroid.feature.dashboard.ui.DashboardScreen

internal fun NavGraphBuilder.dashboardScreen(
    navigateToSongDetails: (songId: Int) -> Unit
) {
    composable<Route.Dashboard> {
        DashboardScreen(
            navigateToSongDetails = navigateToSongDetails
        )
    }
}