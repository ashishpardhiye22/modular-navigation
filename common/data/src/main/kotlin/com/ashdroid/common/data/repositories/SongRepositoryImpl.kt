package com.ashdroid.common.data.repositories

import com.ashdroid.common.data.mock.mockSongListItems
import com.ashdroid.common.data.mock.songDetails_1
import com.ashdroid.common.data.model.SongDetails
import com.ashdroid.common.data.model.SongListItem

internal class SongRepositoryImpl : SongRepository {
    override fun getSongListItems(): List<SongListItem> {
        return mockSongListItems
    }

    override fun getSongDetails(songId: Int): SongDetails {
        return songDetails_1
    }
}