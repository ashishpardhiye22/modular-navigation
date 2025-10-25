package com.ashdroid.feature.song_details.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ashdroid.common.data.mock.songDetails_1
import com.ashdroid.common.data.model.SongDetails
import com.ashdroid.feature.song_details.ui.components.SongAlbumView
import com.ashdroid.feature.song_details.ui.components.SongArtistView
import com.ashdroid.feature.song_details.ui.components.SongDetailsHeaderView
import com.ashdroid.feature.song_details.ui.components.SongLyricsView
import com.ashdroid.feature.song_details.ui.components.SongTitleView

@Composable
internal fun SongDetailsScreen(
    callback: SongDetailsCallback,
) {
    val viewModel = hiltViewModel<SongDetailsViewModel>()
    val state = viewModel.state.collectAsStateWithLifecycle().value

    when (state.pageState) {
        PageState.Loading -> Unit
        is PageState.Success -> SongDetailsScreen(
            modifier = Modifier.fillMaxWidth(),
            songDetails = state.pageState.songDetails,
            callback = callback,
        )
    }
}

@Composable
private fun SongDetailsScreen(
    modifier: Modifier = Modifier,
    songDetails: SongDetails,
    callback: SongDetailsCallback,
) {
    val horizontalPagePadding = 24.dp
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            SongDetailsHeaderView(
                modifier = Modifier.fillMaxWidth(),
            )
        }
        item {
            SongTitleView(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = horizontalPagePadding,
                        end = horizontalPagePadding,
                        top = 16.dp
                    ),
                title = songDetails.title,
            )
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = horizontalPagePadding,
                        end = horizontalPagePadding,
                        top = 8.dp
                    ),
            ) {
                SongArtistView(
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            songDetails.artists.firstOrNull()?.id?.let {
                                callback.onViewArtistClick.invoke(
                                    it
                                )
                            }
                        },
                    artists = songDetails.artists
                )
                Spacer(modifier = Modifier.width(16.dp))
                SongAlbumView(
                    modifier = Modifier
                        .weight(1f)
                        .clickable {
                            callback.onViewAlbumClick.invoke(songDetails.album.id)
                        },
                    album = songDetails.album,
                )
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
        item {
            SongLyricsView(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = horizontalPagePadding,
                        end = horizontalPagePadding,
                        top = 16.dp
                    ),
                content = songDetails.fullLyrics,
            )
        }
    }

}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Composable
private fun SongDetailsScreenPreview() {
    SongDetailsScreen(
        songDetails = songDetails_1,
        callback = SongDetailsCallback({}, {})
    )
}