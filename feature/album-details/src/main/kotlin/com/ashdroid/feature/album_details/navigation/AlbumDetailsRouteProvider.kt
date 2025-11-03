package com.ashdroid.feature.album_details.navigation

import androidx.navigation.NavGraphBuilder
import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.common.navigation.destinations.Route
import kotlin.reflect.KClass

internal class AlbumDetailsRouteProvider : FeatureRouteProvider() {

    override val isEnabled: Boolean = true
    override val route: KClass<*> = Route.AlbumDetail::class

    override fun register(
        navGraphBuilder: NavGraphBuilder,
        navigateTo: (route: Route) -> Unit,
    ) {
        navGraphBuilder.albumDetailsScreen()
    }
}