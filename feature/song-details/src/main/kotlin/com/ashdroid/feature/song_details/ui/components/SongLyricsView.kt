package com.ashdroid.feature.song_details.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashdroid.common.data.mock.songDetails_1


@Composable
internal fun SongLyricsView(
    modifier: Modifier = Modifier,
    content: String,
) {
    Column(modifier = modifier) {

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Lyrics",
            fontSize = 16.sp,
            fontWeight = FontWeight.W500,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = content,
            fontSize = 18.sp,
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Composable
private fun SongLyricsPreview() {
    SongLyricsView(
        content = songDetails_1.fullLyrics,
    )
}