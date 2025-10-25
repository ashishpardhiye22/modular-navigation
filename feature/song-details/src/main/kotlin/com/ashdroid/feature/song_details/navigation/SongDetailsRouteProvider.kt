package com.ashdroid.feature.song_details.navigation

import androidx.navigation.NavGraphBuilder
import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.common.navigation.destinations.Route
import com.ashdroid.feature.song_details.ui.SongDetailsCallback
import kotlin.reflect.KClass

internal class SongDetailsRouteProvider : FeatureRouteProvider() {

    override val isEnabled: Boolean = true
    override val route: KClass<*> = Route.SongDetail::class

    override fun register(
        navGraphBuilder: NavGraphBuilder,
        navigateTo: (route: Route) -> Unit,
    ) {
        navGraphBuilder.songDetailsScreen(
            callback = SongDetailsCallback(
                onViewAlbumClick = {
                    navigateTo(Route.AlbumDetail(id = it))
                },
                onViewArtistClick = {
                    navigateTo(Route.ArtistDetail(id = it))
                }
            ),
        )
    }

}