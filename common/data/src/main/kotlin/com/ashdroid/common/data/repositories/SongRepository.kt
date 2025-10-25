package com.ashdroid.common.data.repositories

import com.ashdroid.common.data.model.SongDetails
import com.ashdroid.common.data.model.SongListItem
import kotlinx.coroutines.flow.Flow

interface SongRepository {
    fun getSongListItems(): Flow<List<SongListItem>>

    fun getSongDetails(songId: Int): Flow<SongDetails>
}