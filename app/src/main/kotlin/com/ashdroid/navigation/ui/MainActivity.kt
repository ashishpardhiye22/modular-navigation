package com.ashdroid.navigation.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.common.navigation.destinations.Route
import com.ashdroid.navigation.R
import com.ashdroid.navigation.theme.AshdroidNavigationTheme
import com.ashdroid.navigation.ui.components.MyTopAppBar
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    @JvmSuppressWildcards
    lateinit var routeProviders: Set<FeatureRouteProvider>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()
            AshdroidNavigationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        val destination =
                            navController.currentBackStackEntryAsState().value?.destination
                        val showBackButton = destination != null
                                && destination.route != Route.Dashboard::class.qualifiedName

                        MyTopAppBar(
                            title = stringResource(R.string.navigation_demo),
                            showBackButton = showBackButton,
                            navigateBack = {
                                navController.popBackStack()
                            },
                        )
                    }
                ) { innerPadding ->
                    MyNavHost(
                        modifier = Modifier.padding(innerPadding),
                        routeProviders = routeProviders,
                        navController = navController,
                    )
                }
            }
        }
    }
}

@Composable
private fun MyNavHost(
    modifier: Modifier,
    routeProviders: Set<FeatureRouteProvider>,
    navController: NavHostController,
) {
    val context = LocalContext.current

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Route.Dashboard
    ) {
        routeProviders.forEach { provider ->
            provider.register(
                navGraphBuilder = this,
                navigateTo = { route: Route ->
                    val featureEnabled = routeProviders.find {
                        it.route == route::class
                    }?.isEnabled == true

                    if (featureEnabled) {
                        navController.navigate(route)
                    } else {
                        Toast.makeText(
                            context,
                            "Feature not implemented",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                },
            )
        }
    }
}

