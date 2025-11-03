package com.ashdroid.feature.song_details.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.ashdroid.common.data.repositories.SongRepository
import com.ashdroid.common.navigation.destinations.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
internal class SongDetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    songRepository: SongRepository,
) : ViewModel() {
    private val songDetailsFlow = songRepository.getSongDetails(
        songId = savedStateHandle.toRoute<Route.SongDetail>().id
    )

    val state: StateFlow<SongDetailsUiState> = songDetailsFlow.map {
        SongDetailsUiState(
            pageState = PageState.Success(songDetails = it)
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000),
        initialValue = SongDetailsUiState(
            pageState = PageState.Loading,
        ),
    )
}