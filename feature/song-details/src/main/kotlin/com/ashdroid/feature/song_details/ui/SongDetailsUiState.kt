package com.ashdroid.feature.song_details.ui

import androidx.compose.runtime.Stable
import com.ashdroid.common.data.model.SongDetails

@Stable
internal data class SongDetailsUiState(
    val pageState: PageState,
)

internal sealed interface PageState {
    data object Loading : PageState
    data class Success(
        val songDetails: SongDetails,
    ) : PageState
}