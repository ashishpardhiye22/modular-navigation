package com.ashdroid.feature.dashboard.navigation

import androidx.navigation.NavGraphBuilder
import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.common.navigation.destinations.Route
import kotlin.reflect.KClass

internal class DashboardRouteProvider : FeatureRouteProvider() {

    override val isEnabled: Boolean = true
    override val route: KClass<*> = Route.Dashboard::class

    override fun register(
        navGraphBuilder: NavGraphBuilder,
        navigateTo: (route: Route) -> Unit,
    ) {
        navGraphBuilder.dashboardScreen(
            navigateToSongDetails = { songId ->
                navigateTo(Route.SongDetail(id = songId))
            }
        )
    }

}