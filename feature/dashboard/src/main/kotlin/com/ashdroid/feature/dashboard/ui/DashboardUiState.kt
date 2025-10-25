package com.ashdroid.feature.dashboard.ui

import androidx.compose.runtime.Stable
import com.ashdroid.common.data.model.SongListItem

@Stable
internal data class DashboardUiState(
    val favoriteSongsList: List<SongListItem> = emptyList(),
    val allSongsList: List<SongListItem> = emptyList(),
)
