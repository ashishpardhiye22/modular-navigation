package com.ashdroid.feature.song_details.di

import com.ashdroid.common.navigation.FeatureRouteProvider
import com.ashdroid.feature.song_details.navigation.SongDetailsRouteProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object SongDetailsModule {

    @Provides
    @Singleton
    @IntoSet
    fun bindRouteProvider(): FeatureRouteProvider = SongDetailsRouteProvider()
}