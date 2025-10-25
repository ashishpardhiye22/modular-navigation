package com.ashdroid.feature.dashboard.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ashdroid.feature.dashboard.ui.components.SongListItemView

@Composable
internal fun DashboardScreen(
    navigateToSongDetails: (songId: Int) -> Unit
) {
    val viewModel = hiltViewModel<DashboardViewModel>()
    val state = viewModel.state.collectAsStateWithLifecycle().value

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        state.allSongsList.forEach { songListItem ->
            item {
                SongListItemView(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navigateToSongDetails(songListItem.id)
                        },
                    songListItem = songListItem,
                )

                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}