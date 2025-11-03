package com.ashdroid.feature.dashboard.di

import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.feature.dashboard.navigation.DashboardRouteProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DashboardModule {

    @Provides
    @Singleton
    @IntoSet
    fun bindRouteProvider(): FeatureRouteProvider = DashboardRouteProvider()
}