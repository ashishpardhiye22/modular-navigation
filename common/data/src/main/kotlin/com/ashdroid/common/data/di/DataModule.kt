package com.ashdroid.common.data.di

import com.ashdroid.common.data.repositories.SongRepository
import com.ashdroid.common.data.repositories.SongRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal object DataModule {

    @Provides
    @Singleton
    fun bindSongRepository(): SongRepository = SongRepositoryImpl()
}