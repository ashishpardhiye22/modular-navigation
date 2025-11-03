package com.ashdroid.feature.album_details.di

import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.feature.album_details.navigation.AlbumDetailsRouteProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object AlbumDetailsRouteProvider {

    @Provides
    @Singleton
    @IntoSet
    fun bindRouteProvider(): FeatureRouteProvider = AlbumDetailsRouteProvider()
}