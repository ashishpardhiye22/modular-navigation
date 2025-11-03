package com.ashdroid.feature.dashboard.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ashdroid.common.data.repositories.SongRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
internal class DashboardViewModel @Inject constructor(
    songRepository: SongRepository,
) : ViewModel() {
    private val songListFlow = songRepository.getSongListItems()

    val state: StateFlow<DashboardUiState> = songListFlow.map {
        DashboardUiState(
            favoriteSongsList = it.filter { it.isFavorite },
            allSongsList = it,
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000),
        initialValue = DashboardUiState(),
    )
}