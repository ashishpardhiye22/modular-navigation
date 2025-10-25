package com.ashdroid.feature.song_details.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ashdroid.common.data.mock.albumA
import com.ashdroid.common.data.model.Album


@Composable
internal fun SongAlbumView(
    modifier: Modifier = Modifier,
    album: Album,
) {
    Card(
        modifier = modifier,
        border = BorderStroke(width = 1.dp, color = Color.LightGray),
        elevation = CardDefaults.cardElevation(),
        shape = RoundedCornerShape(size = 4.dp),
        colors = CardDefaults.outlinedCardColors()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 16.dp),
        ) {
            Text(
                modifier = Modifier,
                text = "Album",
                fontSize = 16.sp,
                fontWeight = FontWeight.W500,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier,
                text = album.name,
                fontSize = 18.sp,
            )

        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffffff,
)
@Composable
private fun SongAlbumPreview() {
    SongAlbumView(
        album = albumA,
    )
}