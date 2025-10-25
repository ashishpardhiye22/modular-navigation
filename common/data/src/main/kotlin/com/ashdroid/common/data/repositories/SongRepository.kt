package com.ashdroid.common.data.repositories

import com.ashdroid.common.data.model.SongDetails
import com.ashdroid.common.data.model.SongListItem

interface SongRepository {
    fun getSongListItems(): List<SongListItem>

    fun getSongDetails(songId: Int): SongDetails
}