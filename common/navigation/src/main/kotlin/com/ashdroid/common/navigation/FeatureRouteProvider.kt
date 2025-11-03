package com.ashdroid.common.navigation

import androidx.navigation.NavGraphBuilder
import com.ashdroid.common.navigation.destinations.Route
import kotlin.reflect.KClass

abstract class FeatureRouteProvider {
    abstract val isEnabled: Boolean
    abstract val route: KClass<*>
    abstract fun register(
        navGraphBuilder: NavGraphBuilder,
        navigateTo: (route: Route) -> Unit,
    )
}