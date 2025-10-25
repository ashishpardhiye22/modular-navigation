package com.ashdroid.common.data.repositories

import com.ashdroid.common.data.mock.mockSongListItems
import com.ashdroid.common.data.mock.songDetails_1
import com.ashdroid.common.data.model.SongDetails
import com.ashdroid.common.data.model.SongListItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

internal class SongRepositoryImpl : SongRepository {
    override fun getSongListItems(): Flow<List<SongListItem>> {
        return flowOf(mockSongListItems)
    }

    override fun getSongDetails(songId: Int): Flow<SongDetails> {
        return flowOf(songDetails_1)
    }
}